// Generated from C:/Users/alian/IdeaProjects/TestGrammar/src\banglang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class banglangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, ELSE=7, THEN=8, WHILE=9, 
		INT=10, FLOAT=11, BOOL=12, STRING=13, PLUS=14, MINUS=15, MULTIPLY=16, 
		DIVIDE=17, LESS=18, GREATER=19, EQUAL=20, NOT_EQUAL=21, LESS_EQUAL=22, 
		GREATER_EQUAL=23, AND=24, OR=25, ASSIGN=26, ID=27, INT_LITERAL=28, FLOAT_LITERAL=29, 
		BOOL_LITERAL=30, STRING_LITERAL=31, NULL=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "IF", "ELSE", "THEN", "WHILE", 
			"INT", "FLOAT", "BOOL", "STRING", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"LESS", "GREATER", "EQUAL", "NOT_EQUAL", "LESS_EQUAL", "GREATER_EQUAL", 
			"AND", "OR", "ASSIGN", "BANGLA_LETTER", "BANGLA_DIGIT", "ID", "INT_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NULL", "WS"
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
			"STRING_LITERAL", "NULL", "WS"
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


	public banglangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "banglang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000!\u00d3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u009f\b\u001c"+
		"\n\u001c\f\u001c\u00a2\t\u001c\u0001\u001d\u0004\u001d\u00a5\b\u001d\u000b"+
		"\u001d\f\u001d\u00a6\u0001\u001e\u0004\u001e\u00aa\b\u001e\u000b\u001e"+
		"\f\u001e\u00ab\u0001\u001e\u0001\u001e\u0004\u001e\u00b0\b\u001e\u000b"+
		"\u001e\f\u001e\u00b1\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u00bd"+
		"\b\u001f\u0001 \u0001 \u0005 \u00c1\b \n \f \u00c4\t \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0004\"\u00ce\b\"\u000b\"\f\"\u00cf"+
		"\u0001\"\u0001\"\u0000\u0000#\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u00007\u00009\u001b"+
		";\u001c=\u001d?\u001eA\u001fC E!\u0001\u0000\u0005\u0007\u0000\u0985\u098c"+
		"\u098f\u099d\u099f\u09b9\u09be\u09cc\u09ce\u09ce\u09dc\u09e3\u09e6\u09ef"+
		"\u0001\u0000\u09e6\u09ef\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\r\r  \u00d8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000\u0000\u0003I\u0001"+
		"\u0000\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000"+
		"\u0000\tO\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rV\u0001"+
		"\u0000\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000"+
		"\u0000\u0013e\u0001\u0000\u0000\u0000\u0015i\u0001\u0000\u0000\u0000\u0017"+
		"o\u0001\u0000\u0000\u0000\u0019s\u0001\u0000\u0000\u0000\u001bw\u0001"+
		"\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000"+
		"\u0000!}\u0001\u0000\u0000\u0000#\u007f\u0001\u0000\u0000\u0000%\u0081"+
		"\u0001\u0000\u0000\u0000\'\u0083\u0001\u0000\u0000\u0000)\u0086\u0001"+
		"\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-\u008c\u0001\u0000\u0000"+
		"\u0000/\u008f\u0001\u0000\u0000\u00001\u0092\u0001\u0000\u0000\u00003"+
		"\u0095\u0001\u0000\u0000\u00005\u0097\u0001\u0000\u0000\u00007\u0099\u0001"+
		"\u0000\u0000\u00009\u009b\u0001\u0000\u0000\u0000;\u00a4\u0001\u0000\u0000"+
		"\u0000=\u00a9\u0001\u0000\u0000\u0000?\u00bc\u0001\u0000\u0000\u0000A"+
		"\u00be\u0001\u0000\u0000\u0000C\u00c7\u0001\u0000\u0000\u0000E\u00cd\u0001"+
		"\u0000\u0000\u0000GH\u0005;\u0000\u0000H\u0002\u0001\u0000\u0000\u0000"+
		"IJ\u0005(\u0000\u0000J\u0004\u0001\u0000\u0000\u0000KL\u0005)\u0000\u0000"+
		"L\u0006\u0001\u0000\u0000\u0000MN\u0005{\u0000\u0000N\b\u0001\u0000\u0000"+
		"\u0000OP\u0005}\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005\u098f\u0000"+
		"\u0000RS\u0005\u09af\u0000\u0000ST\u0005\u09a6\u0000\u0000TU\u0005\u09bf"+
		"\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005\u098f\u0000\u0000WX\u0005"+
		"\u09af\u0000\u0000XY\u0005\u09a6\u0000\u0000YZ\u0005\u09c7\u0000\u0000"+
		"Z\u000e\u0001\u0000\u0000\u0000[\\\u0005\u09a4\u0000\u0000\\]\u0005\u09be"+
		"\u0000\u0000]^\u0005\u09b9\u0000\u0000^_\u0005\u09b2\u0000\u0000_`\u0005"+
		"\u09c7\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005\u09af\u0000"+
		"\u0000bc\u0005\u0995\u0000\u0000cd\u0005\u09a8\u0000\u0000d\u0012\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0987\u0000\u0000fg\u0005\u09a8\u0000\u0000"+
		"gh\u0005\u099f\u0000\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0005\u09a6"+
		"\u0000\u0000jk\u0005\u09b6\u0000\u0000kl\u0005\u09ae\u0000\u0000lm\u0005"+
		"\u09bf\u0000\u0000mn\u0005\u0995\u0000\u0000n\u0016\u0001\u0000\u0000"+
		"\u0000op\u0005\u09ac\u0000\u0000pq\u0005\u09cb\u0000\u0000qr\u0005\u09b2"+
		"\u0000\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005\u09ac\u0000\u0000"+
		"tu\u0005\u09be\u0000\u0000uv\u0005\u0995\u0000\u0000v\u001a\u0001\u0000"+
		"\u0000\u0000wx\u0005+\u0000\u0000x\u001c\u0001\u0000\u0000\u0000yz\u0005"+
		"-\u0000\u0000z\u001e\u0001\u0000\u0000\u0000{|\u0005*\u0000\u0000| \u0001"+
		"\u0000\u0000\u0000}~\u0005/\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005<\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		">\u0000\u0000\u0082&\u0001\u0000\u0000\u0000\u0083\u0084\u0005=\u0000"+
		"\u0000\u0084\u0085\u0005=\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005!\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088*\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005<\u0000\u0000\u008a\u008b\u0005=\u0000"+
		"\u0000\u008b,\u0001\u0000\u0000\u0000\u008c\u008d\u0005>\u0000\u0000\u008d"+
		"\u008e\u0005=\u0000\u0000\u008e.\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u0983\u0000\u0000\u0090\u0091\u0005\u0983\u0000\u0000\u00910\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u09ac\u0000\u0000\u0093\u0094\u0005\u09be"+
		"\u0000\u0000\u00942\u0001\u0000\u0000\u0000\u0095\u0096\u0005=\u0000\u0000"+
		"\u00964\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0000\u0000\u0000\u0098"+
		"6\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0001\u0000\u0000\u009a8\u0001"+
		"\u0000\u0000\u0000\u009b\u00a0\u00035\u001a\u0000\u009c\u009f\u00035\u001a"+
		"\u0000\u009d\u009f\u00037\u001b\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1:\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0007\u0002\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7<\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0007\u0002\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0005.\u0000\u0000\u00ae\u00b0\u0007\u0002\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2>\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u09b8\u0000\u0000\u00b4\u00b5\u0005\u09a4"+
		"\u0000\u0000\u00b5\u00bd\u0005\u09af\u0000\u0000\u00b6\u00b7\u0005\u09ae"+
		"\u0000\u0000\u00b7\u00b8\u0005\u09bf\u0000\u0000\u00b8\u00b9\u0005\u09a5"+
		"\u0000\u0000\u00b9\u00ba\u0005\u09cd\u0000\u0000\u00ba\u00bb\u0005\u09af"+
		"\u0000\u0000\u00bb\u00bd\u0005\u09be\u0000\u0000\u00bc\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bd@\u0001\u0000\u0000"+
		"\u0000\u00be\u00c2\u0005\"\u0000\u0000\u00bf\u00c1\b\u0003\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\"\u0000\u0000\u00c6B\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005n\u0000\u0000\u00c8\u00c9\u0005u\u0000\u0000\u00c9\u00ca\u0005"+
		"l\u0000\u0000\u00ca\u00cb\u0005l\u0000\u0000\u00cbD\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0007\u0004\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0006\"\u0000\u0000\u00d2F\u0001\u0000\u0000\u0000"+
		"\t\u0000\u009e\u00a0\u00a6\u00ab\u00b1\u00bc\u00c2\u00cf\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}