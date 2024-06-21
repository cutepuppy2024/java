package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		// 주민번호를 입력받아
		// 990101-1011101
		// 나이를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String input = scan.nextLine();
		String year = input.substring(0,2);
		String mil = input.substring(7,8);
		int age = 0;
		String sex = "";
		if (mil.equals("1") || mil.equals("2")) {
			age = 2024-Integer.parseInt("19"+year);
			if (mil.equals("1")) {
				sex = "남자";
			}else {
				sex = "여자";
			}
		}else {
			age = 2024-Integer.parseInt("20"+year);
			if (mil.equals("3")) {
				sex = "남자";
			}else {
				sex = "여자";
			}
		}

		System.out.println("당신은"+age+"세의"+sex+"입니다");
	}

}
