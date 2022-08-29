package Casting;
class Tree
{
	public void Leafs()
	{
		System.out.println("TreeLeafs");
	}
}

public class BananaTree extends Tree
{
public void Leafs() {
	System.out.println("BananaTreeLeafs");
}
public static void main(String[] args) {
	Tree t=new BananaTree();				//oops Autoupcastingdifference in object creation check in main method 
	t.Leafs();								//other examples in front of oops
}
}
