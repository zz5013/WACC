import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Scope {

	private Map<String, Type> table;
	private Scope parentScope;
	private List<Scope> childScopes;
	private int i;

	public Scope() {
		table = new IndexedLinkedHashMap<String, Type>();
		childScopes = new LinkedList<>();
		i = 0;
	}

	public Scope(Scope parent) {
		table = new IndexedLinkedHashMap<String, Type>();
		parentScope = parent;
		childScopes = new LinkedList<>();
		i = 0;
	}
	
	public Scope getParent() {
		return parentScope;
	}
	
	public Scope nextChild() {
		if (i<childScopes.size()-1) {
			return childScopes.get(i++);
		} else {
			return childScopes.get(childScopes.size()-1);
		}
	}

	public boolean noParent() {
		return (parentScope == null);
	}

	public void add(String name, Type type) {
		if (table == null) {
			table = new LinkedHashMap<>();
		}
		((IndexedLinkedHashMap<String, Type>) table).add(name, type);
	}

	public void setParentScope(Scope parent) {
		parentScope = parent;
	}

	public void addChildScope(Scope childscope) {
		childScopes.add(childscope);
	}

	public int getChildScopeSize() {
		return childScopes.size();
	}

	public List<Scope> getChildScopes() {
		return childScopes;
	}
	
	public boolean contains(String name) {
		return table.containsKey(name);
	}

	public boolean containsAll(String name) {
		if (contains(name)) {
			return true;
		} else {
			if (noParent()) {
				return false;
			} else {
				return getParent().containsAll(name);
			}
		}
	}
	public Type get(String name) {
		return table.get(name);
	}

	public Type getAll(String name) {
		if (contains(name)) {
			return get(name);
		} else {
			if (noParent()) {
				return null;
			} else {
				return getParent().getAll(name);
			}
		}
	}

	public int getSpace() {
		int sum = 0;
		for (String name : table.keySet()) {
			sum += get(name).getSpace();
		}
		return sum;
	}

	public void printTable() {
		for (String key : table.keySet()) {
			System.out.println(key + " " + table.get(key));
		}
	}
	
	public void printAllTable() {
		System.out.println("================================ Printing scope =========================== ");
		for (String key : table.keySet()) {
			System.out.println("============ Var:: " + key + "   :::::::: with type: " + table.get(key) + " ==========");
		}
		for (Scope s : childScopes) {
			s.printAllTable();
		}
		System.out.println("================================ Printing Ends =========================== ");
	}

}
