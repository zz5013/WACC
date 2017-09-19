import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RegisterManager {

	private Map<String, Type> dict; // Maps names to Types
	private boolean[] regs;
	private InstructionManager insMan;
	private Stack stack;

	public RegisterManager(InstructionManager insMan, Stack stack) {
		dict = new LinkedHashMap<String, Type>();
		regs = new boolean[12];
		regs[0] = regs[1] = regs[2] = true;
		this.insMan = insMan;
		this.stack = stack;
	}

	public void add(String name, Type type) {
		dict.put(name, type);
	}

	public void remove() {
		dict.clear();
	}

	public Type lookUp(String name) {
		return dict.get(name);
	}

	public int getTypeSize(Type type) {
		if (type instanceof IntType || type instanceof StringType) {
			return 4;
		} else if (type instanceof BoolType || type instanceof CharType) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean containsVar(String name) {
		return dict.containsKey(name);
	}

	public int getSize() {
		return dict.size();
	}

	public int getTotalSize() {
		int sum = 0;
		for (String s : dict.keySet()) {
			sum += getTypeSize(dict.get(s));
		}
		return sum;
	}

	public String nextAvailable() {
		for (int i = 4; i < 11; i++) {
			if (!regs[i]) {
				setUsed(i);
				System.out.println("use reg: r" + i);
				return "r" + i;
			}
		}
		insMan.addInstruction("PUSH {r10}");
		stack.push();
        //this.setFree("r10");
		return "r10";
	}

	public void setUsed(int reg) {
		if (reg > 3 && reg < 12) {
			regs[reg] = true;
		}
	}

	public void setFree(int reg) {
		if (reg > 3 && reg < 12) {
			regs[reg] = false;
		}
	}

	public void setFree(String r) {
		if(r == null) return;
		System.out.println("setfree: " + r);
		int reg = Integer.parseInt(r.split("r")[1]);
		if (reg > 3 && reg < 12) {
			regs[reg] = false;
		}
	}

}
