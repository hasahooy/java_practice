package kr.co.infopub.hello;
import java.util.ArrayList;
import java.util.List;
//List
public class ForCondition2 {
//for 와 if를 이용하여 홀수에 대한 제곱의 합 구하기
//1-10 사이의 홀수에 대한 제곱의 합을 구해보자  	

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		int s=0; 
		for(int i=0; i<=10; i++) {
			list.add(i);
		}
		for(int m:list) {
			if(m%2==1) {
				s += m*m;
				System.out.printf("%d\t",m*m);
			}
		}
		System.out.println();
		System.out.println("1~10사이의 홀수에 대한 제곱합:"+s);
	}

}
