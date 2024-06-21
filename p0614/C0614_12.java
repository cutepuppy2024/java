package p0614;

import java.util.Scanner;

public class C0614_12 {

	public static void main(String[] args) {
		// Integer.parseIn() : 문자열을 숫자로 변경
		// next(), nextLine(), nextInt(), nextDouble() 
		// charAt() : 문자열 중 하나의 문자만 가지고 옴
		
		// 대문자를 입력하면 소문자로 출력하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.println("대문자를 입력하세요");  // ABC
		String letter = scan.next();
//		char input = letter.charAt(1); // 문자열에서 0번째 문자를 가져옴
//		System.out.println((char)(input+32)); // 소문자로 형변환
		
		System.out.println(letter.toLowerCase());// 문자열 소문자변환 메소드 사용

	}

}
