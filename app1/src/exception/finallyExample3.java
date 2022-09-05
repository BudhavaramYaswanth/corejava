package exception;
import java.util.InputMismatchException;
public class finallyExample3 {
	public static void main(String[] args) {
		System.out.println("main method start");
	try {
		System.out.println("try block start");
		int i=100/0;
		System.out.println(i);
		System.out.println("try block end");
	}
	catch (NullPointerException e) {
		System.out.println("NullPointerException");
	}
	catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
	}
	catch (InputMismatchException e) {
		System.out.println("InputMismatchException");
	}
	finally {
		System.out.println("finally");
	}
	System.out.println("main method end");
	}

}
