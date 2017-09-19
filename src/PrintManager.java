import java.util.List;

/*
 created by Artem
 */
public class PrintManager {
    //hi this is comment
    private List<Type> print;
    private List<Type> println;
    private int totalStrings, totalInts, totalBools, totalChars;
    private int visitedStings;

    public PrintManager(List<Type> print, List<Type> println) {
        this.print = print;
        this.println = println;
        countStatements();
        visitedStings = 0;
    }


    public String getRefMsgBlock(){
        return "ref_msg:\n" +
                ".word 3\n" +
                ".ascii\"%p\\" + "0\"\n";
    }

    public String getIntMsgBlock(){
        return "int_msg:\n" +
                ".word 3\n" +
                ".ascii\"%d\\" + "0\"\n";
    }

    public String getBoolMsgBlock(){
        String t = "true", f = "false";
        return  "bool_msg_true:\n" +
                ".word 5\n" +
                ".ascii\"true\\" + "0\"\n" +
                "bool_msg_false:\n" +
                ".word 6\n" +
                ".ascii\"false\\" + "0\"\n";
        /*return  "bool_msg_true:\n" +
                ".word " + t.length() + "\n" +
                ".ascii\"" + t + "\"\n" +
                "bool_msg_false:\n" +
                ".word " + f.length() + "\n" +
                ".ascii\"" + f + "\"\n";*/
    }

    public String getPrintlnMsgBlock(){
        return "println_msg:\n" +
                ".word 1\n" +
                ".ascii\"\\" + "0\"\n";
    }

    public String getStringMsgGeneral(){
        return "string_msg:\n" +
                ".word 5\n" +
                ".ascii\"%.*s\\" + "0\"\n";
    }

    public String getStringMsgBlock(String string, int i){
        string = string.substring(1, string.length() - 1);
/*
        return "msg_" + i + ":\n" +
               ".word " + (string.length()) + "\n" +
               ".ascii\"" + string +"\\" + "0" +  "\"\n";
*/
        return "msg_" + i + ":\n" +
                ".word " + (string.length() + 1) + "\n" +
                ".asciz \"" + string + "\"\n";
    }

    private void countStatements(){
        for(Type t : print){
            if(t.toString().equals("String")) totalStrings++;
            else if(t.toString().equals("Bool")) totalBools++;
            else if(t.toString().equals("Int")) totalInts++;
            else if(t.toString().equals("Char")) totalChars++;
        }
        for(Type t : println){
            if(t.toString().equals("String")) totalStrings++;
            else if(t.toString().equals("Bool")) totalBools++;
            else if(t.toString().equals("Int")) totalInts++;
            else if(t.toString().equals("Char")) totalChars++;
        }
    }

    public String getAllPrintStatements(){
        String res = new String();
        int ind = 0;
        if(totalStrings != 0){
            res += getPrintStatement(new StringType(), ind++);
        }
        if(totalInts != 0) res += getPrintStatement(new IntType(), ind++);
        if(totalBools != 0) res += getPrintStatement(new BoolType(), ind++);
        if(totalChars != 0) res += getPrintStatement(new CharType(), ind++);
        if(println.size() != 0) res += getPrintLnStatement();
        return res;
    }

    public String getPrintStatement(Type t, int index){
        String type = t.toString();
        String s = t.toString();
        int n = totalStrings + index + ((totalBools != 0) ? 2 : 0);
        return null;

    }

    public String getReferencePrintStatement(){
        return "p_print_ref:\n" +
                "PUSH {lr}\n" +
                "MOV r1, r0\n" +
                "LDR r0, =ref_msg\n" +
                "ADD r0, r0, #4\n" +
                "BL printf\n" +
                "MOV r0, #0\n" +
                "BL fflush\n" +
                "POP {pc}\n";
    }

    public String getStringPrintStatement(){
        return "p_print_string:\n" +
                "PUSH {lr}\n" +
                "LDR r1, [r0]\n" +
                "ADD r2, r0, #4\n" +
                "LDR r0, =string_msg\n" +
                "ADD r0, r0, #4\n" +
                "BL printf\n" +
                "MOV r0, #0\n" +
                "BL fflush\n" +
                "POP {pc}\n";
    }

    public String getIntPrintStatement(){
	//test
        return "p_print_int:\n" +
                "PUSH {lr}\n" +
                "MOV r1, r0\n" +
                "LDR r0, =int_msg\n" +
                "ADD r0, r0, #4\n" +
                "BL printf\n" +
                "MOV r0, #0\n" +
                "BL fflush\n" +
                "POP {pc}\n";
    }

    public String getBoolPrintStatement(){
        return "p_print_bool:\n" +
                "PUSH {lr}\n" +
                "CMP r0, #0\n" +
                "LDRNE r0, =bool_msg_true\n" +
                "LDREQ r0, =bool_msg_false\n" +
                "ADD r0, r0, #4\n" +
                "BL printf\n" +
                "MOV r0, #0\n" +
                "BL fflush\n" +
                "POP {pc}\n";
    }

    public String getPrintLnStatement(){
        int n = print.size() + println.size() - totalStrings + ( (totalStrings == 0) ? 0 : 1 );
        return  "p_print_ln:\n" +
                "PUSH {lr}\n" +
                "LDR r0, =println_msg\n" +
                "ADD r0, r0, #4\n" +
                "BL puts\n" +
                "MOV r0, #0\n" +
                "BL fflush\n" +
                "POP {pc}\n";
    }




}
