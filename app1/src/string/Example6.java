package string;

public class Example6 {
	public static void main(String[] args) {
		//ASCII value of uppercase alphabets-65to90;
		//ASCII value of lowercase alphabets-97to122;
		
		String s ="abc";
		String s1="ABC";
		int i =s.compareTo(s1);
		System.out.println(i);
		int j =s.compareToIgnoreCase(s1);
		System.out.println(j);
		
	}

}
