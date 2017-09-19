import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SemanticChecker extends BasicParserBaseVisitor<Type> {

	private SymbolTable<Type> table;
	private FunctionTable<Type> functable;
	private Function<Type> currentFunction;
	private Map<String, Integer> funcParasSpace;
	private Scope currentScope;
	private Scope mainScope;
	boolean minus;
	boolean takeFun;
	private boolean infunc;
	private Map<String, Type> parasScope;
	private List<Type> readType;
	private List<Type> printType;
	private List<Type> printlnType;

	public SemanticChecker() {

	}

	public FunctionTable<Type> getFuncTable() {
		return functable;
	}

	public List<Type> getRead() {
		return readType;
	}

	public List<Type> getPrint() {
		return printType;
	}

	public List<Type> getPrintln() {
		return printlnType;
	}

	public Scope getMainScope() {
		return mainScope;
	}

	@Override
	public Type visitProg(BasicParser.ProgContext ctx) {
		infunc = false;
		table = new SymbolTable<Type>();
		functable = new FunctionTable<Type>();
		funcParasSpace = new HashMap<>();
		readType = new LinkedList<Type>();
		printType = new LinkedList<Type>();
		printlnType = new LinkedList<Type>();

		mainScope = new Scope();
		currentFunction = null;
		minus = false;
		// initialise
		takeFun = false;
		for (BasicParser.FunctionContext function : ctx.function()) {
			visit(function);
		}
		takeFun = true;
		currentFunction = null;
		currentScope = mainScope;
		for (BasicParser.FunctionContext function : ctx.function()) {
			visit(function);
		}
		currentScope = mainScope;
		visit(ctx.statement());
		return null;
	}

	@Override
	public Type visitFunction(@NotNull BasicParser.FunctionContext ctx) {
		funcParasSpace.put(ctx.IDENT().getText(), 0);
		if (takeFun) {
			String ident = ctx.IDENT().getText();
			System.out.println(ident);
			BasicParser.ParameterListContext p = ctx.parameterList();
			if (!functable.contains(ident)) {
				System.out.println("Function don't exist");
				exitWithError();
			}
			Function<Type> func = functable.lookupCurrLevelOnly(ident);
			currentFunction = func;
			parasScope = new LinkedHashMap<>();
			infunc = true;
			if (p != null) { // if have parameters
				visit(p); // visit parameter list
			}
			infunc = false;
			table.newMap2();
			table.newMap();

			Scope save = currentScope;
			Scope newScope = new Scope(currentScope);
			currentScope.addChildScope(newScope);
			currentScope = newScope;
			for (String s : parasScope.keySet()) {
				currentScope.add(s, parasScope.get(s));
			}
			parasScope.clear();
			visit(ctx.statement());

			currentScope = save;

			if (table.getTop2() == 0) {
				System.out.println("Function no return: " + ctx.getText());
				exitWithSyntacError();
			}
			table.removeMap2();
			table.removeMap();
			currentFunction = null;
			table.deleteEnc();
			return null;
		} else {
			parasScope = new LinkedHashMap<>();
			BasicParser.TypeContext returnType = ctx.type();
			String ident = ctx.IDENT().getText();
			if (functable.contains(ident)) {
				System.out.println("Function nam ealready exist");
				exitWithError();
			}
			BasicParser.ParameterListContext p = ctx.parameterList();
			if (visit(returnType) == null) {
				System.out.println("return type of function is null");
				exitWithError();
			}
			Function<Type> func = new Function<Type>(ident, visit(returnType),
					null); // visit
			// return
			// type
			currentFunction = func;
			functable.add(ident, func);
			if (p != null) { // if have parameters
				visit(p); // visit parameter list
			}
			table.deleteEnc();
			currentFunction = null;
			return null;
		}
	}

	@Override
	public Type visitParameterList(@NotNull BasicParser.ParameterListContext ctx) {
		List<BasicParser.ParameterContext> parameterlist = ctx.parameter();
		List<Type> paralist = new ArrayList<Type>();
		for (BasicParser.ParameterContext parameter : parameterlist) {
			paralist.add(visit(parameter)); // visit parameters
		}
		currentFunction.addparas(paralist);
		return null;
	}

	@Override
	public Type visitParameter(@NotNull BasicParser.ParameterContext ctx) {
		String ident = ctx.IDENT().getText();
		Type paraType = visit(ctx.type());
		System.out.println("func name: " + currentFunction.getName());
		System.out.println(funcParasSpace.get(currentFunction.getName()));
		int space = funcParasSpace.get(currentFunction.getName())
				+ getSpace(paraType);

		funcParasSpace.put(currentFunction.getName(), space);
		currentFunction.addParam(paraType, ident);
		table.addToEnc(ident, paraType); // add parameter as variable to
											// enclosing symbol table
		parasScope.put(ident, paraType);
		if (takeFun && !infunc)
			parasScope.put(ident, paraType);
		return paraType;
	}

	@Override
	public Type visitDeclare(@NotNull BasicParser.DeclareContext ctx) {
		System.out.println("VISIT DEclare");
		String variableName = ctx.IDENT().getText();
		Type identType = visit(ctx.type());
		System.out.println("VISIT assign rhs");
		Type rhsType = visit(ctx.assignrhs());
		if(ctx.assignrhs().getText().equals("null")){
			rhsType = identType;
		}
		System.out.println("rhsType = " + rhsType);
		System.out.println("ctx.type().getText() = " + visit(ctx.type()));
		//System.out.println("rhsType = " + ((PairType)rhsType).elemtype1);
		if (rhsType != null && identType != null) {
			if (rhsType instanceof ArrayType && identType instanceof ArrayType) {
				if (((ArrayType) rhsType).getTypeOfArray() != ((ArrayType) identType)
						.getTypeOfArray()) {
					((ArrayType) rhsType)
							.setTypeOfArray(((ArrayType) identType)
									.getTypeOfArray());
				}
			}
		}

		if (table.containsName(variableName)) {

			if (!table.EncContain(variableName)) {

				System.out.println("Variable name " + variableName
						+ " aready exist in current scope");
				table.pr();
				exitWithError();
				return identType;

			} else {

				System.out.println("--------first------"); // in func
				currentScope.add(variableName, rhsType);
				System.out.println("add1: " + variableName + " " + rhsType);
				table.add(variableName, identType);
				return identType;

			}

		} else if (!rhsType.equals(identType)) {
			System.out.println("Variable '" + variableName
					+ "' type mismatch with expression: (" + ctx.getText()
					+ ") Expected: " + identType + ", Actual: " + rhsType);
			exitWithError();
			return identType;
		} else {
			if (currentFunction != null) {
				currentScope.add(variableName, rhsType);
				System.out.println("add2: " + variableName + " " + rhsType);
				System.out.println("--------second------"); // in func
				table.add(variableName, rhsType);
			} else {
				currentScope.add(variableName, rhsType);
				System.out.println("add3: " + variableName + " " + rhsType);
				System.out.println("--------third------"); // not in func
				table.add(variableName, rhsType);
			}
			return identType;
		}
	}

	@Override
	public Type visitArrayLiteral(@NotNull BasicParser.ArrayLiteralContext ctx) {
		Type t = null;
		if (ctx.expression().isEmpty()) {
			ArrayType a = new ArrayType();
			a.setLength(0);
			return a;
		}
		int l = 0;
		ArrayType a = new ArrayType(t);
		for (BasicParser.ExpressionContext expr : ctx.expression()) {
			if (t == null) {
				t = visit(expr);
			} else {
				if (!t.equals(visit(expr))) {
					System.out.println("Type mismatch (" + expr.getText()
							+ ") Expected: " + t + ", Actual: " + visit(expr));
					// System.out.println("Type " + t + "in expression" +
					// expr.getText() +
					// " is not same type as the rest of array");
					exitWithError();
				}
			}
			a.incrementLength();
		}
		a.setInnerType(t);
		return a;
	}

	public int getSpace(Type type) {
		if (type instanceof IntType || type instanceof StringType
				|| type instanceof ArrayType || type instanceof PairType) {
			return 4;
		} else {
			return 1;
		}
	}

	@Override
	public Type visitBaseTypeArray(@NotNull BasicParser.BaseTypeArrayContext ctx) {

		Type t = visit(ctx.baseType());
		if (t == null) {
			System.out
					.println("Null return type : " + ctx.baseType().getText());
			exitWithError();
		}
		return new ArrayType(t);
	}

	@Override
	public Type visitPairTypeArray(@NotNull BasicParser.PairTypeArrayContext ctx) {

		Type t = new ArrayType(visit(ctx.pairType()));
		System.out.println(t + "-------");
		return t;
	}

	@Override
	public Type visitNestedArray(@NotNull BasicParser.NestedArrayContext ctx) {

		return new ArrayType(visit(ctx.arrayType()));
	}

	@Override
	public Type visitPair(@NotNull BasicParser.PairContext ctx) {

		return new PairType();
	}

	@Override
	public Type visitPairArrayType(@NotNull BasicParser.PairArrayTypeContext ctx) {

		return visit(ctx.arrayType());
	}

	public Map<String, Integer> getFuncParaSpace() {
		return funcParasSpace;
	}

	@Override
	public Type visitPairbaseType(@NotNull BasicParser.PairbaseTypeContext ctx) {

		return visit(ctx.baseType());
	}

	@Override
	public Type visitArraytype(@NotNull BasicParser.ArraytypeContext ctx) {

		return (visit(ctx.arrayType()));
	}

	@Override
	public Type visitAssign(@NotNull BasicParser.AssignContext ctx) {

		Type lhsType = visit(ctx.assignlhs());

		Type rhsType = visit(ctx.assignrhs());

		if (lhsType == null) {
			System.out.println(ctx.assignlhs().getText() + " has no type:");
			exitWithError();
			// return null;
		} else if (rhsType == null) {
			if (lhsType instanceof PairType) {

			} else {
				System.out.println(ctx.assignrhs().getText() + " has no type");
				exitWithError();
				// return null;
			}
		} else if (!lhsType.equals(rhsType)) {
			System.out.println("Type mismatch in assignment statement: ("
					+ lhsType + ") and (" + rhsType + ")");
			exitWithError();
			// return null;
		}
		return rhsType;
	}

	@Override
	public Type visitAssignlhsPairElement(
			@NotNull BasicParser.AssignlhsPairElementContext ctx) {

		Type type = visit(ctx.pairelement());
		return type;
	}

	@Override
	public Type visitAssignlhsIdent(
			@NotNull BasicParser.AssignlhsIdentContext ctx) {

		String variableName = ctx.getText();
		if (table.containsName(variableName)) {
			Type t = table.lookupCurrLevelOnly(variableName);

			return t;
		} else if (table.containsNameAll(variableName)) {
			Type t = table.lookupCurrLevelAndEnclosingLevels(variableName);
			System.out.println("all " + table.containsNameAll(variableName));
			// table.pr();
			return t;
		} else {
			System.out.println("variable doesn't exist: " + variableName);
			exitWithError();
			return null;
		}
	}

	@Override
	public Type visitAssignLhsArrayElement(
			@NotNull BasicParser.AssignLhsArrayElementContext ctx) {

		return visit(ctx.arrayelement());
	}

	@Override
	public Type visitGreater(@NotNull BasicParser.GreaterContext ctx) {

		return null;
	}

	@Override
	public Type visitNoteq(@NotNull BasicParser.NoteqContext ctx) {

		return null;
	}

	@Override
	public Type visitGe(@NotNull BasicParser.GeContext ctx) {

		return null;
	}

	@Override
	public Type visitSkip(@NotNull BasicParser.SkipContext ctx) {

		return null;
	}

	@Override
	public Type visitFst(@NotNull BasicParser.FstContext ctx) {

		Type type = visit(ctx.expression());
		if (!(type instanceof PairType)) {
			System.out.println("fst to not pairtype");
			exitWithError();
			return null;
		}
		return ((PairType) type).elemtype1;
	}

	@Override
	public Type visitFree(@NotNull BasicParser.FreeContext ctx) {

		BasicParser.ExpressionContext exp = ctx.expression();
		Type t = visit(exp);
		if (t instanceof PairType || t instanceof ArrayType) {
			return t; // Check that expression evaluates to a valid reference to
						// an Array or a Pair
		} else {
			System.out.println("Expression is not a Pair or an Array");
			exitWithError();
			// x
			return null;
		}
	}

	@Override
	public Type visitExpressArrayElement(
			@NotNull BasicParser.ExpressArrayElementContext ctx) {

		return visit(ctx.arrayelement());
	}

	@Override
	public Type visitExpressBoolLiteral(
			@NotNull BasicParser.ExpressBoolLiteralContext ctx) {

		return new BoolType();
	}

	@Override
	public Type visitExpressPaitLiteral(
			@NotNull BasicParser.ExpressPaitLiteralContext ctx) {

		return new PairType();
	}

	@Override
	public Type visitExpressParentheses(
			@NotNull BasicParser.ExpressParenthesesContext ctx) {

		// table.newMap();
		Type t = visit(ctx.expression());
		// table.removeMap();
		return t;

	}

	@Override
	public Type visitExpressBinary1(
			@NotNull BasicParser.ExpressBinary1Context ctx) {
		Type lhstype = visit(ctx.expression(0));
		Type rhstype = visit(ctx.expression(1));
		BasicParser.ExpressionContext lhs = ctx.expression(0);
		BasicParser.ExpressionContext rhs = ctx.expression(1);
		switch (ctx.binaryoper1().getText().trim()) {
		case "*":
		case "/":
		case "%":
			if (!(lhstype instanceof IntType)) {
				System.out.println("Type mismatch in (" + lhs.getText()
						+ ") Expected: Int, Actual: " + lhstype);
				exitWithError();
			} else if (!(rhstype instanceof IntType)) {
				System.out.println("Type mismatch in (" + rhs.getText()
						+ ") Expected: Int, Actual: " + rhstype);
				exitWithError();
			}
			return new IntType();
		default:
			System.out.println("Invalid type of binary op1: |"
					+ ctx.binaryoper1().getText() + "|");
			exitWithError();
			return null;
		}
	}

	@Override
	public Type visitExpressBinary2(
			@NotNull BasicParser.ExpressBinary2Context ctx) {
		Type lhstype = visit(ctx.expression(0));
		Type rhstype = visit(ctx.expression(1));
		BasicParser.ExpressionContext lhs = ctx.expression(0);
		BasicParser.ExpressionContext rhs = ctx.expression(1);
		switch (ctx.binaryoper2().getText().trim()) {
		case "+":
		case "-":
			if (!(lhstype instanceof IntType)) {
				System.out.println("Type mismatch in (" + lhs.getText()
						+ "). Expected: Int, Actual: " + lhstype);
				exitWithError();
			} else if (!(rhstype instanceof IntType)) {
				System.out.println("Type mismatch in (" + rhs.getText()
						+ "). Expected: Int, Actual: " + rhstype);
				exitWithError();
			}
			return new IntType();

		default:
			System.out.println("Invalid type of binary op1: |"
					+ ctx.binaryoper2().getText() + "|");
			exitWithError();
			return null;
		}
	}

	@Override
	public Type visitExpressBinary3(
			@NotNull BasicParser.ExpressBinary3Context ctx) {
		Type lhstype = visit(ctx.expression(0));
		Type rhstype = visit(ctx.expression(1));
		BasicParser.ExpressionContext lhs = ctx.expression(0);
		BasicParser.ExpressionContext rhs = ctx.expression(1);
		switch (ctx.binaryoper3().getText().trim()) {
		case ">":
		case ">=":
		case "<":
		case "<=":
			if (ctx.binaryoper3().getText().trim().equals("==")
					|| ctx.binaryoper3().getText().trim().equals("!=")) {
				if (lhstype instanceof BoolType) {
					if (!(rhstype instanceof BoolType)) {
						System.out.println("Type mismatch in (" + rhs.getText()
								+ "). Expected: Bool, Actual: " + rhstype);
						exitWithError();
						return new BoolType();
					} else {
						return new BoolType();
					}
				}
			}
			System.out.println("which is : "
					+ ctx.binaryoper3().getText().trim() + " | "
					+ lhstype.toString());
			if (lhstype instanceof StringType) {
				if (!(rhstype instanceof StringType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: String, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else if (lhstype instanceof IntType) {
				if (!(rhstype instanceof IntType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: Int, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else if (lhstype instanceof CharType) {
				if (!(rhstype instanceof CharType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: Char, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else {
				System.out.println("Type mismatch in (" + lhs.getText()
						+ "). Expected: Bool | String | Char | Int, Actual: "
						+ lhstype);
				exitWithError();
				return null;
			}
			return new BoolType();

		default:
			System.out.println("invalid type of binary op: |"
					+ ctx.binaryoper3().getText() + "|");
			exitWithError();
			return null;
		}
	}

	@Override
	public Type visitExpressBinary4(
			@NotNull BasicParser.ExpressBinary4Context ctx) {
		Type lhstype = visit(ctx.expression(0));
		Type rhstype = visit(ctx.expression(1));
		BasicParser.ExpressionContext lhs = ctx.expression(0);
		BasicParser.ExpressionContext rhs = ctx.expression(1);
		switch (ctx.binaryoper4().getText().trim()) {

		case "==":
		case "!=":
			if (ctx.binaryoper4().getText().trim().equals("==")
					|| ctx.binaryoper4().getText().trim().equals("!=")) {
				if (lhstype instanceof BoolType) {
					if (!(rhstype instanceof BoolType)) {
						System.out.println("Type mismatch in (" + rhs.getText()
								+ "). Expected: Bool, Actual: " + rhstype);
						exitWithError();
						return new BoolType();
					} else {
						return new BoolType();
					}
				}
			}
			System.out.println("which is : "
					+ ctx.binaryoper4().getText().trim() + "|"
					+ lhstype.toString());
			if (lhs.getText().equals("null") || rhs.getText().equals("null")) {
				return new BoolType();
			}
			if (lhstype instanceof StringType) {
				if (!(rhstype instanceof StringType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: String, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else if (lhstype instanceof IntType) {
				if (!(rhstype instanceof IntType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: Int, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else if (lhstype instanceof CharType) {
				if (!(rhstype instanceof CharType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: Char, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else if (lhstype instanceof PairType) {
				if (!(rhstype instanceof PairType)) {
					System.out.println("Type mismatch in (" + rhs.getText()
							+ "). Expected: Pair, Actual: " + rhstype);
					exitWithError();
					return null;
				}
			} else {
				System.out.println("Type mismatch in (" + lhs.getText()
						+ "). Expected: Bool | String | Char | Int, Actual: "
						+ lhstype);
				exitWithError();
				return null;
			}
			return new BoolType();

		default:
			System.out.println("invalid type of binary op: |"
					+ ctx.binaryoper4().getText() + "|");
			exitWithError();
			return null;
		}

	}

	@Override
	public Type visitExpressBinary5(
			@NotNull BasicParser.ExpressBinary5Context ctx) {

		Type lhstype = visit(ctx.expression(0));
		Type rhstype = visit(ctx.expression(1));
		BasicParser.ExpressionContext lhs = ctx.expression(0);
		BasicParser.ExpressionContext rhs = ctx.expression(1);
		switch (ctx.binaryoper5().getText().trim()) {
		case "&&":
			System.out.println("and or or");
			if (!(lhstype instanceof BoolType)) {
				System.out.println("Type mismatch in (" + lhs.getText()
						+ "). Expected: Bool, Actual: " + lhstype);
				exitWithError();
			} else if (!(rhstype instanceof BoolType)) {
				System.out.println("Type mismatch in (" + rhs.getText()
						+ "). Expected: Bool, Actual: " + rhstype);
				exitWithError();
			}

			return new BoolType();
		default:
			System.out.println("invalid type of binary op: |"
					+ ctx.binaryoper5().getText() + "|");
			exitWithError();
			return null;
		}

	}

	@Override
	public Type visitExpressBinary6(
			@NotNull BasicParser.ExpressBinary6Context ctx) {
		Type lhstype = visit(ctx.expression(0));
		Type rhstype = visit(ctx.expression(1));
		BasicParser.ExpressionContext lhs = ctx.expression(0);
		BasicParser.ExpressionContext rhs = ctx.expression(1);
		switch (ctx.binaryoper6().getText().trim()) {
		case "||":
			System.out.println("and or or");
			if (!(lhstype instanceof BoolType)) {
				System.out.println("Type mismatch in (" + lhs.getText()
						+ "). Expected: Bool, Actual: " + lhstype);
				exitWithError();
			} else if (!(rhstype instanceof BoolType)) {
				System.out.println("Type mismatch in (" + rhs.getText()
						+ "). Expected: Bool, Actual: " + rhstype);
				exitWithError();
			}
			return new BoolType();
		default:
			System.out.println("invalid type of binary op: |"
					+ ctx.binaryoper6().getText() + "|");
			exitWithError();
			return null;
		}

	}

	@Override
	public Type visitExpressNotNegUnary(
			@NotNull BasicParser.ExpressNotNegUnaryContext ctx) {

		Type argtype = visit(ctx.expression());
		switch (ctx.NOTNEGUNARYOPER().getText().trim()) {
		case "!":
			if (!(argtype instanceof BoolType)) {
				System.out
						.println("("
								+ ctx.expression()
								+ "): Unary operator '!' must be followed by a boolean");
				exitWithError();
				return null;
			}
			return argtype;
		case "-":
			if (!(argtype instanceof IntType)) {
				System.out.println("(" + ctx.expression()
						+ "): Unary operator '-' must be followed by a int");
				exitWithError();
				return null;
			}
			return argtype;
		case "len":
			if (!(argtype instanceof ArrayType)) {
				System.out.println("(" + ctx.expression()
						+ "): Unary operator 'len' must be followed by a list");
				exitWithError();
				return null;
			}
			return ((ArrayType) argtype).arrayType;
		case "ord":
			if (!(argtype instanceof CharType)) {
				System.out.println("(" + ctx.expression()
						+ "): Unary operator 'ord' must be followed by a char");
				exitWithError();
				return null;
			}
			return new IntType();
		case "chr":
			if (!(argtype instanceof IntType)) {
				System.out.println("(" + ctx.expression()
						+ "): Unary operator 'chr' must be followed by a int");
				exitWithError();
			}
			return new CharType();
		default:
			System.out.println("(" + ctx.expression()
					+ "): Invalid type of unary operator");
			exitWithError();
			return null;
		}
	}

	@Override
	public Type visitExpressBeginNeg(
			@NotNull BasicParser.ExpressBeginNegContext ctx) {
		minus = true;
		return visit(ctx.beginNeg());
	}

	@Override
	public Type visitExpressIdent(@NotNull BasicParser.ExpressIdentContext ctx) {
		System.out.println("visit expression ident");
		String variableName = ctx.getText();

		// System.out.println(variableName);
		if (table.containsName(variableName)) {
			Type t = table.lookupCurrLevelOnly(variableName);
			return t;
		} else if (table.containsNameAll(variableName)) {
			Type t = table.lookupCurrLevelAndEnclosingLevels(variableName);
			return t;
		} else {
			System.out.println("Variable '" + variableName + "' doesn't exist");
			System.out.println(ctx.getParent().getText());
			table.pr();
			exitWithError();
			return null;
		}
	}

	@Override
	public Type visitExpressCharliteral(
			@NotNull BasicParser.ExpressCharliteralContext ctx) {

		return new CharType();
	}

	@Override
	public Type visitExpressStrliteral(
			@NotNull BasicParser.ExpressStrliteralContext ctx) {

		return new StringType();
	}

	@Override
	public Type visitExpressPositiveIntliteral(
			@NotNull BasicParser.ExpressPositiveIntliteralContext ctx) {

		String strnum = ctx.POSITIVEINTLITERAL().getText();
		long num = Long.parseLong(strnum);
		if (minus) {
			if (num - (long) (Integer.MAX_VALUE) > 1) {
				System.out.println(num + " out of range minus : ");
				exitWithSyntacError();
			}
			minus = false;
			return new IntType();
		} else {
			if (num > (long) Integer.MAX_VALUE) {
				System.out.println(num + " out of range positive");
				exitWithSyntacError();
			}
			return new IntType();
		}
	}

	@Override
	public Type visitPrintln(@NotNull BasicParser.PrintlnContext ctx) {
		System.out.println("visit println");
		Type t = visit(ctx.expression());
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA t = " + t.toString());
		printlnType.add(t);
		return t;
	}

	@Override
	public Type visitPairLiteral(@NotNull BasicParser.PairLiteralContext ctx) {
		return null;
	}

	@Override
	public Type visitPlus(@NotNull BasicParser.PlusContext ctx) {
		return null;
	}

	@Override
	public Type visitMinus(@NotNull BasicParser.MinusContext ctx) {

		return null;
	}

	@Override
	public Type visitOr(@NotNull BasicParser.OrContext ctx) {

		return null;
	}

	@Override
	public Type visitMod(@NotNull BasicParser.ModContext ctx) {

		return null;
	}

	@Override
	public Type visitStatementparens(
			@NotNull BasicParser.StatementparensContext ctx) {

		table.newMap();
		Scope save = currentScope;
		Scope newScope = new Scope(currentScope);
		currentScope.addChildScope(newScope);
		currentScope = newScope;
		Type t = visit(ctx.statement());
		currentScope = save;
		table.removeMap();
		return t;
	}

	@Override
	public Type visitExit(@NotNull BasicParser.ExitContext ctx) {

		if (!(visit(ctx.expression()) instanceof IntType)) {
			System.out.println("exit code must be integer");
			exitWithError();
		}
		if (currentFunction != null) {
			table.markReturn();
		}
		return null;
	}

	@Override
	public Type visitAnd(@NotNull BasicParser.AndContext ctx) {

		return null;
	}

	@Override
	public Type visitLe(@NotNull BasicParser.LeContext ctx) {

		return null;
	}

	@Override
	public Type visitPairtype(@NotNull BasicParser.PairtypeContext ctx) {

		Type c = visit(ctx.pairType());

		return c;

	}

	@Override
	public Type visitPairType(@NotNull BasicParser.PairTypeContext ctx) {
		return new PairType(visit(ctx.pairElemType(0)),
				visit(ctx.pairElemType(1)));
	}

	@Override
	public Type visitArrayelement(@NotNull BasicParser.ArrayelementContext ctx) {
		String variableName = ctx.IDENT().getText();
		List<BasicParser.ExpressionContext> expList = ctx.expression();
		Type expreType = null;
		Type t = null;
		if (table.containsName(variableName)) {
			t = table.lookupCurrLevelOnly(variableName);
		} else if (table.containsNameAll(variableName)) {
			t = table.lookupCurrLevelAndEnclosingLevels(variableName);
		} else {
			System.out.println("Variable " + variableName + " doesn't exist");
			System.out.println(ctx.getText());
			table.pr2();
			exitWithError();
			return null;
		}
		if (t instanceof StringType && expList.size() == 1) {
			return new CharType();
		} else if (t instanceof ArrayType) {

		} else {
			System.out.println("t = " + t);
			System.out.println("variableName = " + variableName);
			// System.out.println("Type of variable is not array or it is string. String cannot be nested");
			System.out.println("Type mismatch in '" + variableName
					+ "'. Expected: Array, Actual: " + t);
			exitWithError();
			return null;
		}
		for (BasicParser.ExpressionContext x : expList) {
			expreType = visit(x);
			if (!(expreType instanceof IntType)) {
				System.out.println("Type mismatch in (" + x.getText()
						+ "). Expected: Int, Actual: " + t);
				exitWithError();
				return null;
			}
			if (t instanceof ArrayType) {

			} else {
				System.out.println("Type mismatch in '" + variableName
						+ "'. Expected: Array, Actual: " + t);
				// System.out.println(variableName + " is not array type");
				exitWithError();
			}
			t = ((ArrayType) t).arrayType;
			if (t == null) {

				exitWithError();
			}

		}
		return t;
	}

	@Override
	public Type visitDiv(@NotNull BasicParser.DivContext ctx) {

		return null;
	}

	@Override
	public Type visitIfthenelse(@NotNull BasicParser.IfthenelseContext ctx) {
		Type t = visit(ctx.expression());
		if (!(t instanceof BoolType)) {
			System.out.println("Type mismatch in ("
					+ ctx.expression().getText()
					+ "). Expected: Bool, Actual: " + t);
			// System.out.println("Expression " + ctx.expression().getText() +
			// " in if statement is not of Bool type");
			exitWithError();
		}
		boolean f = false;
		boolean s = false;
		table.newMap2();
		table.newMap();

		Scope save = currentScope;
		Scope newScope = new Scope(currentScope);
		currentScope.addChildScope(newScope);
		currentScope = newScope;

		visit(ctx.statement(0));

		currentScope = save;

		table.pr();
		if (table.getTop2() == 1) {
			f = true;
		}
		table.removeMap2();
		table.removeMap();

		table.newMap();
		table.newMap2();

		save = currentScope;
		newScope = new Scope(currentScope);
		currentScope.addChildScope(newScope);
		currentScope = newScope;

		visit(ctx.statement(1));

		currentScope = save;

		table.pr();
		if (table.getTop2() == 1) {
			s = true;
		}
		table.removeMap2();
		if (s && f) {
			System.out.println("true!!!");
			table.markReturn();
		}
		table.removeMap();

		return null;
	}

	@Override
	public Type visitBaseType(@NotNull BasicParser.BaseTypeContext ctx) {

		String str = ctx.getText();
		if (str.equals("char")) {
			return new CharType();
		} else if (str.equals("int")) {
			return new IntType();
		} else if (str.equals("string")) {
			return new StringType();
		} else if (str.equals("bool")) {
			return new BoolType();
		} else {

			return null;
		}
	}

	@Override
	public Type visitBasetype(@NotNull BasicParser.BasetypeContext ctx) {

		return visit(ctx.baseType());
	}

	@Override
	public Type visitEqu(@NotNull BasicParser.EquContext ctx) {
		return null;
	}

	@Override
	public Type visitRead(@NotNull BasicParser.ReadContext ctx) {
		System.out.println("visit read");
		Type t = visit(ctx.assignlhs());
		System.out.println("type: " + t);
		if (!(t instanceof IntType) && !(t instanceof CharType)) {
			System.out.println("can only read int or char type variable");
			exitWithError();
		}
		readType.add(t);
		return t;
	}

	@Override
	public Type visitMinusexpre(@NotNull BasicParser.MinusexpreContext ctx) {
		Type type = visit(ctx.expression());
		if (!(type instanceof IntType)) {
			System.out.println("Type mismatch in ("
					+ ctx.expression().getText() + "). Expected: Int, Actual: "
					+ type);
			// System.out.println("visit minus express: expression " +
			// ctx.expression().getText() + " is not type Int");
			exitWithError();
		}
		return new IntType();
	}

	@Override
	public Type visitMinusjustlit(@NotNull BasicParser.MinusjustlitContext ctx) {

		return new IntType();
	}

	@Override
	public Type visitLess(@NotNull BasicParser.LessContext ctx) {

		return null;
	}

	@Override
	public Type visitSnd(@NotNull BasicParser.SndContext ctx) {

		Type type = visit(ctx.expression());
		if (!(type instanceof PairType)) {
			System.out.println("Type mismatch in ("
					+ ctx.expression().getText() + "). Expected: Int, Actual: "
					+ type);
			// System.out.println("Applying 'snd' to (" + ctx.expression() +
			// ") Expected Type: PairType; Actual: " + type);
			exitWithError();
			return null;
		}
		return ((PairType) type).elemtype2;
	}

	@Override
	public Type visitReturn(@NotNull BasicParser.ReturnContext ctx) {
		if (currentFunction == null) {
			System.out.println("Trying to return in main function");
			exitWithError();
		} else if (!currentFunction.returntype.equals(visit(ctx.expression()))) {
			System.out
					.println("Return type of function doesn't match with type of expression. Expected: "
							+ visit(ctx.expression())
							+ ", Actual: "
							+ currentFunction.returntype.toString());
			exitWithError();
		}
		table.markReturn();
		return null;
	}

	@Override
	public Type visitMul(@NotNull BasicParser.MulContext ctx) {

		return null;
	}

	@Override
	public Type visitPrint(@NotNull BasicParser.PrintContext ctx) {
		BasicParser.ExpressionContext exp = ctx.expression();
		Type t = visit(exp);
		printType.add(t);
		return t;
	}

	@Override
	public Type visitWhiledo(@NotNull BasicParser.WhiledoContext ctx) {

		BasicParser.ExpressionContext exp = ctx.expression();
		Type exprType = visit(exp);

		BasicParser.StatementContext statement = ctx.statement();
		Type statementType = visit(statement);

		if (exprType == null || !(exprType instanceof BoolType)) {
			System.out.println("Type of expression (" + exp.getText()
					+ ") is not declared");
			exitWithError();
			return null;
		} else if (!(exprType instanceof BoolType)) {
			System.out.println("Type mismatch in (" + exp.getText()
					+ "). Expected: Int, Actual: " + exprType);
			// System.out.println("Expression (" + exp.getText() +
			// ") Expected: BoolType, Actual: " + exprType);
			exitWithError();
		}
		return statementType;
	}

	@Override
	public Type visitSemicolon(@NotNull BasicParser.SemicolonContext ctx) {
		System.out.println("visit semi");
		visit(ctx.statement(0));
		Type t = visit(ctx.statement(1));
		return t;
	}

	@Override
	public Type visitAssignRhsArrayLiteral(
			@NotNull BasicParser.AssignRhsArrayLiteralContext ctx) {
		Type t = visit(ctx.arrayLiteral());
		System.out.println("array length: " + ((ArrayType) t).getLength());
		return t;
	}

	@Override
	public Type visitAssignRhsCall(@NotNull BasicParser.AssignRhsCallContext ctx) {

		String ident = ctx.IDENT().getText();

		if (table.containsName(ident)) {
			System.out.println(ident + " is a variable not function");
			exitWithError();
			return null;
		} else if (!functable.contains(ident)) {
			System.out.println("No function called: " + ident);
			exitWithError();
			return null;
		} else {
			Function<Type> f = currentFunction;
			currentFunction = functable.lookupCurrLevelOnly(ident);
			Type returntype = functable
					.lookupCurrLevelAndEnclosingLevels(ident).getReturnType();
			List<Type> paraList = functable.lookupCurrLevelOnly(ident).paras;
			BasicParser.ArgumentListContext argumentlist = ctx.argumentList();
			if (argumentlist != null) {
				visit(argumentlist);
			}
			currentFunction = f;
			return returntype;
		}
	}

	@Override
	public Type visitArgumentList(@NotNull BasicParser.ArgumentListContext ctx) {

		List<Type> paraList = currentFunction.paras;
		List<BasicParser.ExpressionContext> argus = ctx.expression();
		if (paraList.size() != argus.size()) {
			System.out
					.println("Number of parameters is not equal to the number of arguments");
			exitWithError();
		} else {
			int index = 0;
			for (Type para : paraList) {
				// if
				// (!para.equals(table.lookupCurrLevelOnly(argus.get(index).getText())))
				// {
				if (!para.equals(visit(argus.get(index)))) {
					System.out
							.println("Function parameter type mismatch. Expected: "
									+ para.toString()
									+ ", Actual: "
									+ visit(argus.get(index)));
					// System.out.println("Function parameter type mismatch: " +
					// para.toString() + " with " +
					// table.lookupCurrLevelOnly(argus.get(index).getText()));
					exitWithError();
					break;
				}
				index++;
			}
		}
		return null;
	}

	@Override
	public Type visitAssignrhsexpression(
			@NotNull BasicParser.AssignrhsexpressionContext ctx) {
		System.out.println("VISIT assign rhs express");
		return visit(ctx.expression());
	}

	@Override
	public Type visitAssignRhsNewPair(
			@NotNull BasicParser.AssignRhsNewPairContext ctx) {

		return new PairType(visit(ctx.expression(0)), visit(ctx.expression(1)));
	}

	@Override
	public Type visitAssignRhsPairElem(
			@NotNull BasicParser.AssignRhsPairElemContext ctx) {
		return visit(ctx.pairelement());
	}

	public void exitWithSyntacError() {
		System.out.println("#syntax_error#");
		System.exit(100);
	}

	public void exitWithError() {
		System.out.println("#semantic_error#");
		System.exit(200);
	}

}