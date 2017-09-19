import java.util.ArrayList;
import java.util.List;

public class Function<T> {

	T returntype;
	List<T> paras;
	SymbolTable<T> encSymTable; // Link to enclosing symbol table
	String name;

	public Function(String name, T ret, List<T> plist) {

		this.name = name;
		encSymTable = new SymbolTable<T>();
		returntype = ret;
		if (plist == null) {
			paras = new ArrayList<>();
		} else {
			paras = plist;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public T getReturnType() {
		return returntype;
	}

	public List<T> getParaList() {
		return paras;
	}

	public SymbolTable<T> getST() {
		return encSymTable;
	}

	public void addParam(T t, String name) {
		encSymTable.add(name, t);
	}

	public T getParam(String name) {
		return encSymTable.lookupCurrLevelOnly(name);

	}

	public void addparas(List<T> list) {
		paras = list;
	}

	public void addReturnType(T rt) {
		returntype = rt;
	}

	public void addST(SymbolTable<T> st) {
		if (st == null) {
			encSymTable = new SymbolTable<T>(null);
		} else {
			encSymTable = st;
		}
	}

	public boolean equals(Function<T> fun) {
		if (!returntype.equals(fun.getReturnType())) {
			return false;
		} else {
			int i = 0;
			for (T T : paras) {
				if (!T.equals(fun.getParaList().get(i))) {
					return false;
				} else {
					i++;
				}
			}
			return true;
		}
	}

	@Override
	public String toString() {
		return "X";
	}

}
