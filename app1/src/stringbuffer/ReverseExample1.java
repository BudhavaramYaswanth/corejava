package stringbuffer;

public class ReverseExample1 {
	public static void main(String[] args) {
		String city="Banglore";
		//convert from string to stringbuilder
		
		StringBuilder sb=new StringBuilder(city);
		System.out.println(sb);
		
		sb.reverse();
		//convert from stringbuilder to string
		
		String s=sb.toString();
		System.out.println(s);
	}

}
