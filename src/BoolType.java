
public class BoolType implements BaseType {

	public BoolType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Type othertype) {
		return othertype instanceof BoolType;
	}
	
	@Override
	public String toString() {
		return "Bool";
	}

	@Override
	public int getSpace() {
		return 1;
	}

}
