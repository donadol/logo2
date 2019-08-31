grammar Logo;


@parser::members {

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

var_decl: LET ID;
var_assign: LET? ID ASSIGN NUMBER|STRING;

sentence: var_decl | var_assign | println | read;
condition: (NOT PAR_OPEN)? ID (GT|LT|GEQ|LEQ|EQ|NEQ) (NUMBER|ID|STRING|BOOLEAN) PAR_CLOSE?;
conditional: INI_IF condition ((AND|OR) condition)* THEN sentence+ (ELSE sentence+)? END_IF;
cicle: INI_WHILE condition ((AND|OR) condition)* DO sentence+ END_WHILE;

println: PRINTLN ID;
read: READ ID;

function: INI_FUNC ID PAR_OPEN (ID (COLON ID)*)? PAR_CLOSE TWO_DOTS sentence+ END_FUNC;
execute: ID PAR_OPEN ((NUMBER|STRING|BOOLEAN) (COLON (NUMBER|STRING|BOOLEAN)*))* PAR_CLOSE;

PROGRAM: 'program';
LET: 'let';
PRINTLN: 'println';
READ: 'read';

PLUS: '+';
MINUS: '-';
MULTI: '*';
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

NUMBER: [0-9]+(.[0-9]*)?;
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