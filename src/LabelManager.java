
public class LabelManager {
	
	int labelCount;
	
	public LabelManager() {
		labelCount = 0;
	}
	
	public String nextLabel() {
		return "L" + (labelCount++);
	}
	
	public String newFuncLabel(String s) {
		return "\nf_" + s + ":\n";
	}
	
	public int getLabelCount() {
		return labelCount;
	}

}
