package kr.co.infopub.hello;

public class EvenOdd {
	public static void showOddEvenw(int n) {
		int temp = n; 
		while (temp !=1) {
			if(temp%2==1) {
				temp = temp*3+1;
			}else {
				temp/=2;
			}
			System.out.print("["+temp+"]");
		}
		System.out.println("\n-------------");
	}
	public static void main(String[] args) {
		showOddEvenw(3);
		showOddfor(122);
	}

	public static void showOddfor(int n) {
		int i = n;
		for(; i !=1;) {
			if(i%2==1) {
				i = i*3+1;
			}else {
				i /=2;
			}
			System.out.println("["+i+"]");
		}
	}
}
