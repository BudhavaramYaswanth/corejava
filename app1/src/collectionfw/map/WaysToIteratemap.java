package collectionfw.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIteratemap {
	
	public static void main(String[] args) {
		Map <Integer,String> map=new HashMap<> ();
			
			map.put(1, "abc");
			map.put(2, "aaa");
			map.put(3, "bbb");
			map.put(4, "ccc");
			map.put(5, "xyz");
			map.put(5, "ddd");
			map.put(6, "abc");
			
			System.out.println(map);
			
			System.out.println("using entryset with enhanced for loop....");
			Set<Entry<Integer,String>>entries=map.entrySet();
			
			for(Entry<Integer,String>entry:entries) {
			System.out.println(entry.getKey()+"="+entry.getValue());	
			}
			
			System.out.println("using entryset with iterator....");
			@SuppressWarnings("rawtypes")
			Iterator it1 =entries.iterator();
			
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
			System.out.println("using keyset with enhanced for loop");
			
			Set<Integer>Keys =map.keySet();
			for(Object Key:Keys) {
				System.out.println(Key+"="+map.get(Key));
			}
			
			System.out.println("using keyset with iterator.....");
			
			@SuppressWarnings("rawtypes")
			Iterator it2=Keys.iterator();
			while(it2.hasNext()) {
				Object Key=it2.next();
				System.out.println(Key+"="+map.get(Key));
			}
			
	}

}
