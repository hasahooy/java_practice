package kr.co.infopub.hello;

public class ForCondition {
//s=s+a   
	//1~100 사이의 홀수으 합을 구해보자 for 문을 이용하여 
	public static void main(String[] args) {
		int count =0; 
		for(int i=0; i <101; i ++) {
				count +=i ; 
			}		
		System.out.println("1~100의 합:"+count);
		count = 0;
		for(int i=0; i<101;i++) {
			if(i%2==1) {
				count +=i;
			}
		}
		System.out.println("1~100사이의 홀수의 합: "+count );
		}
		
	}


