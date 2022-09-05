package stringbuffer;

public class Examp1 {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
