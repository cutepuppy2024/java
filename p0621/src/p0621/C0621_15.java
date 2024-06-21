package p0621;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0621_15 {
	
	int num = 0; // 인스턴스변수 - 객체선언후 참조변수명.변수명으로 사용
	static int n = 0; // 클래스변수 - 객체선언 없이 클래스명.변수명으로 사용

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 변수선언
		Stu_pro sp = new Stu_pro();
		Stu_score[] sc = new Stu_score[10]; // 배열선언
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0;
		
		while(true) {
			// 화면부분
			int choice = sp.main_menu();
			
			switch(choice) {
			case 1:
				// 학생입력부분 
				s_count = sp.stu_input(sc, s_count);
				break;
			case 2:
				// 학생성적출력부분
				sp.stu_output(sc,s_count, title);
				break;
			}//switch
				
		}//while

	}// main

}// class
