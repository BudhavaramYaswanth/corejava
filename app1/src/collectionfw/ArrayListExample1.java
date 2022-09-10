package collectionfw;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String[] args) {
		
	//	ArrayList list =new ArrayList ();
		
		List list =new ArrayList ();
		
		list.add("abc");
		list.add("xyz");
		list.add("aaa");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		
		System.out.println(list);
		
	// System.out.println(list.get(0));
	// System.out.println(list.get(1));
	// System.out.println(list.get(2));
	// System.out.println(list.get(3));
		
		System.out.println(list.size());
		
		for(int i=0 ;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove("aaa");
		System.out.println(list);
		
		list.add(0,"YASH");
		System.out.println(list);
		
		System.out.println(list.contains("aaa"));
		
	//   list.clear();
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		
	}

}
