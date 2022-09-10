package collectionfw.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {
	public static void main(String[] args) {
	 
	 Set set = new TreeSet();
	
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
	 
	}
}
