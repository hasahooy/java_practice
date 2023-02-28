package kr.co.infopub.hello;

import java.util.ArrayList;
import java.util.List;

public class LottoList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//넣기
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		//가져오기 
		for(int i=1;i<list.size();i++) {
			int m =list.get(i);
			System.out.printf("%d\t",m);
		}
		System.out.println();
	}

}
