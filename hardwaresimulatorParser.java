// Generated from hardwaresimulator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hardwaresimulatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, VARIABLE=14, NUMBER=15, WHITESPACE=16, 
		COMMENT=17, MULTICOMMENT=18;
	public static final int
		RULE_start = 0, RULE_latch = 1, RULE_update = 2, RULE_newsignal = 3, RULE_sim = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latch", "update", "newsignal", "sim"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'.simulate'", 
			"'.latch'", "'->'", "'='", "'('", "')'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "VARIABLE", "NUMBER", "WHITESPACE", "COMMENT", "MULTICOMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "hardwaresimulator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hardwaresimulatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Token h;
		public Token VARIABLE;
		public List<Token> i = new ArrayList<Token>();
		public List<Token> os = new ArrayList<Token>();
		public LatchContext latch;
		public List<LatchContext> ls = new ArrayList<LatchContext>();
		public UpdateContext update;
		public List<UpdateContext> u = new ArrayList<UpdateContext>();
		public SimContext sim;
		public List<SimContext> s = new ArrayList<SimContext>();
		public TerminalNode EOF() { return getToken(hardwaresimulatorParser.EOF, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(hardwaresimulatorParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(hardwaresimulatorParser.VARIABLE, i);
		}
		public List<LatchContext> latch() {
			return getRuleContexts(LatchContext.class);
		}
		public LatchContext latch(int i) {
			return getRuleContext(LatchContext.class,i);
		}
		public List<UpdateContext> update() {
			return getRuleContexts(UpdateContext.class);
		}
		public UpdateContext update(int i) {
			return getRuleContext(UpdateContext.class,i);
		}
		public List<SimContext> sim() {
			return getRuleContexts(SimContext.class);
		}
		public SimContext sim(int i) {
			return getRuleContext(SimContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			((StartContext)_localctx).h = match(VARIABLE);
			setState(12);
			match(T__1);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				((StartContext)_localctx).VARIABLE = match(VARIABLE);
				((StartContext)_localctx).i.add(((StartContext)_localctx).VARIABLE);
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(18);
			match(T__2);
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				((StartContext)_localctx).VARIABLE = match(VARIABLE);
				((StartContext)_localctx).os.add(((StartContext)_localctx).VARIABLE);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				((StartContext)_localctx).latch = latch();
				((StartContext)_localctx).ls.add(((StartContext)_localctx).latch);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(29);
			match(T__3);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				((StartContext)_localctx).update = update();
				((StartContext)_localctx).u.add(((StartContext)_localctx).update);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(35);
			match(T__4);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((StartContext)_localctx).sim = sim();
				((StartContext)_localctx).s.add(((StartContext)_localctx).sim);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(41);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LatchContext extends ParserRuleContext {
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
	 
		public LatchContext() { }
		public void copyFrom(LatchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LatcherContext extends LatchContext {
		public Token i;
		public Token o;
		public List<TerminalNode> VARIABLE() { return getTokens(hardwaresimulatorParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(hardwaresimulatorParser.VARIABLE, i);
		}
		public LatcherContext(LatchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterLatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitLatcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitLatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latch);
		try {
			_localctx = new LatcherContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__5);
			setState(44);
			((LatcherContext)_localctx).i = match(VARIABLE);
			setState(45);
			match(T__6);
			setState(46);
			((LatcherContext)_localctx).o = match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	 
		public UpdateContext() { }
		public void copyFrom(UpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdaterContext extends UpdateContext {
		public Token o;
		public NewsignalContext n;
		public TerminalNode VARIABLE() { return getToken(hardwaresimulatorParser.VARIABLE, 0); }
		public NewsignalContext newsignal() {
			return getRuleContext(NewsignalContext.class,0);
		}
		public UpdaterContext(UpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterUpdater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitUpdater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitUpdater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_update);
		try {
			_localctx = new UpdaterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((UpdaterContext)_localctx).o = match(VARIABLE);
			setState(49);
			match(T__7);
			setState(50);
			((UpdaterContext)_localctx).n = newsignal(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewsignalContext extends ParserRuleContext {
		public NewsignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newsignal; }
	 
		public NewsignalContext() { }
		public void copyFrom(NewsignalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends NewsignalContext {
		public NewsignalContext new1;
		public NewsignalContext newsignal() {
			return getRuleContext(NewsignalContext.class,0);
		}
		public NotContext(NewsignalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends NewsignalContext {
		public NewsignalContext new1;
		public NewsignalContext new2;
		public List<NewsignalContext> newsignal() {
			return getRuleContexts(NewsignalContext.class);
		}
		public NewsignalContext newsignal(int i) {
			return getRuleContext(NewsignalContext.class,i);
		}
		public OrContext(NewsignalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends NewsignalContext {
		public Token v;
		public TerminalNode VARIABLE() { return getToken(hardwaresimulatorParser.VARIABLE, 0); }
		public VarContext(NewsignalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends NewsignalContext {
		public NewsignalContext new1;
		public NewsignalContext new2;
		public List<NewsignalContext> newsignal() {
			return getRuleContexts(NewsignalContext.class);
		}
		public NewsignalContext newsignal(int i) {
			return getRuleContext(NewsignalContext.class,i);
		}
		public AndContext(NewsignalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends NewsignalContext {
		public NewsignalContext new1;
		public NewsignalContext newsignal() {
			return getRuleContext(NewsignalContext.class,0);
		}
		public ParenthesesContext(NewsignalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewsignalContext newsignal() throws RecognitionException {
		return newsignal(0);
	}

	private NewsignalContext newsignal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NewsignalContext _localctx = new NewsignalContext(_ctx, _parentState);
		NewsignalContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_newsignal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(T__8);
				setState(54);
				((ParenthesesContext)_localctx).new1 = newsignal(0);
				setState(55);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(T__10);
				setState(58);
				((NotContext)_localctx).new1 = newsignal(4);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((VarContext)_localctx).v = match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new NewsignalContext(_parentctx, _parentState));
						((AndContext)_localctx).new1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_newsignal);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						match(T__11);
						setState(64);
						((AndContext)_localctx).new2 = newsignal(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new NewsignalContext(_parentctx, _parentState));
						((OrContext)_localctx).new1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_newsignal);
						setState(65);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(66);
						match(T__12);
						setState(67);
						((OrContext)_localctx).new2 = newsignal(3);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimContext extends ParserRuleContext {
		public Token v;
		public Token n;
		public TerminalNode VARIABLE() { return getToken(hardwaresimulatorParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(hardwaresimulatorParser.NUMBER, 0); }
		public SimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).enterSim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hardwaresimulatorListener ) ((hardwaresimulatorListener)listener).exitSim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hardwaresimulatorVisitor ) return ((hardwaresimulatorVisitor<? extends T>)visitor).visitSim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimContext sim() throws RecognitionException {
		SimContext _localctx = new SimContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((SimContext)_localctx).v = match(VARIABLE);
			setState(74);
			match(T__7);
			setState(75);
			((SimContext)_localctx).n = match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return newsignal_sempred((NewsignalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean newsignal_sempred(NewsignalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000f\b\u0000\u000b"+
		"\u0000\f\u0000\u0010\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000"+
		"\u000b\u0000\f\u0000\u0016\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b"+
		"\u0000\f\u0000\u001b\u0001\u0000\u0001\u0000\u0004\u0000 \b\u0000\u000b"+
		"\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0004\u0000&\b\u0000\u000b\u0000"+
		"\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003E\b\u0003"+
		"\n\u0003\f\u0003H\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0000\u0001\u0006\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000"+
		"Q\u0000\n\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004"+
		"0\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\bI\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005\u000e\u0000"+
		"\u0000\f\u000e\u0005\u0002\u0000\u0000\r\u000f\u0005\u000e\u0000\u0000"+
		"\u000e\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0005\u0003\u0000\u0000\u0013"+
		"\u0015\u0005\u000e\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001f\u0005\u0004\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0005"+
		"\u0005\u0000\u0000$&\u0003\b\u0004\u0000%$\u0001\u0000\u0000\u0000&\'"+
		"\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0005\u000e\u0000\u0000"+
		"-.\u0005\u0007\u0000\u0000./\u0005\u000e\u0000\u0000/\u0003\u0001\u0000"+
		"\u0000\u000001\u0005\u000e\u0000\u000012\u0005\b\u0000\u000023\u0003\u0006"+
		"\u0003\u00003\u0005\u0001\u0000\u0000\u000045\u0006\u0003\uffff\uffff"+
		"\u000056\u0005\t\u0000\u000067\u0003\u0006\u0003\u000078\u0005\n\u0000"+
		"\u00008=\u0001\u0000\u0000\u00009:\u0005\u000b\u0000\u0000:=\u0003\u0006"+
		"\u0003\u0004;=\u0005\u000e\u0000\u0000<4\u0001\u0000\u0000\u0000<9\u0001"+
		"\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=F\u0001\u0000\u0000\u0000"+
		">?\n\u0003\u0000\u0000?@\u0005\f\u0000\u0000@E\u0003\u0006\u0003\u0004"+
		"AB\n\u0002\u0000\u0000BC\u0005\r\u0000\u0000CE\u0003\u0006\u0003\u0003"+
		"D>\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u000e\u0000\u0000"+
		"JK\u0005\b\u0000\u0000KL\u0005\u000f\u0000\u0000L\t\u0001\u0000\u0000"+
		"\u0000\b\u0010\u0016\u001b!\'<DF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}