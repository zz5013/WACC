public class Instruction {

	private String instruction;

	public Instruction() {

	}

	public Instruction(String s) {
		instruction = "\n" + s;
	}

	public Instruction(String s1, String s2) {
		instruction = "\n" + s1 + " " + s2;
	}

	public Instruction(String s1, String s2, String s3) {
		instruction = "\n" + s1 + " " + s2 + ", " + s3;
	}

	public Instruction(String s1, String s2, String s3, String s4, String s5) {
		instruction = "\n" + s1 + " " + s2 + ", " + s3 + ", " + s4 + ", " + s5
				+ "\n";
	}

	public Instruction(String s1, String s2, String s3, String s4) {
		instruction = "\n" + s1 + " " + s2 + ", " + s3 + ", " + s4;
	}

	public void setInstruction(String s) {
		instruction = "\n" + s;
	}

	public String getInstruction() {
		return instruction;
	}

}
