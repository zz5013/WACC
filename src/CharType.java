
public class CharType implements BaseType {

	public CharType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Type othertype) {
		return othertype instanceof CharType;
	}
	
	@Override
	public String toString() {
		return "Char";
	}

	@Override
	public int getSpace() {
		return 1;
	}

}
