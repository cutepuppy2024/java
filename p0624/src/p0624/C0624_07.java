package p0624;

import java.util.Arrays;
import java.util.Scanner;

public class C0624_07 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int[] result = new int[4];	

		// Element의 메서드를 활용하여
		// a,b의 사칙연산 결과값을 출력
		// cal(a,b);
		
		// 더하기 : 15
		// 빼기 : 5
		Element e = new Element();
		e.allCal(a,b,result);
		
//		System.out.println(Arrays.toString(result));
		System.out.println("더하기 : "+result[0]);
		System.out.println("빼기 : "+result[1]);
		System.out.println("곱하기 : "+result[2]);
		System.out.println("나누기 : "+result[3]);
		
//		int add = e.cal(a,b);
//		int sub = e.cal2(a,b);
//		int multi = e.cal3(a,b);
//		int divide = e.cal4(a,b);
		
//		System.out.println("더하기 :"+add);
//		System.out.println("빼기 :"+sub);
//		System.out.println("곱하기 :"+multi);
//		System.out.println("나누기 :"+divide);
		
	}

}
