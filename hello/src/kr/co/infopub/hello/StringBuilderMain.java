package kr.co.infopub.hello;

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("i").append("go").append("to school");
		System.out.println(sb);
		sb.replace(4, 8, "hate");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	
	}

}
