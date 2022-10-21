antlr4 = java org.antlr.v4.Tool
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java AST.java
GENERATED = hardwaresimulatorListener.java hardwaresimulatorBaseListener.java hardwaresimulatorParser.java hardwaresimulatorLexer.java

all:	
	make test
	
main.class:	$(SRCFILES) $(GENERATED) hardwaresimulator.g4
	javac -Xlint:unchecked $(SRCFILES) $(GENERATED)

hardwaresimulatorLexer.java:	hardwaresimulator.g4
	$(antlr4) hardwaresimulator.g4

hardwaresimulatorListener.java:	hardwaresimulator.g4
	$(antlr4) -visitor hardwaresimulator.g4

hardwaresimulatorLexer.class:	hardwaresimulatorLexer.java
	javac $(GENERATED)

grun:	hardwaresimulatorLexer.class input.txt
	$(grun) hardwaresimulator start -gui -tokens input.txt

hellogrun:	hardwaresimulatorLexer.class helloInput.txt
	$(grun) hardwaresimulator start -gui -tokens helloInput.txt

test:	main.class
	java main input.txt