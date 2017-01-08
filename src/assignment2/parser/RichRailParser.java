// Generated from /home/owner/Documents/Education/HBO/Classes/PAFR/java/src/assignment2/RichRail.g4 by ANTLR 4.6
package assignment2.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RichRailParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, INT=13, WS=14;
	public static final int
		RULE_command = 0, RULE_newcommand = 1, RULE_newtraincommand = 2, RULE_newwagoncommand = 3, 
		RULE_delcommand = 4, RULE_addcommand = 5, RULE_remcommand = 6, RULE_getcommand = 7, 
		RULE_type = 8;
	public static final String[] ruleNames = {
		"command", "newcommand", "newtraincommand", "newwagoncommand", "delcommand", 
		"addcommand", "remcommand", "getcommand", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'new'", "' '", "'train'", "'wagon'", "'numseats'", "'delete'", 
		"'add'", "'to'", "'remove'", "'from'", "'getnumseats'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "INT", "WS"
	};
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
	public String getGrammarFileName() { return "RichRail.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public assignment2.domain.CommandHandler handler = new assignment2.domain.RailCompany();

	public RichRailParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public NewcommandContext newcommand() {
			return getRuleContext(NewcommandContext.class,0);
		}
		public AddcommandContext addcommand() {
			return getRuleContext(AddcommandContext.class,0);
		}
		public GetcommandContext getcommand() {
			return getRuleContext(GetcommandContext.class,0);
		}
		public DelcommandContext delcommand() {
			return getRuleContext(DelcommandContext.class,0);
		}
		public RemcommandContext remcommand() {
			return getRuleContext(RemcommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				newcommand();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				addcommand();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				getcommand();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				delcommand();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				remcommand();
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

	public static class NewcommandContext extends ParserRuleContext {
		public NewtraincommandContext newtraincommand() {
			return getRuleContext(NewtraincommandContext.class,0);
		}
		public NewwagoncommandContext newwagoncommand() {
			return getRuleContext(NewwagoncommandContext.class,0);
		}
		public NewcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewcommand(this);
		}
	}

	public final NewcommandContext newcommand() throws RecognitionException {
		NewcommandContext _localctx = new NewcommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newcommand);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				newtraincommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				newwagoncommand();
				}
				break;
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

	public static class NewtraincommandContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public NewtraincommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtraincommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewtraincommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewtraincommand(this);
		}
	}

	public final NewtraincommandContext newtraincommand() throws RecognitionException {
		NewtraincommandContext _localctx = new NewtraincommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newtraincommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(T__1);
			setState(31);
			match(T__2);
			setState(32);
			match(T__1);
			setState(33);
			((NewtraincommandContext)_localctx).ID = match(ID);
			handler.newTrainCommand((((NewtraincommandContext)_localctx).ID!=null?((NewtraincommandContext)_localctx).ID.getText():null));
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

	public static class NewwagoncommandContext extends ParserRuleContext {
		public Token ID;
		public Token seats;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode INT() { return getToken(RichRailParser.INT, 0); }
		public NewwagoncommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newwagoncommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewwagoncommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewwagoncommand(this);
		}
	}

	public final NewwagoncommandContext newwagoncommand() throws RecognitionException {
		NewwagoncommandContext _localctx = new NewwagoncommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newwagoncommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(T__1);
			setState(38);
			match(T__3);
			setState(39);
			match(T__1);
			setState(40);
			((NewwagoncommandContext)_localctx).ID = match(ID);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(41);
				match(T__1);
				setState(42);
				match(T__4);
				setState(43);
				match(T__1);
				setState(44);
				((NewwagoncommandContext)_localctx).seats = match(INT);
				}
			}

			handler.newWagonCommand((((NewwagoncommandContext)_localctx).ID!=null?((NewwagoncommandContext)_localctx).ID.getText():null), (((NewwagoncommandContext)_localctx).seats!=null?((NewwagoncommandContext)_localctx).seats.getText():null));
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

	public static class DelcommandContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public DelcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterDelcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitDelcommand(this);
		}
	}

	public final DelcommandContext delcommand() throws RecognitionException {
		DelcommandContext _localctx = new DelcommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__5);
			setState(50);
			match(T__1);
			setState(51);
			((DelcommandContext)_localctx).type = type();
			setState(52);
			match(T__1);
			setState(53);
			((DelcommandContext)_localctx).ID = match(ID);
			handler.delCommand((((DelcommandContext)_localctx).type!=null?_input.getText(((DelcommandContext)_localctx).type.start,((DelcommandContext)_localctx).type.stop):null), (((DelcommandContext)_localctx).ID!=null?((DelcommandContext)_localctx).ID.getText():null));
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

	public static class AddcommandContext extends ParserRuleContext {
		public Token wagon;
		public Token train;
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public AddcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterAddcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitAddcommand(this);
		}
	}

	public final AddcommandContext addcommand() throws RecognitionException {
		AddcommandContext _localctx = new AddcommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__6);
			setState(57);
			match(T__1);
			setState(58);
			((AddcommandContext)_localctx).wagon = match(ID);
			setState(59);
			match(T__1);
			setState(60);
			match(T__7);
			setState(61);
			match(T__1);
			setState(62);
			((AddcommandContext)_localctx).train = match(ID);
			handler.addCommand((((AddcommandContext)_localctx).wagon!=null?((AddcommandContext)_localctx).wagon.getText():null), (((AddcommandContext)_localctx).train!=null?((AddcommandContext)_localctx).train.getText():null));
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

	public static class RemcommandContext extends ParserRuleContext {
		public Token wagon;
		public Token train;
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public RemcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterRemcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitRemcommand(this);
		}
	}

	public final RemcommandContext remcommand() throws RecognitionException {
		RemcommandContext _localctx = new RemcommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_remcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
			match(T__1);
			setState(67);
			((RemcommandContext)_localctx).wagon = match(ID);
			setState(68);
			match(T__9);
			setState(69);
			match(T__1);
			setState(70);
			((RemcommandContext)_localctx).train = match(ID);
			handler.remCommand((((RemcommandContext)_localctx).wagon!=null?((RemcommandContext)_localctx).wagon.getText():null), (((RemcommandContext)_localctx).train!=null?((RemcommandContext)_localctx).train.getText():null));
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

	public static class GetcommandContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public GetcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterGetcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitGetcommand(this);
		}
	}

	public final GetcommandContext getcommand() throws RecognitionException {
		GetcommandContext _localctx = new GetcommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__10);
			setState(74);
			match(T__1);
			setState(75);
			((GetcommandContext)_localctx).type = type();
			setState(76);
			match(T__1);
			setState(77);
			((GetcommandContext)_localctx).ID = match(ID);
			handler.getCommand((((GetcommandContext)_localctx).type!=null?_input.getText(((GetcommandContext)_localctx).type.start,((GetcommandContext)_localctx).type.stop):null), (((GetcommandContext)_localctx).ID!=null?((GetcommandContext)_localctx).ID.getText():null));
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(80);
				match(T__2);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(81);
				match(T__3);
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\nU\n\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\2T\2\31\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b&\3\2\2\2"+
		"\n\63\3\2\2\2\f:\3\2\2\2\16C\3\2\2\2\20K\3\2\2\2\22T\3\2\2\2\24\32\5\4"+
		"\3\2\25\32\5\f\7\2\26\32\5\20\t\2\27\32\5\n\6\2\30\32\5\16\b\2\31\24\3"+
		"\2\2\2\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\3\3"+
		"\2\2\2\33\36\5\6\4\2\34\36\5\b\5\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3"+
		"\2\2\2\37 \7\3\2\2 !\7\4\2\2!\"\7\5\2\2\"#\7\4\2\2#$\7\16\2\2$%\b\4\1"+
		"\2%\7\3\2\2\2&\'\7\3\2\2\'(\7\4\2\2()\7\6\2\2)*\7\4\2\2*/\7\16\2\2+,\7"+
		"\4\2\2,-\7\7\2\2-.\7\4\2\2.\60\7\17\2\2/+\3\2\2\2/\60\3\2\2\2\60\61\3"+
		"\2\2\2\61\62\b\5\1\2\62\t\3\2\2\2\63\64\7\b\2\2\64\65\7\4\2\2\65\66\5"+
		"\22\n\2\66\67\7\4\2\2\678\7\16\2\289\b\6\1\29\13\3\2\2\2:;\7\t\2\2;<\7"+
		"\4\2\2<=\7\16\2\2=>\7\4\2\2>?\7\n\2\2?@\7\4\2\2@A\7\16\2\2AB\b\7\1\2B"+
		"\r\3\2\2\2CD\7\13\2\2DE\7\4\2\2EF\7\16\2\2FG\7\f\2\2GH\7\4\2\2HI\7\16"+
		"\2\2IJ\b\b\1\2J\17\3\2\2\2KL\7\r\2\2LM\7\4\2\2MN\5\22\n\2NO\7\4\2\2OP"+
		"\7\16\2\2PQ\b\t\1\2Q\21\3\2\2\2RU\7\5\2\2SU\7\6\2\2TR\3\2\2\2TS\3\2\2"+
		"\2U\23\3\2\2\2\6\31\35/T";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}