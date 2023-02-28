package kr.co.infopub.hello;

//입력받은 수가 소수인지 판별해보기 
public class PrimMath {
	public static boolean isPrime(int n) {
		boolean isS=true;
		
		for(int i=2; i<=(int)Math.sqrt(n);i++) {
			if(n%i == 0){
				isS=false;
				break;
		}
	}
		return isS; 
}	
	public static void main(String[] args) {
		int number = 10;
		boolean ifPrime = isPrime(number); // 소수인가를 확인하다.
		if(ifPrime) {
			System.out.printf("%d는 1과 자신으로만 나눠 떨어지는 소수다.",number);
		}else {
			System.out.printf("%d은 소수가 아니다.",number);
		}
	}
}

