
public class BlockManager {
	

	public String arrayOutOfBoundsMsg(){
        //String error = "Array Out Of Bounds";
		String error = "Array Out Of Bounds\\" + "n\\" + "0";
		return "arrout_msg:\n" +
				".word " + (error.length() - 2) + "\n" +
				".ascii" + "\"" + error + "\"\n";
	}


	public String nullReferenceMsg(){
        //String error = "Null Reference Error";
		String error = "Null Reference Error\\" + "n\\" + "0";
		return "null_ref:\n" +
				".word " + (error.length() - 2) + "\n" +
				".ascii\"" +error + "\"\n";
	}

	public String overflowMsgBlock(){
        //String string = "Overflow Error";
		String string = "Overflow Error\\" + "n\\" + "0";
        return "overflow:\n" +
                ".word " + (string.length() - 2) + "\n" +
                ".ascii" + "\"" + string + "\"\n";
	}

	public String divisionByZeroMsgBlock(){
		String string = "Division By Zero\\" + "n\\" + "0";
        //String string = "Division By Zero";
        return "zerodiv:\n" +
                ".word " + (string.length() - 2) + "\n" +
                ".ascii" + "\"" + string + "\"\n";
	}

	public String checkDivisionByZero() {
		return "p_check_divide_by_zero:\n"
                + "PUSH {lr}\n"
				+ "CMP r1, #0\n"
                + "LDREQ r0, =zerodiv\n"
				+ "BLEQ p_throw_runtime_error\n"
                + "POP {pc}\n";
	}

    public String pairCheckNullPointerStatement(){
        return "p_check_null_pointer:\n" +
                "PUSH {lr}\n" +
                "CMP r0, #0\n" +
                "LDREQ r0, =null_ref\n" +
                "BLEQ p_throw_runtime_error\n" +
                "POP {pc}\n";
    }

	public String freePairStatement(){
		return "p_free_pair:\n" +
				"PUSH {lr}\n" +
				"CMP r0, #0\n" +
				"LDREQ r0, =null_ref\n" +
				"BEQ p_throw_runtime_error\n" +
				"PUSH {r0}\n" +
				"LDR r0, [r0]\n" +
				"BL free\n" +
				"LDR r0, [sp]\n" +
				"LDR r0, [r0, #4]\n" +
				"BL free\n" +
				"POP {r0}\n" +
				"BL free\n" +
				"POP {pc}\n";
	}

	public String arrayOutOfBoundsPOST() {
		return "p_check_array_bounds:\n" +
				"PUSH {lr}\n" +
				"CMP r0, #0\n" +
				"LDRLT r0, =arrout_msg\n" +
				"BLLT p_throw_runtime_error\n" +
				"LDR r1, [r1]\n" +
				"CMP r0, r1\n" +
				"LDRCS r0, =arrout_msg\n" +
				"BLCS p_throw_runtime_error\n" +
				"POP {pc}\n";

	}

	public String throwRuntimeError() {
		return "p_throw_runtime_error:\n" + "BL p_print_string\n"
				+ "MOV r0, #-1\n" + "BL exit\n";
	}


	public String printString() {
		return "p_print_string:\n" + "PUSH {lr}\n" + "LDR r1, [r0]\n"
				+ "ADD r2, r0, #4\n" + "LDR r0, =msg_1\n"
				+ "ADD r0, r0, #4\n" + "BL printf\n"
				+ "MOV r0, #0\n" + "BL fflush\n" + "POP {pc}\n";
	}

	public String throwOwerflowError() {
		return "p_throw_overflow_error:\n"
	            + "LDR r0, =overflow\n"
				+ "BL p_throw_runtime_error\n";
	           
	}
	

}
