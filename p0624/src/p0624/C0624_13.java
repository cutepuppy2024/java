package p0624;

import java.util.Scanner;

public class C0624_13 {

	public static void main(String[] args) {
		// 학생성적프로그램 구현
		Scanner scan = new Scanner(System.in);
		
		Stu_pro sp = new Stu_pro();
		Stu_scores[] sc = new Stu_scores[10];
		// 매개변수 생성자로 객체선언
		
		// 메인메뉴
		Loop1 : while(true) {
			// 화면부분
			int choice = sp.main_menu();
			
			
			switch(choice) {

			case 1:
				break;
			case 2:
				break;
				
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break Loop1;
			}// switch
			
		}// while

	}// main

}// class
