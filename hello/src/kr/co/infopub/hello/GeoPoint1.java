package kr.co.infopub.hello;

class Geo5{
	public double latatiue;
	public double longitude;
}


public class GeoPoint1 {

	public static void main(String[] args) {
		double latatiue1 = 37.52462246;
		double longitude1= 127.444567987; 
		double latatiue2 = 35.13457978; 
		double longitude2 = 224.48978 ;

		Geo5 geo1 = new Geo5();
		geo1.latatiue =latatiue1;
		geo1.longitude=longitude1;
		System.out.println(geo1.latatiue+"\t"+geo1.longitude);
		
		Geo5 geo2 =new Geo5();
		geo2.latatiue =latatiue2 ; 
		geo2.longitude = longitude2; 
	
		Geo5 geo =geo1;
		System.out.println(geo.latatiue+"\t"+geo.longitude);	
	}
}


