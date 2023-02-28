package kr.co.infopub.hello;

public class BioSwitch {
	public static String textInfor(int index,double value) {
		String result ="";
		switch(index) {
		case 23: result = "신체지수:";
			break;
		case 24: result ="감정 지수 :"; 
			break;
		case 25: result ="정신 지수 :";
			break; 
		}
		return result +(value*100);
	}	
	public static void main(String[] args) {
		int index=25;
		double value = 0.87; 
		String st = textInfor(index,value); // 메서드 호출 
		System.out.println(st);
	}

}
