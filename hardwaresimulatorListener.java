// Generated from hardwaresimulator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hardwaresimulatorParser}.
 */
public interface hardwaresimulatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hardwaresimulatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(hardwaresimulatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardwaresimulatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(hardwaresimulatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Latcher}
	 * labeled alternative in {@link hardwaresimulatorParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatcher(hardwaresimulatorParser.LatcherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Latcher}
	 * labeled alternative in {@link hardwaresimulatorParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatcher(hardwaresimulatorParser.LatcherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Updater}
	 * labeled alternative in {@link hardwaresimulatorParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdater(hardwaresimulatorParser.UpdaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Updater}
	 * labeled alternative in {@link hardwaresimulatorParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdater(hardwaresimulatorParser.UpdaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void enterNot(hardwaresimulatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void exitNot(hardwaresimulatorParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void enterOr(hardwaresimulatorParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void exitOr(hardwaresimulatorParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void enterVar(hardwaresimulatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void exitVar(hardwaresimulatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void enterAnd(hardwaresimulatorParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void exitAnd(hardwaresimulatorParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(hardwaresimulatorParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link hardwaresimulatorParser#newsignal}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(hardwaresimulatorParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link hardwaresimulatorParser#sim}.
	 * @param ctx the parse tree
	 */
	void enterSim(hardwaresimulatorParser.SimContext ctx);
	/**
	 * Exit a parse tree produced by {@link hardwaresimulatorParser#sim}.
	 * @param ctx the parse tree
	 */
	void exitSim(hardwaresimulatorParser.SimContext ctx);
}