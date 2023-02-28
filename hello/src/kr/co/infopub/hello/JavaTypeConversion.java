package kr.co.infopub.hello;

public class JavaTypeConversion {

	public static void main(String[] args) {
		String slat = "37.421315235  ";
		double latitue = Double.parseDouble(slat.trim());
		System.out.println(latitue);
	}

}
