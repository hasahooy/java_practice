package kr.co.infopub.hello;
import java.util.*;
import java.util.Arrays;
public class program2 {
	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = {4,5,6};
		int[] num3 = new int[6];
		
		for(int i=0; i<3; i++) {
			num3[i] = num1[i];
		}
		for(int i=0; i<3; i++) {
			num3[i+3] = num2[i] ; 
		}
		System.out.println(Arrays.toString(num3));
	}
}
