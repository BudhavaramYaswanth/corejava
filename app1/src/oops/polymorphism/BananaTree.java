package oops.polymorphism;

class Tree{

	public void leafs()
	{
		System.out.println("Apple leafs");
	}
}
	public class BananaTree extends Tree{	//overrides in polymorphism
	public void leafs(){
	System.out.println("Apple Tree leafs");
}
	public static void main(String[] args){
		
		BananaTree b = new BananaTree ();
		
		b.leafs();
		
		Tree t = new Tree();
		t.leafs();
				
		
	}
	}