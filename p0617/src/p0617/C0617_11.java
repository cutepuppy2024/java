package p0617;

import java.util.Scanner;

public class C0617_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램을 종료할까요? (종료:x)");
		String str = scan.next();
		
//		if(str.equals("x")|| str.equals("X")) //두가지가 같은 의미
		if(str.equalsIgnoreCase("x")){
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("프로그램을 계속 실행합니다.");
		}
		
		
//		String str = null; // null이라는 값이 들어가 있음
//		String str = "";   // 빈공백이라는 값을 의미
////		if(str != null)
//		if (str != null && !str.equals(""))
//			str.charAt(0); // error
//		else
//			System.out.println("빈문자 입니다.");

	}

}
