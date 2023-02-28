package kr.co.infopub.hello;

class JLocation{
	public double lat; 
	public double lng;
}
public class JavaUserDefinedType {

	public static void main(String[] args) {
		double latitude =37.5123154123412;
		double longitude = 123.1241251523;
		
		JLocation jlot = new JLocation();
		jlot.lat = latitude;
		jlot.lng = longitude;
		 
		JLocation k = jlot;
		System.out.println(k);
		
		}
	}

