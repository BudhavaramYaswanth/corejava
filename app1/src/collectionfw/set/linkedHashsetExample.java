package collectionfw.set;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashsetExample {
	public static void main(String[] args) {
	 
	 Set set = new LinkedHashSet ();
	
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

