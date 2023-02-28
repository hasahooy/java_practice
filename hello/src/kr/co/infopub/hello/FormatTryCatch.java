package kr.co.infopub.hello;
//정수타입 문자열을 입력받아 정수로 변환할 때 발생할 수 있는 예외를 처리해 보자.
public class FormatTryCatch {

	public static void main(String[] args) {
		String sNum = "h";
		String hNum = "123";
		try {
			int a =Integer.parseInt(sNum);
			System.out.println(a);
		}catch(NumberFormatException e) {
			System.out.println("int인지 확인점 ;;; ");
			e.printStackTrace();
		}finally {
			System.out.println("응~~~종료 시켜도 나는 실행 돼~~~~");
		}
	}

}
