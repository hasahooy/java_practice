package kr.co.infopub.hello;
//String과 비슷하지만 다른 특징을 가진 StringBuffer를 익혀보자 .
public class StringBufferMain {

	public static void main(String[] args) {
		//StringBuffer 생성
		StringBuffer sb1= new StringBuffer();
		//1 계속 붙이는 함수 mutable 
		sb1.append("안녕하세여").append("나는").append("한상훈").append("입니다");
		System.out.println(sb1.toString()+sb1.hashCode());
		//2 replace
		sb1.replace(0, 2, "나 보기가 역겨워");
		System.out.println(sb1.toString()+sb1.hashCode());
		//3 reverse
		sb1.reverse();
		System.out.println(sb1.toString());
		//4 delete
		sb1.delete(10, 15);
		System.out.println(sb1);
		//5 cal by reference, shallwo copy
		replaces(sb1);
		System.out.println(sb1.toString());
	
	
	}
	
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");
	}
}
