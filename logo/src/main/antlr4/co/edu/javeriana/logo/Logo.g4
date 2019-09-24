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


program:{
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




condition returns [ASTNode node ]: (NOT PAR_OPEN)? (ID|expression{$node = $expression.node;}
) (GT|LT|GEQ|LEQ|EQ|NEQ) (ID|t2 = expression{$node = $t2.node;}) PAR_CLOSE?;

conditional returns [ASTNode node ]: INI_IF condition ((AND|OR) condition)* THEN
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

expression returns [ASTNode node]:
	arithm_exp {$node = $arithm_exp.node;}
	| boolean_exp {$node = $boolean_exp.node;}
	| function {$node = $function.node;};
	
arithm_exp returns [ASTNode node]:
	factor {$node = $factor.node;}
	| t1=arithm_exp PLUS t2=arithm_exp {$node=new Addition($t1.node,$t2.node);}
	| t3=arithm_exp MINUS t4=arithm_exp {$node= new Minus($t3.node,$t4.node);};


factor returns [ASTNode node]:
	additive_inverse {$node=$additive_inverse.node;}
	| t1=factor MULT t2=factor {$node=new Multiplication($t1.node,$t2.node);}
	| t3=factor DIV t4=factor {$node=new Division($t3.node,$t4.node);};

additive_inverse returns [ASTNode node]:
	term {$node=$term.node;}
	| MINUS term {$node=new AdditiveInverse($term.node);};

boolean_exp returns [ASTNode node]:
	and {$node = $and.node;}
	| t1=boolean_exp OR t2=boolean_exp {$node = new Or($t1.node,$t2.node);};

and returns [ASTNode node]:
	not {$node=$not.node;}
	| t1=and AND t2=and {$node=new And($t1.node,$t2.node);};

not returns [ASTNode node]:
	comparation {$node=$comparation.node;}
	|NOT comparation {$node=new Not($comparation.node);};

comparation returns [ASTNode node]:
	arithm_exp {$node = $arithm_exp.node;}
	| t1=comparation GT t2=comparation {$node = new Greater($t1.node,$t2.node);}
	| t1=comparation LT t2=comparation {$node = new Less($t1.node,$t2.node);}
	| t1=comparation GEQ t2=comparation {$node = new GreaterEq($t1.node,$t2.node);}
	| t1=comparation LEQ t2=comparation {$node = new LessEq($t1.node,$t2.node);}
	| t1=comparation EQ t2=comparation {$node = new Equal($t1.node,$t2.node);}
	| t1=comparation NEQ t2=comparation {$node = new Different($t1.node,$t2.node);}
;

term returns [ASTNode node]:
	NUMBER {$node = new Constant(Double.parseDouble($NUMBER.text));}
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| STRING {$node = new Constant(String.valueOf($STRING.text).replace("\"","") );}
	| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE
	| ID {$node = new VarRef($ID.text);}
	| function {$node = $function.node;}
;

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