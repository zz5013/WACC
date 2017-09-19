import java.util.HashMap;
import java.util.Map;

public class FunctionTable<T> {

	Map<String, Function<T>> dict; // Maps names to objects

	public FunctionTable() { // creates symbol table & link
		dict = new HashMap<String, Function<T>>(); // to enclosing table
	}

	public void add(String name, Function<T> func) {
		dict.put(name, func); // add name, func to dictionary
	}

	public Function<T> lookupCurrLevelOnly(String name) { // return obj else
															// None if name not
		return dict.get(name); // in dict
	}

	public boolean contains(String funcName) {
		return dict.containsKey(funcName);
	}

	public Function<T> lookupCurrLevelAndEnclosingLevels(String funcName) {
		return dict.get(funcName);
	}

}
