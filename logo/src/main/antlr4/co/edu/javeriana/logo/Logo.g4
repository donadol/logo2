grammar Logo;

@parser::header {
	
	import java.util.Map;
	import java.util.HashMap;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
	private Turtle turtle;
	
	public LogoParser(TokenStream input, Turtle turtle) {
	    this(input);
	    this.turtle = turtle;
	}
}


program: sentence*;

move_forw: MOVE_FORW expression {
	System.out.println("me estoy moviendo");
	turtle.forward((float)$expression.value);
};

move_back: MOVE_BACK expression {
	System.out.println("me estoy moviendo");
	turtle.backwards((float)$expression.value);
};

rot_l: ROT_L expression {
	System.out.println("me estoy moviendo");
	turtle.left((float)$expression.value);
};

rot_r: ROT_R expression {
	System.out.println("me estoy moviendo");
	turtle.right((float)$expression.value);
};

set_color: SET_COLOR c1=expression COLON c2=expression COLON c3=expression COLON c4=expression{
	System.out.println("cambio color");
	turtle.color((float)$c1.value, (float)$c2.value, (float)$c3.value, (float)$c4.value);
};

var_decl: LET ID
	{
		symbolTable.put($ID.text,0);
		System.out.println("Declarando variable");
	};
	
var_assign: LET? ID ASSIGN expression
	{
		symbolTable.put($ID.text,  $expression.value);
		System.out.println("Asignando valor a variable " + $expression.value);
	};
	

sentence: move_forw | move_back | rot_l | rot_r | set_color | var_decl | var_assign | println | read;
condition: (NOT PAR_OPEN)? ID (GT|LT|GEQ|LEQ|EQ|NEQ) (expression) PAR_CLOSE?;
conditional: INI_IF condition ((AND|OR) condition)* THEN sentence+ (ELSE sentence+)? END_IF;
cicle: INI_WHILE condition ((AND|OR) condition)* DO sentence+ END_WHILE;

println: PRINTLN expression
	{System.out.println("Imprimiendo por pantalla " + $expression.value);};
read: READ expression
	{System.out.println("Leyendo variable " + $expression.value);};
	
function: INI_FUNC ID PAR_OPEN (ID (COLON ID)*)? PAR_CLOSE TWO_DOTS sentence+ END_FUNC;
execute: ID PAR_OPEN ((expression) (COLON (expression)*))* PAR_CLOSE;
/*
expression returns [Object value]: 
	expression  (MULT | DIV)  expression
   | expression  (PLUS | MINUS) expression
   | PAR_OPEN expression PAR_CLOSE
   | MINUS? NUMBER {$value  = Double.parseDouble($NUMBER.text);}
   | STRING {$value = $STRING.text;}
   | BOOLEAN {$value = $BOOLEAN.text;}
   | ID {$value = symbolTable.get($ID.text);};
*/
expression returns [Object value]: 
	t1 = factor {$value = (float)$t1.value;} 
	(PLUS t2 = factor {$value = (float)$value + (float)$t2.value;}
	| MINUS t2 = factor {$value = (float)$value - (float)$t2.value;})*;
	
	factor returns [Object value]:
	t1 = term {$value = (float)$t1.value;} 
	(MULT t2 = term {$value = (float)$value * (float)$t2.value;}
	| DIV t2 = term {$value = (float)$value / (float)$t2.value;})*;
	
	term returns [Object value]: 
	NUMBER {$value  = Float.parseFloat($NUMBER.text);}
	| STRING {$value = $STRING.text;}
	| BOOLEAN {$value = $BOOLEAN.text;}
	| ID {$value = symbolTable.get($ID.text);}
	| PAR_OPEN expression {$value = $expression.value;} PAR_CLOSE;

LET: 'let';
PRINTLN: 'println';
READ: 'read';
MOVE_FORW: 'move_forw';
MOVE_BACK: 'move_back';
ROT_L: 'rot_l';
ROT_R: 'rot_r';
SET_COLOR: 'set_color';

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

INI_IF: 'if';
THEN: 'then';
ELSE: 'else';
END_IF: 'end_if';

INI_WHILE: 'while';
DO: 'do';
END_WHILE: 'end_while';

INI_FUNC:'def';
END_FUNC: 'end_def';

WS: [ \t\r\n]+ -> skip;