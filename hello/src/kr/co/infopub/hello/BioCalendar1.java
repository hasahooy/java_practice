package kr.co.infopub.hello;

public class BioCalendar1 {
	public static final int PHSICAL = 23; 

	public static void main(String[] args) {
		int index =PHSICAL;
		int days =1200; 
		double phyval = 100*Math.sin((days % index) * 2 * Math.PI/index);
		System.out.printf("나의 신체지수는 %1$.2f 입니다.",phyval);
	}

}
