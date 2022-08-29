package oops.polymorphism;
class Parent
{
	public void test1(int i) {					//non static method reference in static method
		System.out.println("Parent");
	}
}
public class MethodOverridingExample extends Parent {	//we use definately inheritance concept extends keyword
	public void test(int i) {							//in methodoverriding for polymorphism 
		System.out.println("child");
	}
	public static void main(String[] args) {			//this is static method we create object for nonstatic
		MethodOverridingExample b=new MethodOverridingExample();
		b.test(2000);
		
		Parent p =new Parent();
		p.test1(03);
	}

}
