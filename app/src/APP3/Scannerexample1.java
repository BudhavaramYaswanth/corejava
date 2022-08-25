package APP3;

import java.util.Scanner;

public class Scannerexample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some integer value");
		int i=sc.nextInt();
		
		System.out.println("enter some another integer value");
		int j=sc.nextInt();
		
		Scannerexample1 Sc =new Scannerexample1();
		int k =Sc.add(i,j);
		System.out.println(k);
	}
	    public int add(int i,int j)
	    {
	    	int k=i+j;
	    	return k;
	    }
	
}
