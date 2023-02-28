package kr.co.infopub.hello;

class Geo1{
	private double latitude;  // 위도 멤버   멤버변수 
	private double longitude;  // 경도 멤버    멤버변수 
	public Geo1(double latitude,double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Geo1() {
		this(37.5, 123);
	}  //기본생성자 
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	
}
public class GeoMain1{
	public static void main(String[] args) {
		Geo[] geo = new Geo[] {
				new Geo(37.5,122.421),new Geo(39, 298.44),new Geo(18,111.234)
		};
		
		Geo[] geo1 = new Geo[3]; // 3개의 객체가 생성되지는 않는다. 
		geo1[0] = new Geo(37.5,122.421);
		geo1[1] = new Geo(39, 298.44);
		geo1[2] = new Geo(18,111.234); 
 		System.out.printf("위도:%f, 경도:%f\n",geo[1].getLatitude(),geo[0].getLongitude());
		System.out.printf("위도:%f ,경도:%f\n", geo1[0].getLatitude(),geo1[0].getLongitude());
	}
}
