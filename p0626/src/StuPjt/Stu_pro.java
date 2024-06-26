package StuPjt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Stu_pro {
	Scanner scan = new Scanner(System.in);
	static int count;
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	int choice = 0;
	int score = 0;
	
	// 화면부분
	int screen(ArrayList list) {
		System.out.println(" [ 학생성적프로그램 ] ");
		System.out.println("-----------------------------");
		System.out.printf("1. 성적입력, 현재 입력되어 있는 학생 수 %d\n",list.size());
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("0. 프로그램 종료");
		System.out.println("원하는 번호를 입력하세요");
		choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
	}// screen
	
	// 학생입력부분
	void stu_input(ArrayList list) {
		while(true) {
			System.out.println(" [ 성적입력 ] ");
			// 학번
			System.out.printf("%d 번째 학생이름을 입력하세요(0.취소) >> ",list.size()+1);
			name = scan.nextLine();
			
			if(name.equals("0")){
				System.out.println("이전 화면으로 돌아값니다.");
				System.out.println();
				break;
			}
	
			System.out.println("국어성적을 입력하세요 >>");
			kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요 >>");
			eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요 >>");
			math = scan.nextInt();
			scan.nextLine();
			
			
			list.add(new StuData(name,kor,eng,math));
			System.out.printf("%s 학생 점수 입력이 완료되었습니다.",name);
			System.out.println();
		}//while

	}//stu_input
	
	void stu_output(ArrayList list) {
		System.out.println(" [ 성적출력 ]");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t", title[i]);
			
		}// title
		System.out.println();
		System.out.println("---------------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			StuData sd = (StuData) list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t \n",
					sd.stuNo,sd.name,sd.kor,sd.eng,sd.math,sd.total,sd.avg,sd.rank);
		}
		System.out.println();
	}//stu_output
	
	void stu_correct(ArrayList list) {
		System.out.println(" [ 학생검색 ]");
		System.out.println("찾고자 하는 학생 이름을 입력하세요 >>");
		String s_name = scan.nextLine();
		int temp_no = -1;
	

		for(int i=0;i<list.size();i++) {
			StuData sd = (StuData) list.get(i);
			if(s_name.equals(s_name)) {
				temp_no = i;
				System.out.printf("%s 학생이 검색되었습니다.");
			}// if
			if(temp_no == -1) {
				System.out.println("찾고자 하는 학생이 없습니다.");
			}
		}//for
		
		// 검색된 학생의 위치
		StuData sd = (StuData) list.get(temp_no);
		// 성적수정
		System.out.println(" [ 성적수정 ]");
		System.out.println("1. 국어성적");
		System.out.println("2. 영어성적");
		System.out.println("3. 수학성적");
		System.out.println("---------------------------");
		System.out.println("원하는 과목을 선택하세요 >>");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1 :
			sub_score(sd,sd.kor,choice);
			break;
		case 2 :
			sub_score(sd,sd.eng,choice);
			break;
		case 3 :
			sub_score(sd,sd.math,choice);
			break;
		}
		
	}
	// 과목별 수정 메서드
	void sub_score(StuData sd, int score, int choice) {
		System.out.printf("현재 %s 성적 : %d",title[choice+1],score);
		System.out.printf("변경할 %s 성적을 입력하세요 >>",score);
		score = scan.nextInt();
		System.out.printf("%d로 %s 성적이 변경되었습니다.",score,title[choice+1]);

		if(choice == 1) score = sd.kor;
		else if(choice == 2) score = sd.eng;
		else score = sd.math;
		
		}//sub_score
	
}
