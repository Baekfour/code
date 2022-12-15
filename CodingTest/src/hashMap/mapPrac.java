package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		//a.put("key값", value);
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	
	static <T> void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<T, T>> entries = map.entrySet();
		List<Object> list = new ArrayList<>();
		for(Map.Entry<T, T> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			list.add(entry);
		}
		System.out.println(list);
		System.out.println(list.get(0));
		
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
//			System.out.println(entries);
		}
	}
}
