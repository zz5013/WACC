
public class IntType implements BaseType {

	public IntType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Type othertype) {
		return othertype instanceof IntType;
	}
	
	@Override
	public String toString() {
		return "Int";
	}

	@Override
	public int getSpace() {
		return 4;
	}

}
