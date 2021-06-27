import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(123, "Ramlal");
		map.put(789, "Shamlal");
		map.put(954, "Amit");
		map.put(456, "Amit");
		map.put(345, "Sneh");
		
		System.out.println(map);
		System.out.println("------------------------------");
//		map = new TreeMap<>();
//		map.put(123, "Ramlal");
//		map.put(789, "Shamlal");
//		map.put(954, "Amit");
//		map.put(456, "Amit");
//		map.put(345, "Sneh");
//		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String val = map.get(key);
			System.out.println(key + " : " + val);
		}
		System.out.println("------------------------------");
		
		Collection<String> vals = map.values();
		for (String value : vals) {
			System.out.println(value);
		}
		
		// containsKey
		// containsValue
		// putIfAbsent
		// remove
		// replace
		System.out.println("------------------------------");
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		for (Entry<Integer, String> entry2 : entry) {
			Integer key = entry2.getKey();
			String value = entry2.getValue();
			System.out.println(key + " : " + value);
		}
		
		
	}
}






