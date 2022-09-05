package string;

public class Example2 {
	public static void main(String[] args) {
		String cities="Hyderbad#Banglore#Chennai#Vizag#Hubli#Mumbai#Pune#Bellary";
		String cs[]=cities.split("#");
		
		//System.out.println(cs[0]);
		//System.out.println(cs[3]);
		//System.out.println(cs[6]);
		
		for (int i=0; i<cs.length; i++)
		{
			System.out.println(cs[i]);
		}
		
	// if (cs[i].endswith("e"))
	//	{
	//	System.out.println();
	// }
	
	// if (cs[i].startswith("h"))
	//{
	//System.out.println();
	//}
		
		
		
}
	
}