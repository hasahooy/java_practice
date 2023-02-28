package kr.co.infopub.hello;
// String 가공하는 방법 
public class StringTest {

	public static void main(String[] args) {
		String text = "Hello Java4Andriod";
		String com = "HELLO java4ANdriod";
		
		System.out.println(text.charAt(2));  // charAt(2) 0부터 읽기 시작해서 2번째에 있는 값이 무엇인지 물어보는 것 
		System.out.println(text.concat("s"));  // concat 은 +와 같다 문자열 맨 끝에 s를 붙인다.
		System.out.println(text.contains("And"));// contains And 문자열이 포함하고 있는지 true false로 판별한다.
		System.out.println(text.equals(com)); // 두 문자열이 같은지 판별한다.  
		System.out.println(text.equalsIgnoreCase(com)); //대소문자 구별하지 않고 두문자열이 같은지 비교한다 .  
		System.out.println(text.indexOf("a"));  // 문자열이 처음발견된 위치를 반환한다 없다면 -1 로 반환 
		System.out.println(text.lastIndexOf("a"));  // 문자열이 가장 마지막으로 발견된 위츨 반환 없으면 -1 반환
		System.out.println(text.trim()); // 양쪽에 공백을 제거한다 
		System.out.println(text.length());  // 문자열 길이 반환 
		System.out.println(text.substring(7));  // 입력된 위치의 문자열 앞쪽을 자른 다음 그 위치부터 뒤쪽을 반환한다 . 
		System.out.println(text.substring(7,11));  // substring(index1 ,index2) 는 index1부터 index2-index1 자를 반환한다. 
		System.out.println(text.replace("","-")); // replace(a,b) 는 a를 b로 변환한다 . 
		System.out.println(text.replaceAll("", "-"));  
		System.out.println(text.toUpperCase());  // 모두 대문자로 변환 
		System.out.println(text.toLowerCase());  // 모두 소문자로 변환 
		
		String[] sp = text.split("");
		for(int i=0; i<sp.length;i++) {
			System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());		
		}
 		
	}

}
