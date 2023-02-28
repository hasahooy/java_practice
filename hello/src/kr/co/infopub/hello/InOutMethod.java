package kr.co.infopub.hello;
import java.util.Scanner;

public class InOutMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세여");
		int choice =  scanner.nextInt();
		System.out.println(choice);
		
		System.out.println("실수를 입력하세여");
		double rchoice =scanner.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세여");
		String schoice  = scanner.next();
		System.out.println(schoice);
		
	}

}
