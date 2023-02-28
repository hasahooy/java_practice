package kr.co.infopub.hello;

public class BioCalendar2 {

	public static final int PHSICAL = 23; 
	
	public static double getBioRhythm(int days, int index,int max) {
		return max * Math.sin((days % index) *2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days =1200;
		
		double phyval = getBioRhythm(days, PHSICAL,100);
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
		
	}

}
