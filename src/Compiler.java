import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {

	public static void main(String[] args) throws Exception {

		String inputFile = null;
		String filename = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream in = System.in;
		if (inputFile != null)
			in = new FileInputStream(inputFile);

		System.out.println("inputfile: " + inputFile);
		String fn = Paths.get(inputFile).getFileName().toString().split("\\.")[0];
		System.out
				.println("filename: "
						+ Paths.get(inputFile).getFileName().toString()
								.split("\\.")[0]);

		/*
		 * String everything = ""; BufferedReader br = new BufferedReader(new
		 * FileReader(args[0])); try { StringBuilder sb = new StringBuilder();
		 * String line = br.readLine(); while (line != null) { sb.append(line);
		 * sb.append(System.lineSeparator()); line = br.readLine(); } everything
		 * = sb.toString(); } finally { br.close(); }
		 */

		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(in);
		// ANTLRInputStream input = new ANTLRInputStream(everything);

		// create a lexer that feeds off of input CharStream
		BasicLexer lexer = new BasicLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		BasicParser parser = new BasicParser(tokens); // Parser has a method for
														// each rule
		// begin parsing at prog rule
		ParseTree tree = parser.prog();

		System.out.println("-------Syntax Checking--------");
		SemanticChecker visitor = new SemanticChecker();
		if (parser.getNumberOfSyntaxErrors() != 0) {
			System.out.println("#syntax_error#");
			System.exit(100);
		}
		System.out.println("-------Semantic Checking--------");
		visitor.visit(tree);
		FunctionTable<Type> functable = visitor.getFuncTable();
		Scope scope = visitor.getMainScope();
		scope.printAllTable();
		List<Type> read = visitor.getRead();
		Map<String, Integer> funcParaSpace = visitor.getFuncParaSpace();
		List<Type> print = visitor.getPrint();
		List<Type> println = visitor.getPrintln();
		System.out.println("-------Code Generating--------");
		CodeVisitor cvisitor = new CodeVisitor(functable, scope, read, print,
				println, funcParaSpace);
		cvisitor.visit(tree);
		printFile(cvisitor.getCode(), fn);

		// print LISP-style parse tree
		// System.out.println(tree.toStringTree(parser));

	}

	public static void printFile(String string, String file) {
		BufferedWriter writer = null;
		try {
			File f = new File("./" + file + ".s");
			writer = new BufferedWriter(new FileWriter(f));
			writer.write(string);
			writer.newLine();
		} catch (Exception e) {

		} finally {
			try {
				writer.close();
			} catch (Exception e) {

			}
		}
	}

	public static void testprint(String filename) {
		BufferedWriter writer = null;
		try {
			// create a temporary file
			File logFile = new File("./" + filename + ".s");
			// This will output the full path where the file will be written
			// to...
			System.out.println(logFile.getCanonicalPath());
			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write(".text");
			writer.newLine();
			writer.newLine();
			writer.newLine();
			writer.write(".global main");
			writer.newLine();
			writer.write("main:");
			writer.newLine();
			writer.write(" PUSH {lr}");
			writer.newLine();
			writer.write("LDR r4, =7");
			writer.newLine();
			writer.write("MOV r0, r4");
			writer.newLine();
			writer.write("BL exit");
			writer.newLine();
			writer.write("BL exit");
			writer.newLine();
			writer.write("LDR r0, =0");
			writer.newLine();
			writer.write("POP {pc}");
			writer.newLine();
			writer.write(".ltorg");
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close the writer regardless of what happens...
				writer.close();
			} catch (Exception e) {
			}
		}
	}

}