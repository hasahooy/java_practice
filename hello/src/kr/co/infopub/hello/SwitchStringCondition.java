package kr.co.infopub.hello;
import java.util.Scanner;
public class SwitchStringCondition {
	public static double toMoney(String c) {
		double lot = 0.0; 
		switch(c) {
		case "USD" : lot =1126 ; break; 
		case "JPY" : lot = 110.8; break; 
		case "CNY" : lot = 10.5; break; 
		default : lot =1 ;break; 
		}
		return lot;	
	}
	public static void main(String[] args) {
		System.out.println("알고 싶은 환율을 입력하시오 :");
		Scanner scanner = new Scanner(System.in);
		String money = scanner.next();
			double result = toMoney(money);
			System.out.printf("%s => %f\n",money,result);
	}
	
 
}
