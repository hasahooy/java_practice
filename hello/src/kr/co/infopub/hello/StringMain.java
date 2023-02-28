package kr.co.infopub.hello;

public class StringMain {

	public static void main(String[] args) {
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city4 = "Asia";
		
		System.out.println(city1);
		System.out.println(city3);
		System.out.println(city1.length());
		System.out.println(city1==city2);
		System.out.println(city1.equals(city2));
		System.out.println(city1==city3);
		System.out.println(city1.equals(city3));
		System.out.println(city1.equals(city4));
		
		String city5 = String.format("%s-%s",city1,city2);
		System.out.println(city5);
		String city6 = city1+"-"+city2+1+2;
		System.out.println(city6);
		String city7 = 1+2+city1+"-"+city2 +2+3; 
		System.out.println(city7);
		
	}

}
