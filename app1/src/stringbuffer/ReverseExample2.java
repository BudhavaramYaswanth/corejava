package stringbuffer;

public class ReverseExample2 {
	public static void main(String[] args) {
		String city ="Banglore";
		System.out.println(city);
		
	for (int i=city.length()-1;i>=0;i--) {
		System.out.println(city.charAt(i));
	}
	}

}
