// Generated from ./BasicParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code pairbaseType}
	 * labeled alternative in {@link BasicParser#pairElemType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairbaseType(@NotNull BasicParser.PairbaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(@NotNull BasicParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull BasicParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link BasicParser#binaryoper3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(@NotNull BasicParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noteq}
	 * labeled alternative in {@link BasicParser#binaryoper4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteq(@NotNull BasicParser.NoteqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressParentheses}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressParentheses(@NotNull BasicParser.ExpressParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link BasicParser#binaryoper3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(@NotNull BasicParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressNotNegUnary}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressNotNegUnary(@NotNull BasicParser.ExpressNotNegUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(@NotNull BasicParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull BasicParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fst}
	 * labeled alternative in {@link BasicParser#pairelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFst(@NotNull BasicParser.FstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code free}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFree(@NotNull BasicParser.FreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignLhsArrayElement}
	 * labeled alternative in {@link BasicParser#assignlhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignLhsArrayElement(@NotNull BasicParser.AssignLhsArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code println}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(@NotNull BasicParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull BasicParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBinary6}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBinary6(@NotNull BasicParser.ExpressBinary6Context ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#pairLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairLiteral(@NotNull BasicParser.PairLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link BasicParser#binaryoper2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull BasicParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBinary5}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBinary5(@NotNull BasicParser.ExpressBinary5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignRhsCall}
	 * labeled alternative in {@link BasicParser#assignrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRhsCall(@NotNull BasicParser.AssignRhsCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link BasicParser#binaryoper2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull BasicParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignlhsIdent}
	 * labeled alternative in {@link BasicParser#assignlhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignlhsIdent(@NotNull BasicParser.AssignlhsIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBinary2}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBinary2(@NotNull BasicParser.ExpressBinary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBinary1}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBinary1(@NotNull BasicParser.ExpressBinary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link BasicParser#binaryoper6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull BasicParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairArrayType}
	 * labeled alternative in {@link BasicParser#pairElemType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairArrayType(@NotNull BasicParser.PairArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignrhsexpression}
	 * labeled alternative in {@link BasicParser#assignrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignrhsexpression(@NotNull BasicParser.AssignrhsexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBinary4}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBinary4(@NotNull BasicParser.ExpressBinary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link BasicParser#binaryoper1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(@NotNull BasicParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBinary3}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBinary3(@NotNull BasicParser.ExpressBinary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementparens}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementparens(@NotNull BasicParser.StatementparensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exit}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(@NotNull BasicParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link BasicParser#binaryoper5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull BasicParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(@NotNull BasicParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignRhsNewPair}
	 * labeled alternative in {@link BasicParser#assignrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRhsNewPair(@NotNull BasicParser.AssignRhsNewPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(@NotNull BasicParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code le}
	 * labeled alternative in {@link BasicParser#binaryoper3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(@NotNull BasicParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basetype}
	 * labeled alternative in {@link BasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasetype(@NotNull BasicParser.BasetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#pairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairType(@NotNull BasicParser.PairTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressPositiveIntliteral}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressPositiveIntliteral(@NotNull BasicParser.ExpressPositiveIntliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pair}
	 * labeled alternative in {@link BasicParser#pairElemType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull BasicParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#arrayelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayelement(@NotNull BasicParser.ArrayelementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link BasicParser#binaryoper1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull BasicParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBeginNeg}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBeginNeg(@NotNull BasicParser.ExpressBeginNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressPaitLiteral}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressPaitLiteral(@NotNull BasicParser.ExpressPaitLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressIdent}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressIdent(@NotNull BasicParser.ExpressIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull BasicParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraytype}
	 * labeled alternative in {@link BasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraytype(@NotNull BasicParser.ArraytypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(@NotNull BasicParser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull BasicParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressStrliteral}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressStrliteral(@NotNull BasicParser.ExpressStrliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(@NotNull BasicParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equ}
	 * labeled alternative in {@link BasicParser#binaryoper4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu(@NotNull BasicParser.EquContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignRhsArrayLiteral}
	 * labeled alternative in {@link BasicParser#assignrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRhsArrayLiteral(@NotNull BasicParser.AssignRhsArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull BasicParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusexpre}
	 * labeled alternative in {@link BasicParser#beginNeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusexpre(@NotNull BasicParser.MinusexpreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusjustlit}
	 * labeled alternative in {@link BasicParser#beginNeg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusjustlit(@NotNull BasicParser.MinusjustlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseTypeArray}
	 * labeled alternative in {@link BasicParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeArray(@NotNull BasicParser.BaseTypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link BasicParser#binaryoper3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(@NotNull BasicParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code snd}
	 * labeled alternative in {@link BasicParser#pairelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnd(@NotNull BasicParser.SndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairTypeArray}
	 * labeled alternative in {@link BasicParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairTypeArray(@NotNull BasicParser.PairTypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull BasicParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull BasicParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link BasicParser#binaryoper1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull BasicParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull BasicParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedArray}
	 * labeled alternative in {@link BasicParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedArray(@NotNull BasicParser.NestedArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whiledo}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledo(@NotNull BasicParser.WhiledoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignRhsPairElem}
	 * labeled alternative in {@link BasicParser#assignrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRhsPairElem(@NotNull BasicParser.AssignRhsPairElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairtype}
	 * labeled alternative in {@link BasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairtype(@NotNull BasicParser.PairtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressArrayElement}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressArrayElement(@NotNull BasicParser.ExpressArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(@NotNull BasicParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressBoolLiteral}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressBoolLiteral(@NotNull BasicParser.ExpressBoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignlhsPairElement}
	 * labeled alternative in {@link BasicParser#assignlhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignlhsPairElement(@NotNull BasicParser.AssignlhsPairElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressCharliteral}
	 * labeled alternative in {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressCharliteral(@NotNull BasicParser.ExpressCharliteralContext ctx);
}