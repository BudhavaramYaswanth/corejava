package app;

public class constructor {
	public static void main(String[] args) {
		test();
		constructor c=new constructor();
		
		System.out.println("test method");
	}
public static void test() {
System.out.println("test method 1");
}
public void test1() {
	System.out.println("test method 2");
}
public constructor() {
 System.out.println("constructor example");
}
}
