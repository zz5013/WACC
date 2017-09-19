
public class ArrayData {

	private String name;
	private String position;
	private int index;
	private int unitSpace;
	
	public ArrayData() {
		name = "";
		position = "";
		index = 0;
		unitSpace = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getIndex() {
		int re =  index+4;
		incrementIndex();
		return re;
	}
	
	public int JustgetIndex() {
		return index;
	}
	
	public void incrementIndex() {
		index+=unitSpace;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getUnitSpace() {
		return unitSpace;
	}

	public void setUnitSpace(int unitSpace) {
		this.unitSpace = unitSpace;
	}



}
