package kr.co.infopub.hello;
// 수학연산에서 발생하는 예외 처리하기 
public class FinallyTryCatch {
	public static void main(String[] args) {
		try {
			//dived by zero; 
			int x= 5; 
			int y = 20/(5-x); //여기서 예외 발생 
			System.out.println(y);
		}catch(ArithmeticException e) {
			System.out.println("--->0으로 나눴나 확인해봐");
			e.printStackTrace();
		}finally {
			System.out.println("응~~나 무조건 수행");
		}
	}

}
