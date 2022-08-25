package oops.inheritance;

public class child2 extends Parent			//inheritance concept we using (extends) keyword 
{											//creating child2 & Parent
	public static void main(String[] args) {
		
	child2 c = new child2 ();
	c.asserts();						//it is calling from parent to child2 & child1 also
	c.surname();
}
}