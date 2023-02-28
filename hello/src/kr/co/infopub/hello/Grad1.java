package kr.co.infopub.hello;

public class Grad1 {

	public static void main(String[] args) {
		int[] grade  = {90,60,79};
		int tot = grade[0]+ grade[1] + grade[2] ; 
		 
		int average = tot/3 ; 
	    System.out.printf("국어 %d 점 ,영어 %d 점 ,수학 %d 점 =>\t", grade[0],grade[1],grade[2]);
	    System.out.printf("평균 %d 점 ,총점 %d점",average, tot );
	
	
	}
}
