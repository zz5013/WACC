

public class PairType implements Type {

	Type elemtype1;
	Type elemtype2;

	public PairType() {
		elemtype1 = null;
		elemtype2 = null;
	}

	public PairType(Type type, Type type2) {
		elemtype1 = type;
		elemtype2 = type2;
	}
	
	public Type getFirstType() {
		return elemtype1;
	}
	
	public Type getSecondType() {
		return elemtype2;
	}
	
	public int getFirstTypeSpace() {
		return getTypeSpace(elemtype1);
	}
	
	public int getSecondTypeSpace() {
		return getTypeSpace(elemtype2);
	}

	@Override
	public boolean equals(Type othertype) {
		if (othertype == null) {
			return true;
		}
        if(this.elemtype1 == null && this.elemtype2 == null) return true;
		if (othertype instanceof PairType) {
			if (((PairType) othertype).elemtype1 == null
					&& ((PairType) othertype).elemtype2 == null) {
                return true;
            }
			return (this.elemtype1 == null ? ((PairType) othertype).elemtype1 == null
					: this.elemtype1.equals(((PairType) othertype).elemtype1))
					&& (this.elemtype2 == null ? ((PairType) othertype).elemtype2 == null
							: this.elemtype2
									.equals(((PairType) othertype).elemtype2));
		}
		return false;
	}

	@Override
	public String toString() {
		if (elemtype1 == null && elemtype2 == null) {
			return "Pair of : (null) and (null)";
		} else if (elemtype1 == null) {
			return "Pair of : (null) and (" + elemtype2.toString() + ")";
		} else if (elemtype2 == null) {
			return "Pair of : (" + elemtype1.toString() + ") and (null)";
		} else {
			return "Pair of : (" + elemtype1.toString() + ") and (" + elemtype2.toString() + ")";
		}
	}

	@Override
	public int getSpace() {
		return 4;
	}
	
	public int getTypeSpace(Type type) {
		if (type == null) {
			return 0;
		}
		if (type instanceof IntType || type instanceof StringType
				|| type instanceof ArrayType || type instanceof PairType) {
			return 4;
		} else {
			return 1;
		}
	}


}

