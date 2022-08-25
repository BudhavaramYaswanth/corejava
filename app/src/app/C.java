package app;

public class C {
//	public static void main(String[] args) {     //if there is so many main but different
//	System.out.println("ice cream");			//methods used see difference in another main
//}

//static public void main(String[] args) {
//	System.out.println("ice cream 1");
//}

//static public void main(String yash[]) {
//	System.out.println("ice cream 2");
//}


//static public void main(String yash[]) {
//	System.out.println("ice cream 4");
//}

static public void main(String... yash) {		//different methods we use only 3 dots for string in this case 4 dots compling error
	System.out.println("java1");

main(2000);
}

static public void main(String yash) {			//this is string & name
	System.out.println("java2");
}

static public void main(int yash) {			//this is integer but it allows string name by using 
System.out.println("java3");				//main method write int values(2000)
}

}