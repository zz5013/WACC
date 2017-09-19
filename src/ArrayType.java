

public class ArrayType implements Type {
	
	Type arrayType;
	private int length;
	
	public ArrayType() {
		arrayType = null;
		length = 0;
	}
	
	public ArrayType(Type type) {
		arrayType = type;
	}
	
	public void incrementLength() {
		length++;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setInnerType(Type t) {
		arrayType = t;
	}
	
	public Type getTypeOfArray() {
		return arrayType;
	}
	
	public void setTypeOfArray(Type t) {
		arrayType = t;
	}
	
	@Override
	public String toString() {
		if (arrayType == null) {
			return "array of null";
		} else {
			return "array of " + arrayType.toString();
		}
	}

	@Override
	public boolean equals(Type othertype) {
		// System.out.println("arrayType: " + arrayType + ", othertype: " +
		// othertype + ", arrayType");
		if(this.arrayType == null){
		    return true;
		}
		if (othertype == null) {
			return false;
		} else if (othertype instanceof ArrayType) {
			if (((ArrayType)othertype).arrayType == null) {
				return true;
			} else {
				return arrayType != null ? this.arrayType.equals(((ArrayType) othertype).arrayType) : false;
			}
		} else {
			return false;
		}

	}

	@Override
	public int getSpace() {
		return 4;
	}
	

}
