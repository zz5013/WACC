import java.util.LinkedHashMap;

public class IndexedLinkedHashMap<K,V> extends LinkedHashMap{

LinkedHashMap<Integer,K> index;
int curr = 0;

    public void add(K key,V val){
    	if (index == null) {
    		index = new LinkedHashMap<Integer, K>();
    	}
        super.put(key,val);
        index.put(curr++, key);
    }

    public V getindexed(int i){
        return (V) super.get(index.get(i));
    }

}