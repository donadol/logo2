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
	
var_assign: LET? ID ASSIGN expression
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
	{System.out.println("Leyendo variable" + $expression.value);}; // arreglar
	
function: INI_FUNC ID PAR_OPEN (ID (COLON ID)*)? PAR_CLOSE TWO_DOTS sentence+ END_FUNC;
execute: ID PAR_OPEN ((expression) (COLON (expression)*))* PAR_CLOSE;

expression returns [Object value]: 
	expression  (MULT | DIV)  expression
   | expression  (PLUS | MINUS) expression
   | PAR_OPEN expression PAR_CLOSE
	
	| NUMBER {$value  = Double.parseDouble($NUMBER.text);}
	| STRING {$value = $STRING.text;}
	| BOOLEAN {$value = $BOOLEAN.text;}
	| ID {$value = symbolTable.get($ID.text);};

PROGRAM: 'program';
LET: 'let';
PRINTLN: 'println'; //ver porque esto no corre
READ: 'read';

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

NUMBER: [0-9]+(.[0-9]+)?;
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