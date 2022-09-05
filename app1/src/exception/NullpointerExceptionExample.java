package exception;
import java.util.InputMismatchException;

public class NullpointerExceptionExample {
	public static void main(String[] args) {
		String s=null;
		try
		{
			int Count=s.length();
			System.out.println(Count);
		}
		catch(InputMismatchException e){
		System.out.println("InputMismatchException");	
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			
		}
	}

}
