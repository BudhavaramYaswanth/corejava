package string.immutable;

public class Exampl1 {
	public static void main(String[] args) {
		String s="abc";
		s.concat("xyz");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder();
		sb1.append("abc");
		sb1.append("xyz");
		System.out.println(sb1);
		
	}

}
