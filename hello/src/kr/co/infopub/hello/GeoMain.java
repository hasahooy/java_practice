package kr.co.infopub.hello;

class Geo{
	private double latitude;  // 위도 멤버   멤버변수 
	private double longitude;  // 경도 멤버    멤버변수 
	public Geo(double latitude,double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Geo() {
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
public class GeoMain{
	public static void main(String[] args) {
		Geo geo1 = new Geo(); //기본 생성자가 없다. 
//		Geo geo1 = new Geo(38.23145,123.24114);
//		geo1.setLatitude(38.231415);
//	geo1.setLongitude(123.512313) ; 
		System.out.printf("위도:%f, 경도:%f\n",geo1.getLatitude(),geo1.getLongitude());
		Geo geo2 = geo1;  //주소 가져오기 
		System.out.printf("위도:%f ,경도:%f\n", geo2.getLatitude(),geo2.getLongitude());
	}
}