package collectionfw;

import java.util.LinkedList;

public class Example3 {
	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		
		list.add("abc");
		list.add("123");
		list.add("true");
		list.add("34.90");
		list.add('a');
		list.add('a');
		list.add('a');
		
		System.out.println(list);
	}
}
