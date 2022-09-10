package array;

public class Example1 {
	public static void main(String[] args) {
		
		int i []= {12,5,7,90};
		String s[]= {"abc","xyz"};
		
		String str[]=new String [3];	//if string value fixed 3
		
		str[0]="abc";
		str[1]="aaa";
		str[2]="bbb";
		
		System.out.println(str);
		
		for (int j=0 ; j<str.length;j++) {
			System.out.println(str[j]);
		}
		
	}

}
