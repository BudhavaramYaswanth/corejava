package Stringbuilder;

public class examplestb {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("abc");
		sb.append("xyz");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
