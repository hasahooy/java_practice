package kr.co.infopub.hello;

import java.util.Date;
import java.util.Calendar;
public class JavaObjectType {

	public static void main(String[] args) {
		int[] m = {1,2,3};
		int[] n = new int[] {1,2,3};
		
		String card = "Hb";
		Date d=new Date();
		Calendar cal =Calendar.getInstance(); 
		
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}

}
