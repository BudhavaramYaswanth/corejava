package APP3;

import java.util.Scanner;

public class Scannerexample2 {
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		System.out.println("enter the first name");
		String firstname =Sc.nextLine();
		
		System.out.println("enter second name");
	    String secondname =Sc.nextLine();
	    
	    String fullname =firstname+" "+secondname;
	    System.out.println(fullname);
	}

}
