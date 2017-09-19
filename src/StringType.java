
public class StringType implements BaseType {

	public StringType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Type othertype) {
		return othertype instanceof StringType;
	}
	
	@Override
	public String toString() {
		return "String";
	}

	@Override
	public int getSpace() {
		return 4;
	}

}
