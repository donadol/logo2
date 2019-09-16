grammar Logo;

@parser::header {
	
	import java.util.Map;
	import java.util.HashMap;
	import co.edu.javeriana.logo.ast.*;

}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
	private Turtle turtle;
	
	public LogoParser(TokenStream input, Turtle turtle) {
	    this(input);
	    this.turtle = turtle;
	}
}


program:
					{
						List<ASTNode> body = new ArrayList<ASTNode>();
						Map <String, Object> symbolTable = new HashMap<String, Object>();
					}
					(sentence {body.add($sentence.node);})*
					{
						for(ASTNode n : body){
							n.execute(symbolTable);
						}
					};
sentence returns [ASTNode node ]: move_forw {$node = $move_forw.node;}| move_back {$node = $move_back.node;}| rot_l {$node = $rot_l.node;}| rot_r {$node = $rot_r.node;}| set_color {$node = $set_color.node;}| var_decl {$node = $var_decl.node;}  | var_assign {$node = $var_assign.node;}  | println {$node = $println.node;} | read | conditional{$node = $conditional.node;} | cicle;




condition returns [ASTNode node ]: (NOT PAR_OPEN)? (ID|expression) (GT|LT|GEQ|LEQ|EQ|NEQ) (expression) PAR_CLOSE?;
conditional returns [ASTNode node ]: INI_IF condition ((AND|OR) condition)* 
					{
						List<ASTNode> body = new ArrayList<ASTNode>();
					}
					(s1 = sentence {body.add($s1.node);})+
					
					{
						List<ASTNode> elsebody = new ArrayList<ASTNode>();
					}

				(ELSE 
					(s2 = sentence {elsebody.add($s2.node);})+)?
					{
						$node = new If($condition.node,body,elsebody);
					}
				END_IF;
cicle: INI_WHILE condition ((AND|OR) condition)* DO sentence+ END_WHILE;
function: INI_FUNC ID PAR_OPEN (ID (COLON ID)*)? PAR_CLOSE TWO_DOTS sentence+ END_FUNC;
execute: ID PAR_OPEN ((expression) (COLON (expression)*))* PAR_CLOSE;

move_forw returns [ASTNode node]: MOVE_FORW expression {
	$node = new MoveForw($expression.node, turtle);
};

move_back returns [ASTNode node]: MOVE_BACK expression {
	$node = new MoveBack($expression.node, turtle);
};

rot_l returns [ASTNode node]: ROT_L expression {
	$node = new RotL($expression.node, turtle);
};

rot_r returns [ASTNode node]: ROT_R expression {
	$node = new RotR($expression.node, turtle);
};

set_color returns [ASTNode node]: SET_COLOR c1=expression COLON c2=expression COLON c3=expression COLON c4=expression{
	$node = new setColor($c1.node,$c2.node,$c3.node,$c4.node, turtle);
};

var_decl returns  [ASTNode node ]: LET ID{
	$node = new VarDecl($ID.text);
};
	
var_assign returns  [ASTNode node ]: LET? ID ASSIGN expression{
	$node = new VarAssign($ID.text, $expression.node);
};

println returns [ASTNode node ]: PRINTLN expression

	{$node = new Println($expression.node);};
read: READ expression
	{};


expression returns [ASTNode node ]: 
	t1 = factor {$node = $t1.node;} 
	(PLUS t2 = factor {$node = new Addition($node, $t2.node);}
	| MINUS t2 = factor {$node = new Minus($node, $t2.node);})*;
	
	factor returns [ASTNode node ]:
	t1 = term {$node = $t1.node;} 
	(MULT t2 = term {$node = new Multiplication($node, $t2.node);}
	| DIV t2 = term {$node = new Divition($node, $t2.node);})*;
	
	term returns [ASTNode node ]: 
	NUMBER {$node = new Constant(Float.parseFloat($NUMBER.text));}
	| STRING {$node = new Constant(($STRING.text));}
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| ID {$node = new VarRef($ID.text);}
	| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE;

LET: 'let';
PRINTLN: 'println';
READ: 'read';

MOVE_FORW: 'move_forw';
MOVE_BACK: 'move_back';
ROT_L: 'rot_l';
ROT_R: 'rot_r';
SET_COLOR: 'set_color';

INI_IF: 'if';
THEN: 'then';
ELSE: 'else';
END_IF: 'end_if';

INI_WHILE: 'while';
DO: 'do';
END_WHILE: 'end_while';

INI_FUNC:'def';
END_FUNC: 'end_def';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '<>';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

COLON: ',';
SEMICOLON: ';';
TWO_DOTS: ':';

NUMBER: [0-9]+('.'[0-9]+)?;
BOOLEAN: 'true'|'false';
STRING : '"' ( '\\"' | . )*? '"' ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;