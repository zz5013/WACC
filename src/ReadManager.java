import java.util.List;

public class ReadManager {
    private List<Type> read;
    private int totalStrings, totalInts, totalBools, totalChars;

    public ReadManager(List<Type> read){
        this.read = read;
    }

    public String getReadIntMsgBlock(){
        return "read_int:\n" +
                ".word 3\n" +
                ".ascii\" %d\\" + "0\"\n";
    }

    public String getReadCharMsgBlock(){
        return "read_ch:\n" +
                ".word 4\n" +
                ".ascii\" %c\\" + "0\"\n";
    }


    public String getReadIntStatement(){
        return "p_read_int:\n" +
                "PUSH {lr}\n" +
                "MOV r1, r0\n" +
                "LDR r0, =read_int\n" +
                "ADD r0, r0, #4\n" +
                "BL scanf\n" +
                "POP {pc}\n";
    }

    public String getReadCharStatement(){
        return "p_read_char:\n" +
                "PUSH {lr}\n" +
                "MOV r1, r0\n" +
                "LDR r0, =read_ch\n" +
                "ADD r0, r0, #4\n" +
                "BL scanf\n" +
                "POP {pc}\n";
    }


    private void countStatements(){
        for(Type t : read){
            if(t.toString().equals("String")) totalStrings++;
            else if(t.toString().equals("Bool")) totalBools++;
            else if(t.toString().equals("Int")) totalInts++;
            else if(t.toString().equals("Char")) totalChars++;
        }
    }
}
