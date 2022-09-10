package collectionfw;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromListExample2 {
	
	public static void main(String[] args) {
		
		List cities =new ArrayList ();
		
		cities.add("ATP");
		cities.add("Hyd");
		cities.add("Kurnool");
		cities.add("Tirupati");
		cities.add("Vizag");
		cities.add("ATP");
		cities.add("Kurnool");
		
		System.out.println(cities);
		
		List uniquevalues =new ArrayList ();
		System.out.println(uniquevalues);
		
		for (int i=0; i<cities.size();i++) {
			if(!uniquevalues.contains(cities.get(i))) {
				uniquevalues.add(cities.get(i));
			}
			System.out.println(uniquevalues);
		}
	}
}

