// Generated from C:/Users/alian/IdeaProjects/TestGrammar/src\banglang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class banglangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, ELSE=7, THEN=8, WHILE=9, 
		INT=10, FLOAT=11, BOOL=12, STRING=13, PLUS=14, MINUS=15, MULTIPLY=16, 
		DIVIDE=17, LESS=18, GREATER=19, EQUAL=20, NOT_EQUAL=21, LESS_EQUAL=22, 
		GREATER_EQUAL=23, AND=24, OR=25, ASSIGN=26, ID=27, INT_LITERAL=28, FLOAT_LITERAL=29, 
		BOOL_LITERAL=30, STRING_LITERAL=31, NULL=32, WS=33, MULTIPLE_OP=34, ADD_OP=35, 
		CONDITION_OP=36, BOOLEAN_OP=37;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_variable = 3, 
		RULE_dataType = 4, RULE_expression = 5, RULE_constant = 6, RULE_multipleOperation = 7, 
		RULE_addOperation = 8, RULE_conditionOperation = 9, RULE_booleanOperation = 10, 
		RULE_ifStatement = 11, RULE_ifelseStatement = 12, RULE_whileLoop = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "variable", "dataType", "expression", 
			"constant", "multipleOperation", "addOperation", "conditionOperation", 
			"booleanOperation", "ifStatement", "ifelseStatement", "whileLoop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'\\u098F\\u09AF\\u09A6\\u09BF'", 
			"'\\u098F\\u09AF\\u09A6\\u09C7'", "'\\u09A4\\u09BE\\u09B9\\u09B2\\u09C7'", 
			"'\\u09AF\\u0995\\u09A8'", "'\\u0987\\u09A8\\u099F'", "'\\u09A6\\u09B6\\u09AE\\u09BF\\u0995'", 
			"'\\u09AC\\u09CB\\u09B2'", "'\\u09AC\\u09BE\\u0995'", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", "'\\u0983\\u0983'", 
			"'\\u09AC\\u09BE'", "'='", null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IF", "ELSE", "THEN", "WHILE", "INT", 
			"FLOAT", "BOOL", "STRING", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "LESS", 
			"GREATER", "EQUAL", "NOT_EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "AND", 
			"OR", "ASSIGN", "ID", "INT_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", 
			"STRING_LITERAL", "NULL", "WS", "MULTIPLE_OP", "ADD_OP", "CONDITION_OP", 
			"BOOLEAN_OP"
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
	public String getGrammarFileName() { return "banglang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public banglangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15936L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				whileLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(banglangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			variable();
			setState(39);
			match(ASSIGN);
			setState(40);
			expression(0);
			setState(41);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(banglangParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			dataType();
			setState(44);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(banglangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(banglangParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(banglangParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(banglangParser.STRING, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLE_OP() { return getToken(banglangParser.MULTIPLE_OP, 0); }
		public MultipleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterMultipleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitMultipleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitMultipleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONDITION_OP() { return getToken(banglangParser.CONDITION_OP, 0); }
		public ConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD_OP() { return getToken(banglangParser.ADD_OP, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndentiferExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(banglangParser.ID, 0); }
		public IndentiferExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterIndentiferExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitIndentiferExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitIndentiferExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BOOLEAN_OP() { return getToken(banglangParser.BOOLEAN_OP, 0); }
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(49);
				constant();
				}
				break;
			case ID:
				{
				_localctx = new IndentiferExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(ID);
				}
				break;
			case T__1:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__1);
				setState(52);
				expression(0);
				setState(53);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultipleExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(58);
						match(MULTIPLE_OP);
						setState(59);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						match(ADD_OP);
						setState(62);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ConditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						match(CONDITION_OP);
						setState(65);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(67);
						match(BOOLEAN_OP);
						setState(68);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(banglangParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(banglangParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(banglangParser.BOOL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(banglangParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(banglangParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleOperationContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(banglangParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(banglangParser.DIVIDE, 0); }
		public MultipleOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterMultipleOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitMultipleOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitMultipleOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleOperationContext multipleOperation() throws RecognitionException {
		MultipleOperationContext _localctx = new MultipleOperationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multipleOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddOperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(banglangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(banglangParser.MINUS, 0); }
		public AddOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterAddOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitAddOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitAddOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOperationContext addOperation() throws RecognitionException {
		AddOperationContext _localctx = new AddOperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionOperationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(banglangParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(banglangParser.NOT_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(banglangParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(banglangParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(banglangParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(banglangParser.GREATER_EQUAL, 0); }
		public ConditionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterConditionOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitConditionOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitConditionOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOperationContext conditionOperation() throws RecognitionException {
		ConditionOperationContext _localctx = new ConditionOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanOperationContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(banglangParser.AND, 0); }
		public TerminalNode OR() { return getToken(banglangParser.OR, 0); }
		public BooleanOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterBooleanOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitBooleanOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitBooleanOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperationContext booleanOperation() throws RecognitionException {
		BooleanOperationContext _localctx = new BooleanOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleanOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(banglangParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(banglangParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(banglangParser.ELSE, 0); }
		public IfelseStatementContext ifelseStatement() {
			return getRuleContext(IfelseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IF);
			setState(85);
			expression(0);
			setState(86);
			match(THEN);
			setState(87);
			match(T__3);
			setState(88);
			statement();
			setState(89);
			match(T__4);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(90);
				match(ELSE);
				setState(91);
				ifelseStatement();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class IfelseStatementContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(banglangParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfelseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterIfelseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitIfelseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitIfelseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseStatementContext ifelseStatement() throws RecognitionException {
		IfelseStatementContext _localctx = new IfelseStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifelseStatement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(THEN);
				setState(95);
				match(T__3);
				setState(96);
				statement();
				setState(97);
				match(T__4);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				ifStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(banglangParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(banglangParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banglangListener ) ((banglangListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof banglangVisitor ) return ((banglangVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHILE);
			setState(103);
			expression(0);
			setState(104);
			match(THEN);
			setState(105);
			match(T__3);
			setState(106);
			statement();
			setState(107);
			match(T__4);
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b\u0000\f"+
		"\u0000\u001f\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"8\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b]\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fe\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0001\n\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0006"+
		"\u0001\u0000\n\r\u0001\u0000\u001c \u0001\u0000\u0010\u0011\u0001\u0000"+
		"\u000e\u000f\u0001\u0000\u0012\u0017\u0001\u0000\u0018\u0019j\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000"+
		"\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000"+
		"\n7\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000"+
		"\u0000\u0000\u0010N\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000"+
		"\u0014R\u0001\u0000\u0000\u0000\u0016T\u0001\u0000\u0000\u0000\u0018d"+
		"\u0001\u0000\u0000\u0000\u001af\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!%\u0003\u0004\u0002\u0000"+
		"\"%\u0003\u0016\u000b\u0000#%\u0003\u001a\r\u0000$!\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001"+
		"\u0000\u0000\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u001a\u0000\u0000"+
		"()\u0003\n\u0005\u0000)*\u0005\u0001\u0000\u0000*\u0005\u0001\u0000\u0000"+
		"\u0000+,\u0003\b\u0004\u0000,-\u0005\u001b\u0000\u0000-\u0007\u0001\u0000"+
		"\u0000\u0000./\u0007\u0000\u0000\u0000/\t\u0001\u0000\u0000\u000001\u0006"+
		"\u0005\uffff\uffff\u000018\u0003\f\u0006\u000028\u0005\u001b\u0000\u0000"+
		"34\u0005\u0002\u0000\u000045\u0003\n\u0005\u000056\u0005\u0003\u0000\u0000"+
		"68\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u000072\u0001\u0000\u0000"+
		"\u000073\u0001\u0000\u0000\u00008G\u0001\u0000\u0000\u00009:\n\u0004\u0000"+
		"\u0000:;\u0005\"\u0000\u0000;F\u0003\n\u0005\u0005<=\n\u0003\u0000\u0000"+
		"=>\u0005#\u0000\u0000>F\u0003\n\u0005\u0004?@\n\u0002\u0000\u0000@A\u0005"+
		"$\u0000\u0000AF\u0003\n\u0005\u0003BC\n\u0001\u0000\u0000CD\u0005%\u0000"+
		"\u0000DF\u0003\n\u0005\u0002E9\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000"+
		"\u0000E?\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u000b"+
		"\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0007\u0001\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000LM\u0007\u0002\u0000\u0000M\u000f\u0001"+
		"\u0000\u0000\u0000NO\u0007\u0003\u0000\u0000O\u0011\u0001\u0000\u0000"+
		"\u0000PQ\u0007\u0004\u0000\u0000Q\u0013\u0001\u0000\u0000\u0000RS\u0007"+
		"\u0005\u0000\u0000S\u0015\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000"+
		"\u0000UV\u0003\n\u0005\u0000VW\u0005\b\u0000\u0000WX\u0005\u0004\u0000"+
		"\u0000XY\u0003\u0002\u0001\u0000Y\\\u0005\u0005\u0000\u0000Z[\u0005\u0007"+
		"\u0000\u0000[]\u0003\u0018\f\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\u0017\u0001\u0000\u0000\u0000^_\u0005\b\u0000\u0000"+
		"_`\u0005\u0004\u0000\u0000`a\u0003\u0002\u0001\u0000ab\u0005\u0005\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ce\u0003\u0016\u000b\u0000d^\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0019\u0001\u0000\u0000\u0000"+
		"fg\u0005\t\u0000\u0000gh\u0003\n\u0005\u0000hi\u0005\b\u0000\u0000ij\u0005"+
		"\u0004\u0000\u0000jk\u0003\u0002\u0001\u0000kl\u0005\u0005\u0000\u0000"+
		"l\u001b\u0001\u0000\u0000\u0000\u0007\u001f$7EG\\d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}