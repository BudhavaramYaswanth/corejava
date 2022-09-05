package exception;

public class ArithmeticExample {
	public static void main(String[] args) {
		System.out.println("main method start");
		int i=100;
		int j=0;
		
		try{
			int k=i/j;
			System.out.println(k);
		}
		catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		}
		catch (RuntimeException e) {
			System.out.println("Exception");
		}
		System.out.println("mainmethod end");
		System.out.println("mainmethod end 1");
		System.out.println("mainmethodend 2");
		System.out.println("mainmethod end 3");
		System.out.println("mainmethod end 4");
		System.out.println("mainmethod end 5");
		System.out.println("mainmethod end 6");
	}

}
