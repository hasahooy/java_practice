package kr.co.infopub.hello;

public class SwitchCondition {
	public static int toNum(char c) {
		int tot =0;
		switch(c) {
		case 'A' : tot =1 ; break; 
		case 'T' : tot =2 ; break; 
		case 'J' : tot =3 ; break; 
		case 'Q' : tot =4 ; break; 
		case 'K' : tot =5 ; break ; 
		default : tot= c-'0'; break;  // '9' - '0'  
		}
		return tot ;
	}
	public static void main(String[] args) {
		char c = 'J';
		int result =toNum(c);
		System.out.printf("%c => %d\n",c,result);
	}
}
