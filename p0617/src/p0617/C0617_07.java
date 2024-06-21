package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력받아
		// 숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램을 구현
		System.out.println("첫번째 문자열을 입력하시오");
		String str = scan.nextLine();
		char a = str.charAt(0); 
		
		System.out.println("두번째 문자열을 입력하시오");
		String str2 = scan.nextLine();
		char b = str2.charAt(0); 
		
		if ((a >='0'&& a<='9') && (b >='0'&& b<='9')) {
			int num = a-'0'; // 문자 숫자를 정수형으로 변경
//			int n = Integer.parseInt(str); // 문자열을 정수형으로 변경
			int num2 = b-'0';
			System.out.println(num+num2);
			
		}else {
			System.out.printf("%c, %c \n", a, b);
		}
			
		
		System.out.println("2개의 문자열을 입력하시오");
		String str3 = scan.nextLine();
		char c = str3.charAt(0); 
		char d = str3.charAt(1);
		if (c >='0'&& c<='9') {
			if (d >='0'&& d<='9') {
				System.out.println((c-'0')+(d-'0'));
			}
		}else {
			System.out.println("숫자가 아닙니다");
		}
		
		System.out.println("첫번째 문자열을 입력하시오");
		String str4 = scan.nextLine();
		int n = Integer.parseInt(str4);
		System.out.println("두번째 문자열을 입력하시오");
		String str5 = scan.nextLine();
		int m = Integer.parseInt(str5);


		System.out.println(n+m);
	}

}
