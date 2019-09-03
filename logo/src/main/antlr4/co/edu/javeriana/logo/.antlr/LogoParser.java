// Generated from /Users/lauradonado/Documents/eclipse-workspace-mars/logo2/logo/src/main/antlr4/co/edu/javeriana/logo/Logo.g4 by ANTLR 4.7.1

	
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, LET=2, PRINTLN=3, READ=4, PLUS=5, MINUS=6, MULT=7, DIV=8, MOD=9, 
		EXPO=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, LEQ=17, EQ=18, NEQ=19, 
		ASSIGN=20, BRACKET_OPEN=21, BRACKET_CLOSE=22, PAR_OPEN=23, PAR_CLOSE=24, 
		COLON=25, SEMICOLON=26, TWO_DOTS=27, NUMBER=28, BOOLEAN=29, STRING=30, 
		ID=31, WS=32, MOVE_FORW=33, MOVE_BACK=34, ROT_L=35, ROT_R=36, SET_COLOR=37, 
		INI_IF=38, THEN=39, ELSE=40, END_IF=41, INI_WHILE=42, DO=43, END_WHILE=44, 
		INI_FUNC=45, END_FUNC=46;
	public static final int
		RULE_program = 0, RULE_move_forw = 1, RULE_move_back = 2, RULE_rot_l = 3, 
		RULE_rot_r = 4, RULE_set_color = 5, RULE_var_decl = 6, RULE_var_assign = 7, 
		RULE_sentence = 8, RULE_condition = 9, RULE_conditional = 10, RULE_cicle = 11, 
		RULE_println = 12, RULE_read = 13, RULE_function = 14, RULE_execute = 15, 
		RULE_expression = 16, RULE_expo = 17, RULE_factor = 18, RULE_term = 19;
	public static final String[] ruleNames = {
		"program", "move_forw", "move_back", "rot_l", "rot_r", "set_color", "var_decl", 
		"var_assign", "sentence", "condition", "conditional", "cicle", "println", 
		"read", "function", "execute", "expression", "expo", "factor", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'let'", "'println'", "'read'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'^'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'<>'", "'='", "'{'", "'}'", "'('", "')'", "','", "';'", "':'", 
		null, null, null, null, null, "'mov_forw'", "'move_back'", "'rot_l'", 
		"'rot_r'", "'set_color'", "'if'", "'then'", "'else'", "'end_if'", "'while'", 
		"'do'", "'end_while'", "'def'", "'end_def'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "LET", "PRINTLN", "READ", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "EXPO", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", 
		"ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "COLON", 
		"SEMICOLON", "TWO_DOTS", "NUMBER", "BOOLEAN", "STRING", "ID", "WS", "MOVE_FORW", 
		"MOVE_BACK", "ROT_L", "ROT_R", "SET_COLOR", "INI_IF", "THEN", "ELSE", 
		"END_IF", "INI_WHILE", "DO", "END_WHILE", "INI_FUNC", "END_FUNC"
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
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Map<String, Object> symbolTable = new HashMap<String, Object>();
	private Turtle turtle;

	public LogoParser(TokenStream input, Turtle turtle) {
	    this(input);
	    this.turtle = turtle;
	}

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(LogoParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LogoParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LogoParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROGRAM);
			setState(41);
			match(ID);
			setState(42);
			match(BRACKET_OPEN);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(43);
				sentence();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(BRACKET_CLOSE);
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

	public static class Move_forwContext extends ParserRuleContext {
		public TerminalNode MOVE_FORW() { return getToken(LogoParser.MOVE_FORW, 0); }
		public TerminalNode NUMBER() { return getToken(LogoParser.NUMBER, 0); }
		public Move_forwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_forw; }
	}

	public final Move_forwContext move_forw() throws RecognitionException {
		Move_forwContext _localctx = new Move_forwContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_move_forw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(MOVE_FORW);
			setState(52);
			match(NUMBER);
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

	public static class Move_backContext extends ParserRuleContext {
		public TerminalNode MOVE_BACK() { return getToken(LogoParser.MOVE_BACK, 0); }
		public TerminalNode NUMBER() { return getToken(LogoParser.NUMBER, 0); }
		public Move_backContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_back; }
	}

	public final Move_backContext move_back() throws RecognitionException {
		Move_backContext _localctx = new Move_backContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_move_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(MOVE_BACK);
			setState(55);
			match(NUMBER);
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

	public static class Rot_lContext extends ParserRuleContext {
		public TerminalNode ROT_L() { return getToken(LogoParser.ROT_L, 0); }
		public TerminalNode NUMBER() { return getToken(LogoParser.NUMBER, 0); }
		public Rot_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rot_l; }
	}

	public final Rot_lContext rot_l() throws RecognitionException {
		Rot_lContext _localctx = new Rot_lContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rot_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ROT_L);
			setState(58);
			match(NUMBER);
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

	public static class Rot_rContext extends ParserRuleContext {
		public TerminalNode ROT_R() { return getToken(LogoParser.ROT_R, 0); }
		public TerminalNode NUMBER() { return getToken(LogoParser.NUMBER, 0); }
		public Rot_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rot_r; }
	}

	public final Rot_rContext rot_r() throws RecognitionException {
		Rot_rContext _localctx = new Rot_rContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rot_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ROT_R);
			setState(61);
			match(NUMBER);
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

	public static class Set_colorContext extends ParserRuleContext {
		public TerminalNode SET_COLOR() { return getToken(LogoParser.SET_COLOR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(LogoParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LogoParser.NUMBER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(LogoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LogoParser.COLON, i);
		}
		public Set_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_color; }
	}

	public final Set_colorContext set_color() throws RecognitionException {
		Set_colorContext _localctx = new Set_colorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_set_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(SET_COLOR);
			setState(64);
			match(NUMBER);
			setState(65);
			match(COLON);
			setState(66);
			match(NUMBER);
			setState(67);
			match(COLON);
			setState(68);
			match(NUMBER);
			setState(69);
			match(COLON);
			setState(70);
			match(NUMBER);
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

	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode LET() { return getToken(LogoParser.LET, 0); }
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LET);
			setState(73);
			((Var_declContext)_localctx).ID = match(ID);

					symbolTable.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),0);
					System.out.println("Declarando variable");
				
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

	public static class Var_assignContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public List<TerminalNode> ID() { return getTokens(LogoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogoParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(LogoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(LogoParser.LET, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(76);
				match(LET);
				}
			}

			setState(79);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(80);
			match(ASSIGN);
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_OPEN:
			case NUMBER:
			case BOOLEAN:
			case STRING:
				{
				setState(81);
				((Var_assignContext)_localctx).expression = expression();
				}
				break;
			case ID:
				{
				setState(82);
				((Var_assignContext)_localctx).ID = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

					symbolTable.put((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),  ((Var_assignContext)_localctx).expression.value);
					System.out.println("Asignando valor a variable" + ((Var_assignContext)_localctx).expression.value);
				
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

	public static class SentenceContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentence);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				var_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				println();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				read();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public TerminalNode GT() { return getToken(LogoParser.GT, 0); }
		public TerminalNode LT() { return getToken(LogoParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(LogoParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(LogoParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(LogoParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LogoParser.NEQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LogoParser.NOT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LogoParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(LogoParser.PAR_CLOSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(93);
				match(NOT);
				setState(94);
				match(PAR_OPEN);
				}
			}

			setState(97);
			match(ID);
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(99);
			expression();
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_CLOSE) {
				{
				setState(100);
				match(PAR_CLOSE);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode INI_IF() { return getToken(LogoParser.INI_IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(LogoParser.THEN, 0); }
		public TerminalNode END_IF() { return getToken(LogoParser.END_IF, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LogoParser.ELSE, 0); }
		public List<TerminalNode> AND() { return getTokens(LogoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LogoParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(LogoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LogoParser.OR, i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(INI_IF);
			setState(104);
			condition();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				condition();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(THEN);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				sentence();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << READ) | (1L << ID))) != 0) );
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(118);
				match(ELSE);
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					sentence();
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << READ) | (1L << ID))) != 0) );
				}
			}

			setState(126);
			match(END_IF);
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

	public static class CicleContext extends ParserRuleContext {
		public TerminalNode INI_WHILE() { return getToken(LogoParser.INI_WHILE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode DO() { return getToken(LogoParser.DO, 0); }
		public TerminalNode END_WHILE() { return getToken(LogoParser.END_WHILE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LogoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LogoParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(LogoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LogoParser.OR, i);
		}
		public CicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicle; }
	}

	public final CicleContext cicle() throws RecognitionException {
		CicleContext _localctx = new CicleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cicle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(INI_WHILE);
			setState(129);
			condition();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				condition();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(DO);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				sentence();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << READ) | (1L << ID))) != 0) );
			setState(143);
			match(END_WHILE);
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

	public static class PrintlnContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(LogoParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PRINTLN);
			setState(146);
			((PrintlnContext)_localctx).expression = expression();
			System.out.println("Imprimiendo por pantalla" + ((PrintlnContext)_localctx).expression.value);
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

	public static class ReadContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode READ() { return getToken(LogoParser.READ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(READ);
			setState(150);
			((ReadContext)_localctx).expression = expression();
			System.out.println("Leyendo variable" + ((ReadContext)_localctx).expression.value);
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
		public TerminalNode INI_FUNC() { return getToken(LogoParser.INI_FUNC, 0); }
		public List<TerminalNode> ID() { return getTokens(LogoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogoParser.ID, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(LogoParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(LogoParser.PAR_CLOSE, 0); }
		public TerminalNode TWO_DOTS() { return getToken(LogoParser.TWO_DOTS, 0); }
		public TerminalNode END_FUNC() { return getToken(LogoParser.END_FUNC, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(LogoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LogoParser.COLON, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(INI_FUNC);
			setState(154);
			match(ID);
			setState(155);
			match(PAR_OPEN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(156);
				match(ID);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(157);
					match(COLON);
					setState(158);
					match(ID);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(166);
			match(PAR_CLOSE);
			setState(167);
			match(TWO_DOTS);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				sentence();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINTLN) | (1L << READ) | (1L << ID))) != 0) );
			setState(173);
			match(END_FUNC);
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

	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LogoParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(LogoParser.PAR_CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(LogoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LogoParser.COLON, i);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_execute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(176);
			match(PAR_OPEN);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) {
				{
				{
				{
				setState(177);
				expression();
				}
				{
				setState(178);
				match(COLON);
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						expression();
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(PAR_CLOSE);
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
		public Object value;
		public ExpoContext t1;
		public ExpoContext t2;
		public List<ExpoContext> expo() {
			return getRuleContexts(ExpoContext.class);
		}
		public ExpoContext expo(int i) {
			return getRuleContext(ExpoContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LogoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LogoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LogoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LogoParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((ExpressionContext)_localctx).t1 = expo();
			((ExpressionContext)_localctx).value =  (int)((ExpressionContext)_localctx).t1.value;
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(194);
					match(PLUS);
					setState(195);
					((ExpressionContext)_localctx).t2 = expo();
					((ExpressionContext)_localctx).value =  (int)_localctx.value + (int)((ExpressionContext)_localctx).t2.value;
					}
					break;
				case MINUS:
					{
					setState(198);
					match(MINUS);
					setState(199);
					((ExpressionContext)_localctx).t2 = expo();
					((ExpressionContext)_localctx).value =  (int)_localctx.value - (int)((ExpressionContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
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

	public static class ExpoContext extends ParserRuleContext {
		public Object value;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> EXPO() { return getTokens(LogoParser.EXPO); }
		public TerminalNode EXPO(int i) {
			return getToken(LogoParser.EXPO, i);
		}
		public ExpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expo; }
	}

	public final ExpoContext expo() throws RecognitionException {
		ExpoContext _localctx = new ExpoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((ExpoContext)_localctx).t1 = factor();
			((ExpoContext)_localctx).value =  (int)((ExpoContext)_localctx).t1.value;
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPO) {
				{
				{
				setState(209);
				match(EXPO);
				setState(210);
				((ExpoContext)_localctx).t2 = factor();
				((ExpoContext)_localctx).value =  (int)_localctx.value ^ (int)((ExpoContext)_localctx).t2.value;
				}
				}
				setState(217);
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

	public static class FactorContext extends ParserRuleContext {
		public Object value;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(LogoParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(LogoParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(LogoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(LogoParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(LogoParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(LogoParser.MOD, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).value =  (int)((FactorContext)_localctx).t1.value;
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(220);
					match(MULT);
					setState(221);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).value =  (int)_localctx.value * (int)((FactorContext)_localctx).t2.value;
					}
					break;
				case DIV:
					{
					setState(224);
					match(DIV);
					setState(225);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).value =  (int)_localctx.value / (int)((FactorContext)_localctx).t2.value;
					}
					break;
				case MOD:
					{
					setState(228);
					match(MOD);
					setState(229);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).value =  (int)_localctx.value % (int)((FactorContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(236);
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

	public static class TermContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token STRING;
		public Token BOOLEAN;
		public TerminalNode NUMBER() { return getToken(LogoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(LogoParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogoParser.BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LogoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoParser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value =  Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((TermContext)_localctx).STRING = match(STRING);
				((TermContext)_localctx).value =  (((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).value =  (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(PAR_OPEN);
				setState(244);
				expression();
				setState(245);
				match(PAR_CLOSE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00fc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\5\tP\n\t\3\t\3\t\3\t\3\t"+
		"\5\tV\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\5\13b\n\13\3\13\3"+
		"\13\3\13\3\13\5\13h\n\13\3\f\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3\f\3"+
		"\f\6\fu\n\f\r\f\16\fv\3\f\3\f\6\f{\n\f\r\f\16\f|\5\f\177\n\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\3\r\6\r\u008e\n\r"+
		"\r\r\16\r\u008f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00a2\n\20\f\20\16\20\u00a5\13\20\5\20\u00a7"+
		"\n\20\3\20\3\20\3\20\6\20\u00ac\n\20\r\20\16\20\u00ad\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba\13\21\7\21\u00bc\n"+
		"\21\f\21\16\21\u00bf\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00d8\n\23\f\23\16\23\u00db\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00eb\n\24"+
		"\f\24\16\24\u00ee\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u00fa\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\4\3\2\20\25\3\2\r\16\2\u0103\2*\3\2\2\2\4\65\3\2\2\2\68\3\2\2"+
		"\2\b;\3\2\2\2\n>\3\2\2\2\fA\3\2\2\2\16J\3\2\2\2\20O\3\2\2\2\22]\3\2\2"+
		"\2\24a\3\2\2\2\26i\3\2\2\2\30\u0082\3\2\2\2\32\u0093\3\2\2\2\34\u0097"+
		"\3\2\2\2\36\u009b\3\2\2\2 \u00b1\3\2\2\2\"\u00c2\3\2\2\2$\u00d1\3\2\2"+
		"\2&\u00dc\3\2\2\2(\u00f9\3\2\2\2*+\7\3\2\2+,\7!\2\2,\60\7\27\2\2-/\5\22"+
		"\n\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\7\30\2\2\64\3\3\2\2\2\65\66\7#\2\2\66\67\7\36\2\2\67"+
		"\5\3\2\2\289\7$\2\29:\7\36\2\2:\7\3\2\2\2;<\7%\2\2<=\7\36\2\2=\t\3\2\2"+
		"\2>?\7&\2\2?@\7\36\2\2@\13\3\2\2\2AB\7\'\2\2BC\7\36\2\2CD\7\33\2\2DE\7"+
		"\36\2\2EF\7\33\2\2FG\7\36\2\2GH\7\33\2\2HI\7\36\2\2I\r\3\2\2\2JK\7\4\2"+
		"\2KL\7!\2\2LM\b\b\1\2M\17\3\2\2\2NP\7\4\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2"+
		"\2\2QR\7!\2\2RU\7\26\2\2SV\5\"\22\2TV\7!\2\2US\3\2\2\2UT\3\2\2\2VW\3\2"+
		"\2\2WX\b\t\1\2X\21\3\2\2\2Y^\5\16\b\2Z^\5\20\t\2[^\5\32\16\2\\^\5\34\17"+
		"\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\23\3\2\2\2_`\7\17\2\2`b\7"+
		"\31\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7!\2\2de\t\2\2\2eg\5\"\22\2fh"+
		"\7\32\2\2gf\3\2\2\2gh\3\2\2\2h\25\3\2\2\2ij\7(\2\2jo\5\24\13\2kl\t\3\2"+
		"\2ln\5\24\13\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2"+
		"\2\2rt\7)\2\2su\5\22\n\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w~\3\2"+
		"\2\2xz\7*\2\2y{\5\22\n\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~x\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7+\2\2\u0081"+
		"\27\3\2\2\2\u0082\u0083\7,\2\2\u0083\u0088\5\24\13\2\u0084\u0085\t\3\2"+
		"\2\u0085\u0087\5\24\13\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008d\7-\2\2\u008c\u008e\5\22\n\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\7.\2\2\u0092\31\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0095"+
		"\5\"\22\2\u0095\u0096\b\16\1\2\u0096\33\3\2\2\2\u0097\u0098\7\6\2\2\u0098"+
		"\u0099\5\"\22\2\u0099\u009a\b\17\1\2\u009a\35\3\2\2\2\u009b\u009c\7/\2"+
		"\2\u009c\u009d\7!\2\2\u009d\u00a6\7\31\2\2\u009e\u00a3\7!\2\2\u009f\u00a0"+
		"\7\33\2\2\u00a0\u00a2\7!\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\32\2\2\u00a9\u00ab\7\35\2\2\u00aa\u00ac\5\22\n\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7\60\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\7!\2"+
		"\2\u00b2\u00bd\7\31\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b8\7\33\2\2\u00b5"+
		"\u00b7\5\"\22\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c3\5$\23\2\u00c3\u00ce\b\22\1\2\u00c4\u00c5\7\7\2\2"+
		"\u00c5\u00c6\5$\23\2\u00c6\u00c7\b\22\1\2\u00c7\u00cd\3\2\2\2\u00c8\u00c9"+
		"\7\b\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\b\22\1\2\u00cb\u00cd\3\2\2\2"+
		"\u00cc\u00c4\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf#\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\5&\24\2\u00d2\u00d9\b\23\1\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\5"+
		"&\24\2\u00d5\u00d6\b\23\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da%\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00dd\5(\25\2\u00dd\u00ec\b\24\1\2\u00de\u00df"+
		"\7\t\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\b\24\1\2\u00e1\u00eb\3\2\2\2"+
		"\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5(\25\2\u00e4\u00e5\b\24\1\2\u00e5\u00eb"+
		"\3\2\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5(\25\2\u00e8\u00e9\b\24\1\2"+
		"\u00e9\u00eb\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e6"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\'\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\36\2\2\u00f0\u00fa\b\25\1"+
		"\2\u00f1\u00f2\7 \2\2\u00f2\u00fa\b\25\1\2\u00f3\u00f4\7\37\2\2\u00f4"+
		"\u00fa\b\25\1\2\u00f5\u00f6\7\31\2\2\u00f6\u00f7\5\"\22\2\u00f7\u00f8"+
		"\7\32\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f1\3\2\2\2"+
		"\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa)\3\2\2\2\31\60OU]agov|"+
		"~\u0088\u008f\u00a3\u00a6\u00ad\u00b8\u00bd\u00cc\u00ce\u00d9\u00ea\u00ec"+
		"\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}