// Generated from ./BasicParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOTNEGUNARYOPER=53, JUSTINTLITERAL=52, WHILE=22, FST=27, MOD=39, CHAR=31, 
		DO=23, AND=48, IF=18, NOTEQUAL=47, FREE=14, CLOSE_PARENTHESES=6, GREATER=42, 
		THEN=19, COMMA=2, RSBRACKET=35, DONE=24, IS=10, STRLITERAL=50, PRINTLN=17, 
		BEGIN=8, EQUAL=46, RETURN=12, LESS=44, IDENT=57, PLUS=40, PAIR=33, COMMENT=4, 
		NEWPAIR=25, EXIT=15, SND=28, NULL=56, ELSE=20, BOOL=30, SEMICOLON=1, INT=29, 
		MINUS=41, TRUE=54, MUL=37, PRINT=16, FI=21, SKIP=11, LSBRACKET=34, WS=3, 
		POSITIVEINTLITERAL=51, ESCAPECHARACTER=58, READ=13, OR=49, CHARLITERAL=36, 
		ASSIGN=7, GREATEREQU=43, OPEN_PARENTHESES=5, LESSEQU=45, CALL=26, DIV=38, 
		END=9, FALSE=55, STRING=32;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "','", "WS", "COMMENT", "'('", "')'", "'='", "'begin'", 
		"'end'", "'is'", "'skip'", "'return'", "'read'", "'free'", "'exit'", "'print'", 
		"'println'", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'done'", 
		"'newpair'", "'call'", "'fst'", "'snd'", "'int'", "'bool'", "'char'", 
		"'string'", "'pair'", "'['", "']'", "CHARLITERAL", "MUL", "DIV", "MOD", 
		"PLUS", "MINUS", "GREATER", "GREATEREQU", "LESS", "LESSEQU", "EQUAL", 
		"NOTEQUAL", "AND", "OR", "STRLITERAL", "POSITIVEINTLITERAL", "JUSTINTLITERAL", 
		"NOTNEGUNARYOPER", "'true'", "'false'", "'null'", "IDENT", "ESCAPECHARACTER"
	};
	public static final int
		RULE_prog = 0, RULE_function = 1, RULE_parameterList = 2, RULE_parameter = 3, 
		RULE_type = 4, RULE_baseType = 5, RULE_arrayType = 6, RULE_pairType = 7, 
		RULE_pairElemType = 8, RULE_statement = 9, RULE_assignrhs = 10, RULE_assignlhs = 11, 
		RULE_expression = 12, RULE_binaryoper1 = 13, RULE_binaryoper2 = 14, RULE_binaryoper3 = 15, 
		RULE_binaryoper4 = 16, RULE_binaryoper5 = 17, RULE_binaryoper6 = 18, RULE_beginNeg = 19, 
		RULE_boolLiteral = 20, RULE_pairLiteral = 21, RULE_argumentList = 22, 
		RULE_arrayelement = 23, RULE_arrayLiteral = 24, RULE_pairelement = 25;
	public static final String[] ruleNames = {
		"prog", "function", "parameterList", "parameter", "type", "baseType", 
		"arrayType", "pairType", "pairElemType", "statement", "assignrhs", "assignlhs", 
		"expression", "binaryoper1", "binaryoper2", "binaryoper3", "binaryoper4", 
		"binaryoper5", "binaryoper6", "beginNeg", "boolLiteral", "pairLiteral", 
		"argumentList", "arrayelement", "arrayLiteral", "pairelement"
	};

	@Override
	public String getGrammarFileName() { return "BasicParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public TerminalNode EOF() { return getToken(BasicParser.EOF, 0); }
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(BasicParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(BEGIN);
			{
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53); function();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
			setState(59); statement(0);
			setState(60); match(END);
			setState(61); match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(BasicParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(BasicParser.OPEN_PARENTHESES, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IS() { return getToken(BasicParser.IS, 0); }
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); type();
			setState(64); match(IDENT);
			setState(65); match(OPEN_PARENTHESES);
			setState(67);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << STRING) | (1L << PAIR))) != 0)) {
				{
				setState(66); parameterList();
				}
			}

			setState(69); match(CLOSE_PARENTHESES);
			setState(70); match(IS);
			setState(71); statement(0);
			setState(72); match(END);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); parameter();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75); match(COMMA);
				setState(76); parameter();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); type();
			setState(83); match(IDENT);
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
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArraytypeContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArraytypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairtypeContext extends TypeContext {
		public PairTypeContext pairType() {
			return getRuleContext(PairTypeContext.class,0);
		}
		public PairtypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPairtype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasetypeContext extends TypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public BasetypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitBasetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BasetypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85); baseType();
				}
				break;
			case 2:
				_localctx = new ArraytypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86); arrayType(0);
				}
				break;
			case 3:
				_localctx = new PairtypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87); pairType();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(BasicParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(BasicParser.INT, 0); }
		public TerminalNode STRING() { return getToken(BasicParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(BasicParser.CHAR, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PairTypeArrayContext extends ArrayTypeContext {
		public PairTypeContext pairType() {
			return getRuleContext(PairTypeContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(BasicParser.RSBRACKET, 0); }
		public TerminalNode LSBRACKET() { return getToken(BasicParser.LSBRACKET, 0); }
		public PairTypeArrayContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPairTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseTypeArrayContext extends ArrayTypeContext {
		public TerminalNode RSBRACKET() { return getToken(BasicParser.RSBRACKET, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode LSBRACKET() { return getToken(BasicParser.LSBRACKET, 0); }
		public BaseTypeArrayContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitBaseTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedArrayContext extends ArrayTypeContext {
		public TerminalNode RSBRACKET() { return getToken(BasicParser.RSBRACKET, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode LSBRACKET() { return getToken(BasicParser.LSBRACKET, 0); }
		public NestedArrayContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitNestedArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		return arrayType(0);
	}

	private ArrayTypeContext arrayType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, _parentState);
		ArrayTypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case CHAR:
			case STRING:
				{
				_localctx = new BaseTypeArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93); baseType();
				setState(94); match(LSBRACKET);
				setState(95); match(RSBRACKET);
				}
				break;
			case PAIR:
				{
				_localctx = new PairTypeArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); pairType();
				setState(98); match(LSBRACKET);
				setState(99); match(RSBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedArrayContext(new ArrayTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(103);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(104); match(LSBRACKET);
					setState(105); match(RSBRACKET);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PairTypeContext extends ParserRuleContext {
		public List<PairElemTypeContext> pairElemType() {
			return getRuleContexts(PairElemTypeContext.class);
		}
		public PairElemTypeContext pairElemType(int i) {
			return getRuleContext(PairElemTypeContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(BasicParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(BasicParser.OPEN_PARENTHESES, 0); }
		public TerminalNode PAIR() { return getToken(BasicParser.PAIR, 0); }
		public PairTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPairType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairTypeContext pairType() throws RecognitionException {
		PairTypeContext _localctx = new PairTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pairType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(PAIR);
			setState(112); match(OPEN_PARENTHESES);
			setState(113); pairElemType();
			setState(114); match(COMMA);
			setState(115); pairElemType();
			setState(116); match(CLOSE_PARENTHESES);
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

	public static class PairElemTypeContext extends ParserRuleContext {
		public PairElemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairElemType; }
	 
		public PairElemTypeContext() { }
		public void copyFrom(PairElemTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PairbaseTypeContext extends PairElemTypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public PairbaseTypeContext(PairElemTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPairbaseType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairContext extends PairElemTypeContext {
		public TerminalNode PAIR() { return getToken(BasicParser.PAIR, 0); }
		public PairContext(PairElemTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairArrayTypeContext extends PairElemTypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public PairArrayTypeContext(PairElemTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPairArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairElemTypeContext pairElemType() throws RecognitionException {
		PairElemTypeContext _localctx = new PairElemTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pairElemType);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PairbaseTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); baseType();
				}
				break;
			case 2:
				_localctx = new PairArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119); arrayType(0);
				}
				break;
			case 3:
				_localctx = new PairContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(PAIR);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhiledoContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BasicParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(BasicParser.DO, 0); }
		public TerminalNode DONE() { return getToken(BasicParser.DONE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhiledoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitWhiledo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public AssignrhsContext assignrhs() {
			return getRuleContext(AssignrhsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public AssignlhsContext assignlhs() {
			return getRuleContext(AssignlhsContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FreeContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FREE() { return getToken(BasicParser.FREE, 0); }
		public FreeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitFree(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfthenelseContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public TerminalNode FI() { return getToken(BasicParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfthenelseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitIfthenelse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SemicolonContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode SEMICOLON() { return getToken(BasicParser.SEMICOLON, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SemicolonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(BasicParser.PRINTLN, 0); }
		public PrintlnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StatementContext {
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public AssignlhsContext assignlhs() {
			return getRuleContext(AssignlhsContext.class,0);
		}
		public ReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends StatementContext {
		public TerminalNode SKIP() { return getToken(BasicParser.SKIP, 0); }
		public SkipContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementparensContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(BasicParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public StatementparensContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitStatementparens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExitContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXIT() { return getToken(BasicParser.EXIT, 0); }
		public ExitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareContext extends StatementContext {
		public AssignrhsContext assignrhs() {
			return getRuleContext(AssignrhsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public DeclareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			switch (_input.LA(1)) {
			case SKIP:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124); match(SKIP);
				}
				break;
			case INT:
			case BOOL:
			case CHAR:
			case STRING:
			case PAIR:
				{
				_localctx = new DeclareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125); type();
				setState(126); match(IDENT);
				setState(127); match(ASSIGN);
				setState(128); assignrhs();
				}
				break;
			case FST:
			case SND:
			case IDENT:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); assignlhs();
				setState(131); match(ASSIGN);
				setState(132); assignrhs();
				}
				break;
			case READ:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134); match(READ);
				setState(135); assignlhs();
				}
				break;
			case FREE:
				{
				_localctx = new FreeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136); match(FREE);
				setState(137); expression(0);
				}
				break;
			case EXIT:
				{
				_localctx = new ExitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); match(EXIT);
				setState(139); expression(0);
				}
				break;
			case PRINT:
				{
				_localctx = new PrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140); match(PRINT);
				setState(141); expression(0);
				}
				break;
			case RETURN:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142); match(RETURN);
				setState(143); expression(0);
				}
				break;
			case PRINTLN:
				{
				_localctx = new PrintlnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144); match(PRINTLN);
				setState(145); expression(0);
				}
				break;
			case IF:
				{
				_localctx = new IfthenelseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146); match(IF);
				setState(147); expression(0);
				setState(148); match(THEN);
				setState(149); statement(0);
				setState(150); match(ELSE);
				setState(151); statement(0);
				setState(152); match(FI);
				}
				break;
			case WHILE:
				{
				_localctx = new WhiledoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); match(WHILE);
				setState(155); expression(0);
				setState(156); match(DO);
				setState(157); statement(0);
				setState(158); match(DONE);
				}
				break;
			case BEGIN:
				{
				_localctx = new StatementparensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); match(BEGIN);
				setState(161); statement(0);
				setState(162); match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SemicolonContext(new StatementContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(167); match(SEMICOLON);
					setState(168); statement(2);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class AssignrhsContext extends ParserRuleContext {
		public AssignrhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignrhs; }
	 
		public AssignrhsContext() { }
		public void copyFrom(AssignrhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignRhsPairElemContext extends AssignrhsContext {
		public PairelementContext pairelement() {
			return getRuleContext(PairelementContext.class,0);
		}
		public AssignRhsPairElemContext(AssignrhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignRhsPairElem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignRhsNewPairContext extends AssignrhsContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(BasicParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(BasicParser.OPEN_PARENTHESES, 0); }
		public TerminalNode NEWPAIR() { return getToken(BasicParser.NEWPAIR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignRhsNewPairContext(AssignrhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignRhsNewPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignRhsCallContext extends AssignrhsContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode CALL() { return getToken(BasicParser.CALL, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(BasicParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(BasicParser.OPEN_PARENTHESES, 0); }
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public AssignRhsCallContext(AssignrhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignRhsCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignrhsexpressionContext extends AssignrhsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignrhsexpressionContext(AssignrhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignrhsexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignRhsArrayLiteralContext extends AssignrhsContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public AssignRhsArrayLiteralContext(AssignrhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignRhsArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignrhsContext assignrhs() throws RecognitionException {
		AssignrhsContext _localctx = new AssignrhsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignrhs);
		int _la;
		try {
			setState(191);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESES:
			case CHARLITERAL:
			case MINUS:
			case STRLITERAL:
			case POSITIVEINTLITERAL:
			case NOTNEGUNARYOPER:
			case TRUE:
			case FALSE:
			case NULL:
			case IDENT:
				_localctx = new AssignrhsexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174); expression(0);
				}
				break;
			case LSBRACKET:
				_localctx = new AssignRhsArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175); arrayLiteral();
				}
				break;
			case NEWPAIR:
				_localctx = new AssignRhsNewPairContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(NEWPAIR);
				setState(177); match(OPEN_PARENTHESES);
				setState(178); expression(0);
				setState(179); match(COMMA);
				setState(180); expression(0);
				setState(181); match(CLOSE_PARENTHESES);
				}
				break;
			case FST:
			case SND:
				_localctx = new AssignRhsPairElemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183); pairelement();
				}
				break;
			case CALL:
				_localctx = new AssignRhsCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(184); match(CALL);
				setState(185); match(IDENT);
				setState(186); match(OPEN_PARENTHESES);
				setState(188);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESES) | (1L << CHARLITERAL) | (1L << MINUS) | (1L << STRLITERAL) | (1L << POSITIVEINTLITERAL) | (1L << NOTNEGUNARYOPER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << IDENT))) != 0)) {
					{
					setState(187); argumentList();
					}
				}

				setState(190); match(CLOSE_PARENTHESES);
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

	public static class AssignlhsContext extends ParserRuleContext {
		public AssignlhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignlhs; }
	 
		public AssignlhsContext() { }
		public void copyFrom(AssignlhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignLhsArrayElementContext extends AssignlhsContext {
		public ArrayelementContext arrayelement() {
			return getRuleContext(ArrayelementContext.class,0);
		}
		public AssignLhsArrayElementContext(AssignlhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignLhsArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignlhsIdentContext extends AssignlhsContext {
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public AssignlhsIdentContext(AssignlhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignlhsIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignlhsPairElementContext extends AssignlhsContext {
		public PairelementContext pairelement() {
			return getRuleContext(PairelementContext.class,0);
		}
		public AssignlhsPairElementContext(AssignlhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAssignlhsPairElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignlhsContext assignlhs() throws RecognitionException {
		AssignlhsContext _localctx = new AssignlhsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignlhs);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignlhsIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(IDENT);
				}
				break;
			case 2:
				_localctx = new AssignLhsArrayElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194); arrayelement();
				}
				break;
			case 3:
				_localctx = new AssignlhsPairElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195); pairelement();
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
	public static class ExpressBinary6Context extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binaryoper6Context binaryoper6() {
			return getRuleContext(Binaryoper6Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressBinary6Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBinary6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBinary5Context extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binaryoper5Context binaryoper5() {
			return getRuleContext(Binaryoper5Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressBinary5Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBinary5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBinary2Context extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binaryoper2Context binaryoper2() {
			return getRuleContext(Binaryoper2Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressBinary2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBinary2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBinary1Context extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binaryoper1Context binaryoper1() {
			return getRuleContext(Binaryoper1Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressBinary1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBinary1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBinary4Context extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binaryoper4Context binaryoper4() {
			return getRuleContext(Binaryoper4Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressBinary4Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBinary4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBinary3Context extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binaryoper3Context binaryoper3() {
			return getRuleContext(Binaryoper3Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressBinary3Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBinary3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressParenthesesContext extends ExpressionContext {
		public TerminalNode CLOSE_PARENTHESES() { return getToken(BasicParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(BasicParser.OPEN_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressNotNegUnaryContext extends ExpressionContext {
		public TerminalNode NOTNEGUNARYOPER() { return getToken(BasicParser.NOTNEGUNARYOPER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressNotNegUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressNotNegUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBeginNegContext extends ExpressionContext {
		public BeginNegContext beginNeg() {
			return getRuleContext(BeginNegContext.class,0);
		}
		public ExpressBeginNegContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBeginNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressPaitLiteralContext extends ExpressionContext {
		public PairLiteralContext pairLiteral() {
			return getRuleContext(PairLiteralContext.class,0);
		}
		public ExpressPaitLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressPaitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressIdentContext extends ExpressionContext {
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public ExpressIdentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressStrliteralContext extends ExpressionContext {
		public TerminalNode STRLITERAL() { return getToken(BasicParser.STRLITERAL, 0); }
		public ExpressStrliteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressStrliteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressArrayElementContext extends ExpressionContext {
		public ArrayelementContext arrayelement() {
			return getRuleContext(ArrayelementContext.class,0);
		}
		public ExpressArrayElementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressBoolLiteralContext extends ExpressionContext {
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public ExpressBoolLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressPositiveIntliteralContext extends ExpressionContext {
		public TerminalNode POSITIVEINTLITERAL() { return getToken(BasicParser.POSITIVEINTLITERAL, 0); }
		public ExpressPositiveIntliteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressPositiveIntliteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressCharliteralContext extends ExpressionContext {
		public TerminalNode CHARLITERAL() { return getToken(BasicParser.CHARLITERAL, 0); }
		public ExpressCharliteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitExpressCharliteral(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressNotNegUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199); match(NOTNEGUNARYOPER);
				setState(200); expression(7);
				}
				break;
			case 2:
				{
				_localctx = new ExpressBeginNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); beginNeg();
				}
				break;
			case 3:
				{
				_localctx = new ExpressArrayElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); arrayelement();
				}
				break;
			case 4:
				{
				_localctx = new ExpressIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); match(IDENT);
				}
				break;
			case 5:
				{
				_localctx = new ExpressBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204); boolLiteral();
				}
				break;
			case 6:
				{
				_localctx = new ExpressCharliteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205); match(CHARLITERAL);
				}
				break;
			case 7:
				{
				_localctx = new ExpressStrliteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206); match(STRLITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ExpressPaitLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); pairLiteral();
				}
				break;
			case 9:
				{
				_localctx = new ExpressPositiveIntliteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208); match(POSITIVEINTLITERAL);
				}
				break;
			case 10:
				{
				_localctx = new ExpressParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(OPEN_PARENTHESES);
				setState(210); expression(0);
				setState(211); match(CLOSE_PARENTHESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressBinary1Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216); binaryoper1();
						setState(217); expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressBinary2Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220); binaryoper2();
						setState(221); expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressBinary3Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224); binaryoper3();
						setState(225); expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressBinary4Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228); binaryoper4();
						setState(229); expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressBinary5Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232); binaryoper5();
						setState(233); expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressBinary6Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(236); binaryoper6();
						setState(237); expression(2);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Binaryoper1Context extends ParserRuleContext {
		public Binaryoper1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoper1; }
	 
		public Binaryoper1Context() { }
		public void copyFrom(Binaryoper1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModContext extends Binaryoper1Context {
		public TerminalNode MOD() { return getToken(BasicParser.MOD, 0); }
		public ModContext(Binaryoper1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends Binaryoper1Context {
		public TerminalNode DIV() { return getToken(BasicParser.DIV, 0); }
		public DivContext(Binaryoper1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends Binaryoper1Context {
		public TerminalNode MUL() { return getToken(BasicParser.MUL, 0); }
		public MulContext(Binaryoper1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaryoper1Context binaryoper1() throws RecognitionException {
		Binaryoper1Context _localctx = new Binaryoper1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_binaryoper1);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244); match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(DIV);
				}
				break;
			case MOD:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246); match(MOD);
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

	public static class Binaryoper2Context extends ParserRuleContext {
		public Binaryoper2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoper2; }
	 
		public Binaryoper2Context() { }
		public void copyFrom(Binaryoper2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusContext extends Binaryoper2Context {
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public PlusContext(Binaryoper2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends Binaryoper2Context {
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public MinusContext(Binaryoper2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaryoper2Context binaryoper2() throws RecognitionException {
		Binaryoper2Context _localctx = new Binaryoper2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryoper2);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249); match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); match(MINUS);
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

	public static class Binaryoper3Context extends ParserRuleContext {
		public Binaryoper3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoper3; }
	 
		public Binaryoper3Context() { }
		public void copyFrom(Binaryoper3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterContext extends Binaryoper3Context {
		public TerminalNode GREATER() { return getToken(BasicParser.GREATER, 0); }
		public GreaterContext(Binaryoper3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeContext extends Binaryoper3Context {
		public TerminalNode LESSEQU() { return getToken(BasicParser.LESSEQU, 0); }
		public LeContext(Binaryoper3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeContext extends Binaryoper3Context {
		public TerminalNode GREATEREQU() { return getToken(BasicParser.GREATEREQU, 0); }
		public GeContext(Binaryoper3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends Binaryoper3Context {
		public TerminalNode LESS() { return getToken(BasicParser.LESS, 0); }
		public LessContext(Binaryoper3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaryoper3Context binaryoper3() throws RecognitionException {
		Binaryoper3Context _localctx = new Binaryoper3Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryoper3);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case GREATER:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253); match(GREATER);
				}
				break;
			case GREATEREQU:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254); match(GREATEREQU);
				}
				break;
			case LESS:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255); match(LESS);
				}
				break;
			case LESSEQU:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256); match(LESSEQU);
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

	public static class Binaryoper4Context extends ParserRuleContext {
		public Binaryoper4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoper4; }
	 
		public Binaryoper4Context() { }
		public void copyFrom(Binaryoper4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoteqContext extends Binaryoper4Context {
		public TerminalNode NOTEQUAL() { return getToken(BasicParser.NOTEQUAL, 0); }
		public NoteqContext(Binaryoper4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitNoteq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquContext extends Binaryoper4Context {
		public TerminalNode EQUAL() { return getToken(BasicParser.EQUAL, 0); }
		public EquContext(Binaryoper4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitEqu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaryoper4Context binaryoper4() throws RecognitionException {
		Binaryoper4Context _localctx = new Binaryoper4Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_binaryoper4);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new EquContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259); match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new NoteqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260); match(NOTEQUAL);
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

	public static class Binaryoper5Context extends ParserRuleContext {
		public Binaryoper5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoper5; }
	 
		public Binaryoper5Context() { }
		public void copyFrom(Binaryoper5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndContext extends Binaryoper5Context {
		public TerminalNode AND() { return getToken(BasicParser.AND, 0); }
		public AndContext(Binaryoper5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaryoper5Context binaryoper5() throws RecognitionException {
		Binaryoper5Context _localctx = new Binaryoper5Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_binaryoper5);
		try {
			_localctx = new AndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(AND);
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

	public static class Binaryoper6Context extends ParserRuleContext {
		public Binaryoper6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoper6; }
	 
		public Binaryoper6Context() { }
		public void copyFrom(Binaryoper6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends Binaryoper6Context {
		public TerminalNode OR() { return getToken(BasicParser.OR, 0); }
		public OrContext(Binaryoper6Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binaryoper6Context binaryoper6() throws RecognitionException {
		Binaryoper6Context _localctx = new Binaryoper6Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_binaryoper6);
		try {
			_localctx = new OrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(OR);
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

	public static class BeginNegContext extends ParserRuleContext {
		public BeginNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginNeg; }
	 
		public BeginNegContext() { }
		public void copyFrom(BeginNegContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusjustlitContext extends BeginNegContext {
		public TerminalNode JUSTINTLITERAL() { return getToken(BasicParser.JUSTINTLITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public MinusjustlitContext(BeginNegContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitMinusjustlit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusexpreContext extends BeginNegContext {
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusexpreContext(BeginNegContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitMinusexpre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginNegContext beginNeg() throws RecognitionException {
		BeginNegContext _localctx = new BeginNegContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_beginNeg);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new MinusexpreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267); match(MINUS);
				setState(268); expression(0);
				}
				break;
			case 2:
				_localctx = new MinusjustlitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(MINUS);
				setState(270); match(JUSTINTLITERAL);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BasicParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BasicParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PairLiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(BasicParser.NULL, 0); }
		public PairLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitPairLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairLiteralContext pairLiteral() throws RecognitionException {
		PairLiteralContext _localctx = new PairLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pairLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(NULL);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); expression(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278); match(COMMA);
				setState(279); expression(0);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayelementContext extends ParserRuleContext {
		public TerminalNode LSBRACKET(int i) {
			return getToken(BasicParser.LSBRACKET, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RSBRACKET() { return getTokens(BasicParser.RSBRACKET); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RSBRACKET(int i) {
			return getToken(BasicParser.RSBRACKET, i);
		}
		public TerminalNode IDENT() { return getToken(BasicParser.IDENT, 0); }
		public List<TerminalNode> LSBRACKET() { return getTokens(BasicParser.LSBRACKET); }
		public ArrayelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayelement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitArrayelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayelementContext arrayelement() throws RecognitionException {
		ArrayelementContext _localctx = new ArrayelementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayelement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(IDENT);
			setState(290); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(286); match(LSBRACKET);
					setState(287); expression(0);
					setState(288); match(RSBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(292); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RSBRACKET() { return getToken(BasicParser.RSBRACKET, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode LSBRACKET() { return getToken(BasicParser.LSBRACKET, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(LSBRACKET);
			setState(303);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESES) | (1L << CHARLITERAL) | (1L << MINUS) | (1L << STRLITERAL) | (1L << POSITIVEINTLITERAL) | (1L << NOTNEGUNARYOPER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << IDENT))) != 0)) {
				{
				setState(295); expression(0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(296); match(COMMA);
					setState(297); expression(0);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(305); match(RSBRACKET);
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

	public static class PairelementContext extends ParserRuleContext {
		public PairelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairelement; }
	 
		public PairelementContext() { }
		public void copyFrom(PairelementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FstContext extends PairelementContext {
		public TerminalNode FST() { return getToken(BasicParser.FST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FstContext(PairelementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitFst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SndContext extends PairelementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SND() { return getToken(BasicParser.SND, 0); }
		public SndContext(PairelementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicParserVisitor ) return ((BasicParserVisitor<? extends T>)visitor).visitSnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairelementContext pairelement() throws RecognitionException {
		PairelementContext _localctx = new PairelementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pairelement);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case FST:
				_localctx = new FstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307); match(FST);
				setState(308); expression(0);
				}
				break;
			case SND:
				_localctx = new SndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(SND);
				setState(310); expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 9: return statement_sempred((StatementContext)_localctx, predIndex);
		case 12: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 6);
		case 3: return precpred(_ctx, 5);
		case 4: return precpred(_ctx, 4);
		case 5: return precpred(_ctx, 3);
		case 6: return precpred(_ctx, 2);
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arrayType_sempred(ArrayTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\13\3\13\3\13\7\13"+
		"\u00ac\n\13\f\13\16\13\u00af\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\5\r\u00c7"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00d8\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00f2\n\16\f\16\16\16\u00f5\13\16\3\17\3\17\3\17\5\17\u00fa"+
		"\n\17\3\20\3\20\5\20\u00fe\n\20\3\21\3\21\3\21\3\21\5\21\u0104\n\21\3"+
		"\22\3\22\5\22\u0108\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0112\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u011b\n\30\f\30\16"+
		"\30\u011e\13\30\3\31\3\31\3\31\3\31\3\31\6\31\u0125\n\31\r\31\16\31\u0126"+
		"\3\32\3\32\3\32\3\32\7\32\u012d\n\32\f\32\16\32\u0130\13\32\5\32\u0132"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u013a\n\33\3\33\2\5\16\24\32"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\37"+
		"\"\3\289\u0159\2\66\3\2\2\2\4A\3\2\2\2\6L\3\2\2\2\bT\3\2\2\2\nZ\3\2\2"+
		"\2\f\\\3\2\2\2\16g\3\2\2\2\20q\3\2\2\2\22{\3\2\2\2\24\u00a6\3\2\2\2\26"+
		"\u00c1\3\2\2\2\30\u00c6\3\2\2\2\32\u00d7\3\2\2\2\34\u00f9\3\2\2\2\36\u00fd"+
		"\3\2\2\2 \u0103\3\2\2\2\"\u0107\3\2\2\2$\u0109\3\2\2\2&\u010b\3\2\2\2"+
		"(\u0111\3\2\2\2*\u0113\3\2\2\2,\u0115\3\2\2\2.\u0117\3\2\2\2\60\u011f"+
		"\3\2\2\2\62\u0128\3\2\2\2\64\u0139\3\2\2\2\66:\7\n\2\2\679\5\4\3\28\67"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\24\13\2"+
		">?\7\13\2\2?@\7\2\2\3@\3\3\2\2\2AB\5\n\6\2BC\7;\2\2CE\7\7\2\2DF\5\6\4"+
		"\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\b\2\2HI\7\f\2\2IJ\5\24\13\2JK\7\13"+
		"\2\2K\5\3\2\2\2LQ\5\b\5\2MN\7\4\2\2NP\5\b\5\2OM\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2R\7\3\2\2\2SQ\3\2\2\2TU\5\n\6\2UV\7;\2\2V\t\3\2\2\2W["+
		"\5\f\7\2X[\5\16\b\2Y[\5\20\t\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2"+
		"\2\\]\t\2\2\2]\r\3\2\2\2^_\b\b\1\2_`\5\f\7\2`a\7$\2\2ab\7%\2\2bh\3\2\2"+
		"\2cd\5\20\t\2de\7$\2\2ef\7%\2\2fh\3\2\2\2g^\3\2\2\2gc\3\2\2\2hn\3\2\2"+
		"\2ij\f\4\2\2jk\7$\2\2km\7%\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o\17\3\2\2\2pn\3\2\2\2qr\7#\2\2rs\7\7\2\2st\5\22\n\2tu\7\4\2\2uv\5\22"+
		"\n\2vw\7\b\2\2w\21\3\2\2\2x|\5\f\7\2y|\5\16\b\2z|\7#\2\2{x\3\2\2\2{y\3"+
		"\2\2\2{z\3\2\2\2|\23\3\2\2\2}~\b\13\1\2~\u00a7\7\r\2\2\177\u0080\5\n\6"+
		"\2\u0080\u0081\7;\2\2\u0081\u0082\7\t\2\2\u0082\u0083\5\26\f\2\u0083\u00a7"+
		"\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\t\2\2\u0086\u0087\5\26\f\2"+
		"\u0087\u00a7\3\2\2\2\u0088\u0089\7\17\2\2\u0089\u00a7\5\30\r\2\u008a\u008b"+
		"\7\20\2\2\u008b\u00a7\5\32\16\2\u008c\u008d\7\21\2\2\u008d\u00a7\5\32"+
		"\16\2\u008e\u008f\7\22\2\2\u008f\u00a7\5\32\16\2\u0090\u0091\7\16\2\2"+
		"\u0091\u00a7\5\32\16\2\u0092\u0093\7\23\2\2\u0093\u00a7\5\32\16\2\u0094"+
		"\u0095\7\24\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\25\2\2\u0097\u0098"+
		"\5\24\13\2\u0098\u0099\7\26\2\2\u0099\u009a\5\24\13\2\u009a\u009b\7\27"+
		"\2\2\u009b\u00a7\3\2\2\2\u009c\u009d\7\30\2\2\u009d\u009e\5\32\16\2\u009e"+
		"\u009f\7\31\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\32\2\2\u00a1\u00a7"+
		"\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7\13\2"+
		"\2\u00a5\u00a7\3\2\2\2\u00a6}\3\2\2\2\u00a6\177\3\2\2\2\u00a6\u0084\3"+
		"\2\2\2\u00a6\u0088\3\2\2\2\u00a6\u008a\3\2\2\2\u00a6\u008c\3\2\2\2\u00a6"+
		"\u008e\3\2\2\2\u00a6\u0090\3\2\2\2\u00a6\u0092\3\2\2\2\u00a6\u0094\3\2"+
		"\2\2\u00a6\u009c\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00ad\3\2\2\2\u00a8"+
		"\u00a9\f\3\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ac\5\24\13\4\u00ab\u00a8\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00c2\5\32\16\2\u00b1\u00c2\5\62"+
		"\32\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5\5\32\16\2\u00b5"+
		"\u00b6\7\4\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7\b\2\2\u00b8\u00c2\3"+
		"\2\2\2\u00b9\u00c2\5\64\33\2\u00ba\u00bb\7\34\2\2\u00bb\u00bc\7;\2\2\u00bc"+
		"\u00be\7\7\2\2\u00bd\u00bf\5.\30\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7\b\2\2\u00c1\u00b0\3\2\2\2\u00c1"+
		"\u00b1\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00ba\3\2"+
		"\2\2\u00c2\27\3\2\2\2\u00c3\u00c7\7;\2\2\u00c4\u00c7\5\60\31\2\u00c5\u00c7"+
		"\5\64\33\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2"+
		"\u00c7\31\3\2\2\2\u00c8\u00c9\b\16\1\2\u00c9\u00ca\7\67\2\2\u00ca\u00d8"+
		"\5\32\16\t\u00cb\u00d8\5(\25\2\u00cc\u00d8\5\60\31\2\u00cd\u00d8\7;\2"+
		"\2\u00ce\u00d8\5*\26\2\u00cf\u00d8\7&\2\2\u00d0\u00d8\7\64\2\2\u00d1\u00d8"+
		"\5,\27\2\u00d2\u00d8\7\65\2\2\u00d3\u00d4\7\7\2\2\u00d4\u00d5\5\32\16"+
		"\2\u00d5\u00d6\7\b\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c8\3\2\2\2\u00d7\u00cb"+
		"\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2"+
		"\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00f3\3\2\2\2\u00d9\u00da\f\b\2\2\u00da"+
		"\u00db\5\34\17\2\u00db\u00dc\5\32\16\t\u00dc\u00f2\3\2\2\2\u00dd\u00de"+
		"\f\7\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\5\32\16\b\u00e0\u00f2\3\2\2"+
		"\2\u00e1\u00e2\f\6\2\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\5\32\16\7\u00e4"+
		"\u00f2\3\2\2\2\u00e5\u00e6\f\5\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\5"+
		"\32\16\6\u00e8\u00f2\3\2\2\2\u00e9\u00ea\f\4\2\2\u00ea\u00eb\5$\23\2\u00eb"+
		"\u00ec\5\32\16\5\u00ec\u00f2\3\2\2\2\u00ed\u00ee\f\3\2\2\u00ee\u00ef\5"+
		"&\24\2\u00ef\u00f0\5\32\16\4\u00f0\u00f2\3\2\2\2\u00f1\u00d9\3\2\2\2\u00f1"+
		"\u00dd\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e9\3\2"+
		"\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\33\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa\7\'\2"+
		"\2\u00f7\u00fa\7(\2\2\u00f8\u00fa\7)\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00fe\7*\2\2\u00fc"+
		"\u00fe\7+\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\37\3\2\2\2"+
		"\u00ff\u0104\7,\2\2\u0100\u0104\7-\2\2\u0101\u0104\7.\2\2\u0102\u0104"+
		"\7/\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104!\3\2\2\2\u0105\u0108\7\60\2\2\u0106\u0108\7\61\2"+
		"\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108#\3\2\2\2\u0109\u010a"+
		"\7\62\2\2\u010a%\3\2\2\2\u010b\u010c\7\63\2\2\u010c\'\3\2\2\2\u010d\u010e"+
		"\7+\2\2\u010e\u0112\5\32\16\2\u010f\u0110\7+\2\2\u0110\u0112\7\66\2\2"+
		"\u0111\u010d\3\2\2\2\u0111\u010f\3\2\2\2\u0112)\3\2\2\2\u0113\u0114\t"+
		"\3\2\2\u0114+\3\2\2\2\u0115\u0116\7:\2\2\u0116-\3\2\2\2\u0117\u011c\5"+
		"\32\16\2\u0118\u0119\7\4\2\2\u0119\u011b\5\32\16\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d/\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011f\u0124\7;\2\2\u0120\u0121\7$\2\2\u0121"+
		"\u0122\5\32\16\2\u0122\u0123\7%\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\61\3\2\2\2\u0128\u0131\7$\2\2\u0129\u012e\5\32\16\2\u012a\u012b\7\4\2"+
		"\2\u012b\u012d\5\32\16\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0129\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7%\2\2\u0134\63\3\2\2\2\u0135\u0136\7\35\2\2\u0136\u013a\5\32\16"+
		"\2\u0137\u0138\7\36\2\2\u0138\u013a\5\32\16\2\u0139\u0135\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\65\3\2\2\2\33:EQZgn{\u00a6\u00ad\u00be\u00c1\u00c6"+
		"\u00d7\u00f1\u00f3\u00f9\u00fd\u0103\u0107\u0111\u011c\u0126\u012e\u0131"+
		"\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}