package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		// equalsIgnoreCase : 대소문자 구분없이 동일한지 여부
		
		// 문자열을 입력받아, 2번째의 문자를 출력하시오
		// 문자열이 3칸 미만으로 입력되면, 다시 입력을할 수 있도록 하기
		// 무한반복 - x가 입력되면 프로그램 종료
		Scanner scan = new Scanner(System.in);
	
		Loop1 :while(true) {
			String s = scan.nextLine();
			System.out.println("3번째 문자 :"+s.charAt(1));
			if(s.length()<3) {
				System.out.println("문자열이 짧습니다. 다시 입력하세요");
			}else if(s.equalsIgnoreCase("x")){
				System.out.println("프로그램 종료");
				break Loop1;
			}
		}// while

	}

}
