grammar hardwaresimulator;

// Parser:
start   : '.hardware' h=VARIABLE '.inputs' i+=VARIABLE+ '.outputs' os+=VARIABLE+ ls+=latch+ '.update' u+=update+ '.simulate' s+=sim+ EOF;

latch : '.latch' i=VARIABLE '->' o=VARIABLE #Latcher;

update : o=VARIABLE '=' n=newsignal #Updater;

newsignal : '(' new1=newsignal ')' # Parentheses
         | '!' new1=newsignal # Not
         | new1=newsignal '&&' new2=newsignal # And
         | new1=newsignal '||' new2=newsignal # Or
         | v=VARIABLE # Var
         ; 

sim : v=VARIABLE '=' n=NUMBER ;

// Lexer:

VARIABLE : [a-zA-Z]+ ; 

NUMBER : ('0' | '1')+ ; 

WHITESPACE : [ \t\n\r] -> skip ;

COMMENT : '//' ~[\n]* -> skip ;

MULTICOMMENT : '/*' ((~[*]) | ('*'~[/]))*  '*/' -> skip ;