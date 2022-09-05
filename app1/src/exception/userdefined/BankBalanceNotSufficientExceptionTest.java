package exception.userdefined;
import java.util.Scanner;

public class BankBalanceNotSufficientExceptionTest {
	public static void main(String[] args) {
		double balance=5000.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdrawamount");
		double withdraw=sc.nextDouble();
		if (balance>=withdraw)
		{
			System.out.println("Money withdraw sucessfully..");
		}
		else {
			throw new BankBalanceNotSufficientException("BankBalance insufficient");
		}
	}

}
