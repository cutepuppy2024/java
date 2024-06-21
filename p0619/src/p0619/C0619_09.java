package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		// 학생프로그램 구현
		Scanner scan = new Scanner(System.in);
		
		// 각항목에 대한 배열생성
		final int STU = 20;
		String[] stuNum = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int[STU][4]; //국영수합계
		double[] avg = new double[STU]; //평균
		int[] rank = new int[STU]; // 등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		Loop1: while(true) {
			
			// main 번호 ->choice
			System.out.println(" [ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 선택하세요");
			int choice = scan.nextInt();
			scan.nextLine(); 
			int s_count = 0;
			
			// choice에 대한 switch구문
			switch(choice) {
			case 1:
				System.out.println(" [ 학생성적 입력 ]");
				// 학번 자동부여
//				System.out.println(title[0]+"을 입력하세요");
				stuNum[s_count] = "S"+String.format("%04d",s_count+1);
				System.out.printf("학번 :",stuNum[s_count]);
				
				// 이름 
				System.out.println(title[1]+"을 입력하세요 (0.취소)");
				String temp = scan.nextLine();
				if(temp.equals("0")) {
					System.out.println("이전화면으로  돌아갑니다");
					System.out.println();
					break;
				}

				name[s_count] = temp;
				
				// 성적입력
				for(int i=0;i<3;i++) {
					System.out.println(title[i+2]+"성적을 입력하세요");//국영수
					score[s_count][i] = scan.nextInt();
					
				}
				scan.nextLine();
				//합계
				score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
				//평균
				avg[s_count] = score[s_count][3]/3.0;
				s_count++;
				break;
				
			case 2:
				System.out.println("[ 성적출력 ]");
				System.out.println("------------------------------");
				// 컬럼출력
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				// 입력한 성적 출력
				for(int i=0;i<s_count;i++) {
					System.out.println("------------------------------");
					System.out.print(stuNum[s_count]+"\t");//학번
					System.out.print(name[s_count]+"\t");//이름
					System.out.printf("%d\t%d\t%d\t%d\n",score[s_count][0],score[s_count][1],score[s_count][2]);//국영수합계
					System.out.printf("%d\t",avg[s_count]);//평균
					System.out.printf("%d\t",rank[s_count]);//등수
				}
				break;
				
			case 3:
				System.out.println(" 성적수정을 선택하셨습니다. ");
				System.out.println("         [ 학생 검색 ]");
				System.out.println("------------------------------");
				System.out.println("학생이름을 검색하세요");
				String search = scan.nextLine();
				int temp_no = -1;
				for(int i=0;i<s_count;i++) {
					if(name[i].equals(search)) {
						temp_no = i;
						System.out.printf("%s 학생이 검색되었습니다.",search);
					}
				}
				
				System.out.println("         [ 성적 수정 ]");
				System.out.println("-------------------------------");
				System.out.println("1.국어성적 수정");
				System.out.println("2.영어성적 수정");
				System.out.println("3.수학성적 수정");
				System.out.println("-------------------------------");
				System.out.println("원하는 번호를 입력하세요");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.printf("%s성적수정",title[choice-1]);
					System.out.printf("현재 %s성적 %d \n",title[choice-1],score[temp_no][choice-1]);
					System.out.println("변경된 점수를 입력하세요 >>");
					score[temp_no][choice-1] = scan.nextInt();
					System.out.printf("변경된 %s성적 %d:",title[choice-1],score[temp_no][choice-1]);
					System.out.println("성적수정이 완료되었습니다.");
					break;
					
				case 2:
					System.out.println("영어성적수정");
					System.out.printf("%s성적수정",title[choice-1]);
					System.out.printf("현재 %s성적 %d \n",title[choice-1],score[temp_no][choice-1]);
					System.out.println("변경된 점수를 입력하세요 >>");
					score[temp_no][choice-1] = scan.nextInt();
					System.out.printf("변경된 %s성적 %d:",title[choice-1],score[temp_no][choice-1]);
					System.out.println("성적수정이 완료되었습니다.");
					break;
				case 3:
					System.out.println("수학성적수정");
					System.out.printf("%s성적수정",title[choice-1]);
					System.out.printf("현재 %s성적 %d \n",title[choice-1],score[temp_no][choice-1]);
					System.out.println("변경된 점수를 입력하세요 >>");
					score[temp_no][choice-1] = scan.nextInt();
					System.out.printf("변경된 %s성적 %d:",title[choice-1],score[temp_no][choice-1]);
					System.out.println("성적수정이 완료되었습니다.");
					break;
				}//성적수정 switch
				break;
			case 0:
				System.out.println("프로그램 종료");
				break Loop1;
				
			}//switch
			
		}//while
		
	}// main

}
