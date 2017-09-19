public class VariableData {

	private String name;
	private int position;
	private Type type;
	private int scopeGroup;

	public VariableData(String name, int position, Type type, int scopeGroup) {
		this.name = name;
		this.position = position;
		this.type = type;
		this.scopeGroup = scopeGroup;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public Type getType() {
		return type;
	}

	public int getScopeGroup() {
		return scopeGroup;
	}

}
