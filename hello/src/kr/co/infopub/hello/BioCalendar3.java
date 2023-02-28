package kr.co.infopub.hello;

public class BioCalendar3 {

	public static final int PHYSICAL = 23; 	
	
	public 
	double getBioRhythm(int days, int index,int max) {
		return max * Math.sin((days % index) *2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days= 1200;
		BioCalendar3 bio = new BioCalendar3(); //객체를 생성
		//멤버메서드 호출  static이 메서드에 안붙어있으면 객체를 생성해 참조변수를 통해서 
		// 메서드를 호출해야한다 . 
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체지수 %1$.2f입니다.", phyval);
	}

}
