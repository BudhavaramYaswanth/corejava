package collectionfw.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionExample1 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("ATP");
		list.add("Vizag");
		list.add("Blr");
		list.add("Bellary");
		list.add("Chittoor");
		
		System.out.println(list);
		
	//	Convert from List to TreeSet
	//	Set<String>set=new TreeSet<String>(list);
	//	System.out.println(set);
		
	//	collections.Sort
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.unmodifiableList(list);
		
		Collections.synchronizedList(list);
		
	}
}
