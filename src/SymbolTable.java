import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable<T> {

	SymbolTable<T> encSymTable; // Link to enclosing symbol table
	List<Map<String, T>> dict; // Maps names to Types
	List<Integer> re;

	public SymbolTable() {
		dict = new ArrayList<>();
		re = new ArrayList<>();
		encSymTable = null;
	}

	public SymbolTable(SymbolTable<T> st) {
		dict = new ArrayList<>();
		re = new ArrayList<>();
		encSymTable = st;
	}

	public void add(String name, T obj) {
		if (dict.isEmpty()) {
			dict.add(new LinkedHashMap<String, T>());
		}
		dict.get(getSize() - 1).put(name, obj); // add name, obj to dictionary
	}

	public void addTable(SymbolTable<T> st) {
		encSymTable = st;
	}

	public void addToEnc(String s, T t) {
		if (encSymTable == null) {
			encSymTable = new SymbolTable<T>(null);
		}
		encSymTable.add(s, t);
	}

	public boolean c(String name) {
		return dict.get(dict.size() - 1).containsKey(name);
	}

	public boolean containsName(String name) {
		if (!dict.isEmpty()) {
			if (dict.get(dict.size() - 1).containsKey(name)) {
				return true;
			}
		}
		if (encSymTable != null && encSymTable.containsName(name)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean containsNameAll(String name) {
		if (encSymTable != null && encSymTable.containsName(name)) {
			return true;
		}
		if (dict.isEmpty()) {
			return false;
		}
		int x = getSize() - 1;
		while (x >= 0) {
			if (dict.get(x).containsKey(name)) {
				return true;
			}
			x--;
		}
		return false;
	}

	public void deleteEnc() {
		if (encSymTable != null) {
			encSymTable.makeEmpty();
		}
	}

	public boolean EncContain(String name) {
		if (encSymTable == null) {
			return false;
		} else {
			return encSymTable.c(name);
		}
	}

	public SymbolTable<T> getEnc() {
		return encSymTable;
	}

	public int getSize() {
		return dict.size();
	}

	private int getSize2() {
		return re.size();
	}

	public Map<String, T> getTop() {
		return dict.get(getSize() - 1);
	}

	public Integer getTop2() {
		return re.get(getSize2() - 1);
	}

	public T lookupCurrLevelAndEnclosingLevels(String name) {
		if (encSymTable != null && encSymTable.containsName(name)) {
			return encSymTable.lookupCurrLevelOnly(name);
		} else {
			if (dict.isEmpty()) {
				return null;
			}
			for (int i = dict.size() - 1; i >= 0; i--) {
				if (dict.get(i).containsKey(name)) {
					return dict.get(i).get(name); // in dict
				}
			}
			System.out.println("return null");
			return null;
		}
	}

	public T lookupCurrLevelOnly(String name) { // return obj else None if
													// name not
		if (encSymTable != null && encSymTable.containsName(name)) {
			return encSymTable.lookupCurrLevelOnly(name);
		} else {
			if (containsName(name)) {
				return dict.get(getSize() - 1).get(name); // in dict
			} else {
				return null;
			}
		}
	}

	public void makeEmpty() {
		dict.clear();
		re.clear();
	}

	public void markReturn() {
		if (getTop2() == 0) {
			re.remove(getSize2() - 1);
			re.add(1);
		}
		System.out.println("mark");
	}

	public void newMap() {
		dict.add(new LinkedHashMap<String, T>());
	}

	public void newMap2() {
		re.add(0);
		System.out.println("new");
	}

	public void pr() {
		System.out.println("start");
		if (encSymTable != null) {
			encSymTable.pr2();
		}
		if (dict.isEmpty()) {
			System.out.println("ori dict empty");
		} else {
			System.out.println("ori size: " + dict.size());
		}
		System.out.println("xxx");
		for (int i = dict.size() - 1; i >= 0; i--) {
			for (String name : dict.get(i).keySet()) {
				String key = name.toString();
				String value = dict.get(i).get(name).toString();
				System.out.println(key + " -> " + value);
			}
		}
	}

	public void pr2() {
		if (dict.isEmpty()) {
			System.out.println("enc dict empty");
		} else {
			System.out.println("enc size: " + dict.size());
		}
		for (int i = dict.size() - 1; i >= 0; i--) {
			for (String name : dict.get(i).keySet()) {
				String key = name.toString();
				String value = dict.get(i).get(name).toString();
				System.out.println(key + " -> " + value);
			}
		}
	}

	public void removeMap() {
		dict.remove(getSize() - 1);
	}

	public void removeMap2() {
		re.remove(getSize2() - 1);
		System.out.println("remove");
	}

}
