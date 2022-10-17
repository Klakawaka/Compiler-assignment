// Generated from hardwaresimulator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hardwaresimulatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hardwaresimulatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hardwaresimulatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(hardwaresimulatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Latcher}
	 * labeled alternative in {@link hardwaresimulatorParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatcher(hardwaresimulatorParser.LatcherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Updater}
	 * labeled alternative in {@link hardwaresimulatorParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdater(hardwaresimulatorParser.UpdaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(hardwaresimulatorParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(hardwaresimulatorParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(hardwaresimulatorParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(hardwaresimulatorParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(hardwaresimulatorParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link hardwaresimulatorParser#sim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSim(hardwaresimulatorParser.SimContext ctx);
}