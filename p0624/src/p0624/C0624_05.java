package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 두수와 1개의 사칙연산 +,-,*,/
		// 입력받아 결과값을 출력
		Scanner scan = new Scanner(System.in);
		
		// #1
		Cal c = new Cal();
		int result = c.add(1, 2, 3);
		
		System.out.println("결과값 :"+result);
		
		// #2
		int[] num = new int[10];
		int sum = c.add2(num);
		
		// #3
		// 배열선언
		int[] arr = new int[2];
		System.out.println("두 개의 숫자를 입력하세요 >>");
		arr[0] =  scan.nextInt();
		arr[1] =  scan.nextInt();
		System.out.println("사칙연산을 입력하세요 >>");
		String str = scan.next();
		
		// 인스턴스메서드 = 객체선언후, 참조변수명.메서드명
		int result1 = c.cal(arr, str); // 객체선언 되어있음
		System.out.println("결과값 :"+ result);
		
			
		System.out.println("숫자를 입력하세요");
		int n1 = scan.nextInt();
		System.out.println("숫자를 입력하세요");
		int n2 = scan.nextInt();
		System.out.println("사칙연산을 입력하세요");
		
		int result2 = 0;
		switch(str) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;

		}//switch
		
		
	}//main

}//class
