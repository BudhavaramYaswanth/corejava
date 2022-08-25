package APP3;

import java.util.Scanner;

public class Productexample {
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		
	System.out.println("enter the product name");
	String productname = Sc.nextLine();
	
	System.out.println("enter the product price");
	double price = Sc.nextDouble();
	
	System.out.println("enter the quantity");
	int qty= Sc.nextInt();
	
	double totalprice =price*qty;
	
	System.out.println(totalprice);
	}
}
