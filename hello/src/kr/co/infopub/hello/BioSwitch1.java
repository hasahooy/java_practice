package kr.co.infopub.hello;

public class BioSwitch1 {

	public static final int PSHYCAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL =33;
	
	public static String textInfor(int index ,double value) {
	String result = "" ;
	switch(index) { 
	case  PSHYCAL : result ="신체지수:" ;break;
	case EMOTIONAL : result ="감정지수:" ; break; 
	case INTELLECTUAL : result ="정신 지수 :"; break; 
		}
	 	return result + (value +100);
	}

	public static void main(String[] args) {
		int index = PSHYCAL ;
		double value = 0.93; 
		String st = textInfor(28,value);
		System.out.println(st);
	}
	
}