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




program: PROGRAM ID BRACKET_OPEN sentence* BRACKET_CLOSE;



move_forw: MOVE_FORW NUMBER;
move_back: MOVE_BACK NUMBER;
rot_l: ROT_L NUMBER;
rot_r: ROT_R NUMBER;
set_color: SET_COLOR NUMBER COLON NUMBER COLON NUMBER COLON NUMBER;

var_decl: LET ID
	{
		symbolTable.put($ID.text,0);
		System.out.println("Declarando variable");
	};
	
var_assign: LET? ID ASSIGN ( expression | ID) //corregir esto
	{
		symbolTable.put($ID.text,  $expression.value);
		System.out.println("Asignando valor a variable" + $expression.value);
	};
	

sentence: var_decl | var_assign | println | read;
condition: (NOT PAR_OPEN)? ID (GT|LT|GEQ|LEQ|EQ|NEQ) (expression) PAR_CLOSE?;
conditional: INI_IF condition ((AND|OR) condition)* THEN sentence+ (ELSE sentence+)? END_IF;
cicle: INI_WHILE condition ((AND|OR) condition)* DO sentence+ END_WHILE;

println: PRINTLN expression
	{System.out.println("Imprimiendo por pantalla" + $expression.value);};
read: READ expression
	{System.out.println("Leyendo variable" + $expression.value);};
	
function: INI_FUNC ID PAR_OPEN (ID (COLON ID)*)? PAR_CLOSE TWO_DOTS sentence+ END_FUNC;
execute: ID PAR_OPEN ((expression) (COLON (expression)*))* PAR_CLOSE;

expression returns [Object value]: 
	
	 t1 = expo {$value = (int)$t1.value;} 
	(PLUS t2 = expo {$value = (int)$value + (int)$t2.value;}
	
	| MINUS t2 = expo {$value = (int)$value - (int)$t2.value;})*;
	
	expo returns [Object value]:t1 = factor {$value = (int)$t1.value;} 
	(EXPO t2 = factor {$value = (int)$value ^ (int)$t2.value;})*;
		
	factor returns [Object value]:
	
	t1 = term {$value = (int)$t1.value;} 
	(MULT t2 = term {$value = (int)$value * (int)$t2.value;}
	
	| DIV t2 = term {$value = (int)$value / (int)$t2.value;}
	
	| MOD t2 = term {$value = (int)$value % (int)$t2.value;})*;
	
	
	term returns [Object value]: 
	NUMBER {$value  = Integer.parseInt($NUMBER.text);}
	| STRING {$value = $STRING.text;}
	| BOOLEAN {$value = $BOOLEAN.text;}
	| PAR_OPEN expression PAR_CLOSE;

PROGRAM: 'program';
LET: 'let';
PRINTLN: 'println'; //ver porque esto no corre
READ: 'read';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
EXPO: '^';

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

NUMBER: [0-9]*; //corregir esto [0-9]+(.[0-9]*)?
BOOLEAN: 'true'|'false';
STRING : '"' ( '\\"' | . )*? '"' ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;

MOVE_FORW: 'mov_forw';
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