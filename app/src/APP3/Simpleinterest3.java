package APP3;

import java.util.Scanner;

public class Simpleinterest3 {
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		
		System.out.println("enter price");
		int p =Sc.nextInt();
		
		System.out.println("enter time(in months");
		int t =Sc.nextInt();
		
		System.out.println("enter rate of interest");
		Double r =Sc.nextDouble();
		
		double si =(p*t*r)/100;
		
		System.out.println(si);
	}

}
