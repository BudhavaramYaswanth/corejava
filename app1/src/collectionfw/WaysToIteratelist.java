package collectionfw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysToIteratelist {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("abc");
		list.add("xyz");
		list.add("aaa");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		
	//using normal for loop
		System.out.println("using normal for loop----------");
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("using Enhanced for loop-------------");
		for(Object s:list) {
			System.out.println(s);
		}
		
		System.out.println("using Iterator--------");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("using list iterator-----");
		ListIterator lit =list.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
	}
}
