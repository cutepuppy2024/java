package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민번호 앞자리를 입력받아
		// 990101-1011101

		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.>>");
		String input = scan.nextLine();
		
		// 나이를 출력
		//1,2 1900년대 / 3,4-2000년대
		String year = input.substring(0,2);
		String mil = input.substring(7,8);
		System.out.println(year);
		System.out.println(mil);
		int age = 0;
		switch(mil) {
		case("1"): case("2"):
			int t_year = Integer.parseInt("19"+year);
			age = 2024 - t_year;
			System.out.println(2024-t_year);
//			age = 2024-Integer.parseInt("19"+year);
		case("3"): case("4"):
			int t_year2 = Integer.parseInt("20"+year);
			age = 2024 - t_year2;
			System.out.println(2024-t_year2);
		}
		System.out.println("당신의 나이는 "+age+"입니다");
		
		
		
		
		// 봄,여름,가을,겨울인지 출력
		// 12-02월 : 겨울, 03-05월: 봄, 06-08월: 여름, 09-11월: 가을
//		System.out.println("입력 :"+input);
//		
//		String birthM = input.substring(2,4);
//		System.out.println(birthM);
		
		// switch
//		switch(birthM) {
//			case("03"): case("04"): case("05"):
//				System.out.println("봄");
//				break;
//			case("06"): case("07"): case("08"):
//				System.out.println("여름");
//				break;
//			case("09"): case("10"): case("11"):
//				System.out.println("가을");
//				break;
//			case("12"): case("1"): case("2"):
//				System.out.println("겨울");
//				break;
//		}
//		
//		String str = "990123";
//		String birthM = str.substring(2,4);
//		System.out.println(birthM);
		


	}

}
