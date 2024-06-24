package p0624;

import java.util.Arrays;
import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3]; // 배열선언
		
		for(int i=0;i<3;i++) {
			System.out.println("숫자를 입력하세요");
			num[i] = scan.nextInt();
			
		}
		
		// 객체선언 후, 참조변수명.메서드명
		Cal c = new Cal();
		int result = c.add(num[0],num[1],num[2]);

		
		int sum = c.add2(num);
		
		System.out.println("합계 : "+ result);
		
		
		
		
		System.out.println("----------------------------------------");
		
		// 두 수를 입력받아, 두 수를 더한 값을 출력하시오
//		System.out.println("두 수를 입력하세요");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		System.out.println(num1+num2);
		
		System.out.println("----------------------------------------");
		
		// 배열을 사용하여 for문으로 출력
//		int[] num = new int[3];
//		int sum = 0;
//		for(int i=0;i<3;i++) {
//			System.out.println("숫자를 입력하세요");
//			num[i] = scan.nextInt();
//			sum += num[i];
//		}
//		System.out.println("입력한 숫자의 배열 : "+Arrays.toString(num));
//		System.out.println("누적값 : "+sum);
	}// main

	
}// class
