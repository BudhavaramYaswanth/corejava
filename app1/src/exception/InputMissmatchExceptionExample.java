package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchExceptionExample {
	public static void main(String[] args) {
		System.out.println("enter age");
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int age=sc.nextInt();
			System.out.println("entered age is:"+age);
		}
		catch (Exception e) {
			System.out.println("InputMismatch Exception");
		}
		System.out.println("mainmethodend");
		System.out.println("mainmethodend 1");
		System.out.println("mainmethodend 2");
		System.out.println("mainmethodend 3");
	}
	
}
