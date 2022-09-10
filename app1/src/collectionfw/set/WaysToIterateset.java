package collectionfw.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WaysToIterateset {
	public static void main(String[] args) {

		Set  set = new HashSet();

		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("bbb");
		set.add("abc");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");

		System.out.println(set);
		System.out.println("using Enhanced For Loop..............");

		for (Object data :set) {
			System.out.println(data);
		}
		System.out.println("using iterator........");
		Iterator it=set.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

