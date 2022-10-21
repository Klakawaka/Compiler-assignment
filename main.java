import jdk.swing.interop.SwingInterOpUtils;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        // we expect exactly one argument: the name of the input file
        if (args.length != 1) {
            System.err.println("\n");
            System.err.println("Simple calculator\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename = args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        // new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        hardwaresimulatorLexer lex = new hardwaresimulatorLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        hardwaresimulatorParser parser = new hardwaresimulatorParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // A maker for an Abstract Syntax Tree (AST)
        Interpreter interpreter = new Interpreter();
        AST ast = interpreter.visit(parseTree);

    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Integer.

class Interpreter extends AbstractParseTreeVisitor<AST> implements hardwaresimulatorVisitor<AST> {


    public AST visitStart(hardwaresimulatorParser.StartContext ctx) {

        List<String> inputs = new ArrayList<>();
        List<String> outputs = new ArrayList<>();
        List<Latch> latches = new ArrayList<>();
        List<Update> updates = new ArrayList<>();
        List<Simulation> simulations = new ArrayList<>();

        for (Token inputToken : ctx.i) {
            inputs.add(inputToken.getText());
        }

        for (Token outputToken : ctx.os) {
            outputs.add(outputToken.getText());
        }

        for (int i = 0; i < ctx.ls.size(); i++) {
            Latch latch = (Latch) visit(ctx.ls.get(i));
            latches.add(latch);
        }

        for (int i = 0; i < ctx.u.size(); i++) {
            Update update = (Update) visitUpdater((hardwaresimulatorParser.UpdaterContext) ctx.u.get(i));
            updates.add(update);
        }

        for (int i = 0; i < ctx.s.size(); i++) {
            Simulation simulation = (Simulation) visitSim(ctx.s.get(i));
            simulations.add(simulation);
        }

        return new Start(inputs, outputs, latches, updates, simulations, new Environment());
    }

	@Override
	public AST visitLatcher(hardwaresimulatorParser.LatcherContext ctx) {
        Variable var1 = new Variable(ctx.i.getText());
		Variable var2 = new Variable(ctx.o.getText());

		return new Latch(var1, var2);
	}

	@Override
	public AST visitUpdater(hardwaresimulatorParser.UpdaterContext ctx) {
		return new Update(ctx.o.getText(), (NewSignal) visit(ctx.n));
	}

	@Override
	public AST visitSim(hardwaresimulatorParser.SimContext ctx) {
		return new Simulation(ctx.v.getText(), ctx.n.getText());
	}

	@Override
	public AST visitNot(hardwaresimulatorParser.NotContext ctx) {
		return new Not((NewSignal) visit(ctx.new1));
	}

	@Override
	public AST visitOr(hardwaresimulatorParser.OrContext ctx) {
		return new LogicalOr((NewSignal) visit(ctx.new1), (NewSignal) visit(ctx.new2));
	}

	@Override
	public AST visitAnd(hardwaresimulatorParser.AndContext ctx) {
		return new LogicalAnd((NewSignal) visit(ctx.new1), (NewSignal) visit(ctx.new2));
	}

	@Override
	public AST visitVar(hardwaresimulatorParser.VarContext ctx) {
		return new Variable(ctx.v.getText());
	}

	@Override
	public AST visitParentheses(hardwaresimulatorParser.ParenthesesContext ctx) {
		return visit(ctx.new1);
	}
}
