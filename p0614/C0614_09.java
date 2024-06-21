package p0614;

import java.util.Scanner;

public class C0614_09 {

	public static void main(String[] args) {
//		int sca = 0;
		Scanner scan = new Scanner(System.in); // 현재의 콘솔창에서 입력을 받겠다는 의미
		
		// 두 숫자를 입력받아, 덧셈,뺄셈,곱셈,나눗셈을 출력하시오

//		System.out.println("첫번째 숫자를 입력하세요");
//		int num = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		int num2 = scan.nextInt();
//
//		System.out.println("덧셈: "+(num+num2));
//		System.out.println("뺄셈: "+(num-num2));
//		System.out.println("곱셈: "+(num*num2));
//		System.out.println("나눗셈 "+(num/num2));
		
		System.out.println("첫번째 숫자를 입력하세요");
		String num = scan.nextLine();
		System.out.println("두번째 숫자를 입력하세요");
		String num2 = scan.nextLine();
		
		int number = Integer.parseInt(num);
		int number2 = Integer.parseInt(num2);
		System.out.println("덧셈: "+(number+number2));
		System.out.println("뺄셈: "+(number-number2));
		System.out.println("곱셈: "+(number*number2));
		System.out.println("나눗셈 "+(number/number2));
	}

}
