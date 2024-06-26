package StuPjt;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		// 확인용 데이터
		list.add(new StuData("홍길동",100,90,80));
		list.add(new StuData("유관순",90,95,85));
		list.add(new StuData("홍길동",95,80,70));
		Stu_pro st = new Stu_pro();
		
		while(true) {
		// 화면부분
			int choice = st.screen(list);
		
		switch(choice) {
		case 1:// 학생입력부분
			st.stu_input(list);
			break;
		case 2:
			st.stu_output(list);
			break;
		case 3:
			st.stu_correct(list);
			break;
			}
			
			
			
			
//		case 4:
//			st.stu_search(list);
//			break;
		}
		
			
		}//while

	}// main

}// class
