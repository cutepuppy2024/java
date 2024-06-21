package p0617;

import java.util.Scanner;

public class C0617_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 또는 숫자를 입력하세요");
		String str = scan.next(); // next(): 사이띄우기 전까지 문자열입력, nextLine(): 모든문자
		char ch = str.charAt(0);  // 문자열을 문자로 변환
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("영문자입니다");
		}else {
			System.out.println("영문자가 아닙니다");
		}
		
		if(ch>='0' && ch<='9') {
			System.out.println("숫자입니다");
		}else {
			System.out.println("숫자가 아닙니다");
		}

	}

}
