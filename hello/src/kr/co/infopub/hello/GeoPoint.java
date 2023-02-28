package kr.co.infopub.hello;

public class GeoPoint {

	public static void main(String[] args) {
		double latatiue1 = 37.52462246;
		double longitude1= 127.444567987; 
		double latatiue2 = 35.13457978; 
		double longitude2 = 224.48978 ;
		System.out.println(latatiue1+"\t"+longitude1);
		
		double[] latlang1 = {latatiue1,longitude1};
		double[] latlang2 = { latatiue2,longitude2} ; 
		
		System.out.println(latlang1[0]+"\t"+latlang2[0]);
		//실수 2차원 배열 
		double [][] latlang = {{latatiue1,longitude1},
							{ latatiue2,longitude2}};
		System.out.println(latlang[0][1]);
		}
		
	}


