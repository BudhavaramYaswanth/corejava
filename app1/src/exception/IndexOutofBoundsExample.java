package exception;

public class IndexOutofBoundsExample {
	public static void main(String[] args) {
		String s="Banglore";
		try {
			char c=s.charAt(60);
			System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException ex) {
			ex .printStackTrace();
		}
		System.out.println("mainmethodend....");
	}

}
