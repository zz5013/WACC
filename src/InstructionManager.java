import java.util.LinkedList;

public class InstructionManager {

	private LinkedList<Instruction> instructions;

	public InstructionManager() {
		instructions = new LinkedList<Instruction>();
	}

	public void addInstruction(Instruction instruction) {
		instructions.add(instruction);
	}

	public void addInstruction(String instruction) {
		instructions.add(new Instruction(instruction));
	}

	public Instruction getInstruction(int i) {
		return instructions.get(i);
	}

	public int getSize() {
		return instructions.size();
	}

	public String getFinalString() {
		String s = "";
		for (Instruction i : instructions) {
			s = s + i.getInstruction();
		}
		return s;
	}

}
