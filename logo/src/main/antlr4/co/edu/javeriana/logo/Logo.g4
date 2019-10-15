grammar Logo;

@parser::header {
	
	import java.util.Map;
	import java.util.HashMap;
	import co.edu.javeriana.logo.ast.*;
	import co.edu.javeriana.logo.scope.Context;

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
			Context symbolTable = new Context();
		}
		(sentence {body.add($sentence.node);})*
		{
			for(ASTNode n : body){
				n.execute(symbolTable);
			}
		};
sentence returns [ASTNode node ]: 
				move_forw {$node = $move_forw.node;}
				| move_back {$node = $move_back.node;}
				| rot_l {$node = $rot_l.node;}
				| rot_r {$node = $rot_r.node;}
				| set_color {$node = $set_color.node;}
				| var_decl {$node = $var_decl.node;}
				| var_assign {$node = $var_assign.node;}
				| println {$node = $println.node;}
				| read {$node = $read.node;}
				| conditional{$node = $conditional.node;}
				| cicle {$node = $cicle.node;};

conditional returns [ASTNode node ]: INI_IF expression THEN
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
						$node = new If($expression.node,body,elsebody);
					}
				END_IF;
				
				
cicle returns [ASTNode node ]: INI_WHILE expression DO 
					{
						List<ASTNode> body = new ArrayList<ASTNode>();	
					}
					(f1 = sentence {body.add($f1.node);})+					
					{
						$node = new Cicle($expression.node,body);
						
					}END_WHILE;
function_def: INI_FUNC ID PAR_OPEN (ID (COLON ID)*)? PAR_CLOSE TWO_DOTS sentence+ END_FUNC;

function_call: ID PAR_OPEN ((expression) (COLON (expression)*))* PAR_CLOSE;

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

var_decl returns  [ASTNode node ]: LET ID (ASSIGN expression)?{
	$node = new VarDecl($ID.text, $expression.node);
};
	
var_assign returns  [ASTNode node ]: ID ASSIGN expression{
	$node = new VarAssign($ID.text, $expression.node);
};

println returns [ASTNode node ]: PRINTLN expression
	{$node = new Println($expression.node);
};
	
read returns [ASTNode node]: READ ID
	{$node = new Read($ID.text);
};

expression returns [ASTNode node]:
	arithmic_expression {$node = $arithmic_expression.node;}
	| boolean_expression {$node = $boolean_expression.node;}
	//| function {$node = $function.node;}
	;
	
arithmic_expression returns [ASTNode node]:
	factor {$node = $factor.node;}
	| t1=arithmic_expression PLUS t2=arithmic_expression {$node=new Addition($t1.node,$t2.node);}
	| t3=arithmic_expression MINUS t4=arithmic_expression {$node= new Minus($t3.node,$t4.node);};

factor returns [ASTNode node]:
	term {$node=$term.node;}
	| additive_inverse {$node=$additive_inverse.node;}
	| t1=factor MULT t2=factor {$node=new Multiplication($t1.node,$t2.node);}
	| t3=factor DIV t4=factor {$node=new Divition($t3.node,$t4.node);};

additive_inverse returns [ASTNode node]:
	MINUS term {$node=new AdditiveInverse($term.node);};

boolean_expression returns [ASTNode node]:
	comparation {$node=$comparation.node;}
	| t1=boolean_expression AND t2=boolean_expression {$node=new And($t1.node,$t2.node);}
	| t1=boolean_expression OR t2=boolean_expression {$node = new Or($t1.node,$t2.node);}
	| NOT boolean_expression {$node=new Not($comparation.node);};

comparation returns [ASTNode node]:
	arithmic_expression {$node = $arithmic_expression.node;}
	| t1=comparation GT t2=comparation {$node = new Greater($t1.node,$t2.node);}
	| t1=comparation LT t2=comparation {$node = new Less($t1.node,$t2.node);}
	| t1=comparation GEQ t2=comparation {$node = new GreaterEqual($t1.node,$t2.node);}
	| t1=comparation LEQ t2=comparation {$node = new LessEqual($t1.node,$t2.node);}
	| t1=comparation EQ t2=comparation {$node = new Equal($t1.node,$t2.node);}
	| t1=comparation NEQ t2=comparation {$node = new Different($t1.node,$t2.node);};

term returns [ASTNode node]:
	NUMBER {$node = new Constant(Float.parseFloat($NUMBER.text));}
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| STRING {$node = new Constant(String.valueOf($STRING.text).replace("\"","") );}
	| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE
	| ID {$node = new VarRef($ID.text);}
	//| function {$node = $function.node;}
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