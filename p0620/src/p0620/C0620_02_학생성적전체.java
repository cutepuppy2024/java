package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_02_학생성적전체 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 변수선언
		final int STU = 10;
		String[] stuNo = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int[STU][4];
		double[] avg = new double[STU];
		int[] rank = new int[STU];
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0;
		// data
		
		Loop1 : while(true) {
			// 화면부분
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("------------------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			int choice = scan.nextInt();
			scan.nextLine(); // enterkey때문
			
			switch(choice) {
			case 1:
				while(true) {
					System.out.println(" [ 학생 성적입력 ] ");
					// 학번
//					String stuNo1 = "S"+"0001";
//					String stuNo1 = "S"+(s_count+1);
					Date date = new Date(); // 객체생성
					SimpleDateFormat sdf = new SimpleDateFormat("yy"); // 시간함수 중 year 2자리수
					String stuNo1 = "S"+sdf.format(date)+String.format("%03d",s_count+1);
					stuNo[s_count] = stuNo1;
					System.out.println("학생번호 : "+stuNo1);
					
					// 이름
					System.out.println("이름을 입력하세요 (0.이전화면으로 이동) >> ");
					name[s_count] = scan.nextLine();
					if(name[s_count].equals("0")) {
						System.out.println("이전 화면으로 이동합니다.");
						System.out.println();
						break;
					}
		
					// 국영수합계
					System.out.println("국어점수를 입력하세요 >>");
					score[s_count][0] = scan.nextInt();
					System.out.println("영어점수를 입력하세요 >>");
					score[s_count][1] = scan.nextInt();
					System.out.println("수학점수를 입력하세요 >>");
					score[s_count][2] = scan.nextInt();
					scan.nextLine();
					
					score[s_count][3] = score[s_count][0] + score[s_count][1] + score[s_count][2];
					
					// 평균
					avg[s_count] = score[s_count][3]/3.0;
					
					// 입력완료
					System.out.printf("%s 학생성적이 저장되었습니다. \n",name[s_count]);
					System.out.println();
					
					s_count++;
	
				}
				
				break;
				
			case 2:
				System.out.println(" [ 학생성적 출력 ] ");
				// title
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("----------------------------");
				for(int i=0;i<s_count;i++) {
					System.out.printf("%s\t",stuNo[i]); // 학번
					System.out.printf("%s\t",name[i]); // 이름
					for(int j=0;j<4;j++) {
						System.out.printf("%s\t",score[i][j]); // 국영수합계
					}
					System.out.printf("%.2f\t",avg[i]); // 평균
					System.out.printf("%s\t",rank[i]);  // 등수
					System.out.println();
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println(" [ 학생성적 수정 ] ");
				
				while(true) {
					
					System.out.println("학생 이름을 검색하세요 (0.취소)");
					// 이름전체
					String search = scan.nextLine();
					if(search=="0") {
						System.out.println("이전화면으로 돌아갑니다. ");
						break;
					}
					
					int cnt = -1;
					for(int i=0;i<title.length;i++) { // 이름이 정확히 맞는 경우
						if(name[i].equals(search)) {
							cnt = i;
							break;
						}
					}
					if (cnt == -1) {
						break;
					}
					System.out.printf("%s 검색한 학생 이름: \n",search);
					// 과목수정	
					while(true) {
						System.out.println(" [ 과목별 성적 수정 ] ");
						System.out.println("-------------------------------");
						System.out.println("1. 국어성적 수정");
						System.out.println("2. 영어성적 수정");
						System.out.println("3. 수학성적 수정");
						System.out.println("-------------------------------");
						System.out.println("수정하고자 하는 과목을 선택하세요(0. 학생검색 화면으로 돌아가기)");
						choice = scan.nextInt();
						if(choice==0) {
							System.out.println("과목수정을종료하고 학생검색화면으로 돌아갑니다.");
							break;
						}

						System.out.printf("%s 성적 수정을 선택하셨습니다. \n",title[choice-1]);
						System.out.printf("%s의 현재 %s 성적 : %d \n",search,title[choice+1],score[cnt][choice-1]);
						System.out.println("수정할 성적을 입력하세요 >>");
						int c_score = scan.nextInt();
						score[cnt][choice-1] = c_score;
						System.out.println("성적수정이 완료되었습니다.");
						System.out.printf("%s의 변경된 %s 성적 : %d \n",search,title[choice+1],score[cnt][choice-1]);
						}//과목수정 while
					
					}// 학생검색 while
					break;
				
			case 4:
				System.out.println(" [ 학생검색 ] ");
				System.out.println("-----------------------");
				System.out.println("1. 합계점수 검색");
				System.out.println("2. 평균점수 검색");
				System.out.println("3. 학생이름 검색");
				System.out.println("-----------------------");
				System.out.println("원하는 번호를 입력하세요 >>");
				choice = scan.nextInt();
				scan.nextLine();
				int cnt = 0; // 학생을 찾았는지 확인하는 변수
				switch(choice) {
				case 1: // 합계점수 검색
					System.out.println("합계점수를 입력하세요");
					int t_score = scan.nextInt();
					
					// title
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("----------------------------");
					cnt = 0; // 학생을 찾았는지 확인하는 변수
					for(int i=0;i<s_count;i++) { 
						if(score[i][3] >= t_score) { 
							System.out.printf("%s\t",stuNo[i]); // 학번
							System.out.printf("%s\t",name[i]); // 이름
							for(int j=0;j<4;j++) {
								System.out.printf("%s\t",score[i][j]); // 국영수합계
							}
							System.out.printf("%.2f\t",avg[i]); // 평균
							System.out.printf("%s\t",rank[i]);  // 등수
							System.out.println();
							cnt=1;
						} 
					}
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요");
						System.out.println();
					}
					
					break;
				case 2:
					System.out.println("평균점수를 입력하세요");
					double a_score = scan.nextDouble();
					
					// title
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("----------------------------");
					cnt = 0; // 학생을 찾았는지 확인하는 변수
					for(int i=0;i<s_count;i++) { 
						if(avg[i] >= a_score) { 
							System.out.printf("%s\t",stuNo[i]); // 학번
							System.out.printf("%s\t",name[i]); // 이름
							for(int j=0;j<4;j++) {
								System.out.printf("%s\t",score[i][j]); // 국영수합계
							}
							System.out.printf("%.2f\t",avg[i]); // 평균
							System.out.printf("%s\t",rank[i]);  // 등수
							System.out.println();
							cnt=1;
						} 
					}
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요");
						System.out.println();
					}
					break;
					
				case 3: //  학생이름검색
					System.out.println("학생이름을 입력하세요");
					String t_name = scan.nextLine();
					// title
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("----------------------------");
					cnt = 0; // 학생을 찾았는지 확인하는 변수
					for(int i=0;i<s_count;i++) { // 이름이 정확히 맞는 경우
//						if(name[i].equals(t_name)) {
						if(name[i].contains(t_name)) { // 이름중 일부가 포함 
							System.out.printf("%s\t",stuNo[i]); // 학번
							System.out.printf("%s\t",name[i]); // 이름
							for(int j=0;j<4;j++) {
								System.out.printf("%s\t",score[i][j]); // 국영수합계
							}
							System.out.printf("%.2f\t",avg[i]); // 평균
							System.out.printf("%s\t",rank[i]);  // 등수
							System.out.println();
							cnt=1;
						} 
					}
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요");
						System.out.println();
					}
					break;
				}
				
			case 5:
				System.out.println(" [ 등수처리 ] ");
				for(int i=0;i<s_count;i++) {
					int count = 1; // 초기화
					for(int j=0;j<s_count;j++) 
						if(score[i][3]<score[j][3]) count++;
							rank[i] = count;
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
			case 0:
				System.out.println(" [ 프로그램 종료 ] ");
				break Loop1;
			
			}//switch
			
		}//while
		
	}// main

}//class
