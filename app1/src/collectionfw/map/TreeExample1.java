package collectionfw.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class TreeExample1 {
	
	public static void main(String[] args) {
		Map <Integer,String> map=new TreeMap <> ();
		
		map.put(8, "ooo");
		map.put(1, "abc");
		map.put(2, "aaa");
		map.put(3, "bbb");
		map.put(4, "ccc");
		map.put(7, "uuu");
		map.put(5, "xyz");
		map.put(5, "ddd");
		map.put(6, "abc");
		
		System.out.println(map);
	}
}
