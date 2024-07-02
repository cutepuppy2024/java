package p0702;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Stu_process {
	
	Scanner scan = new Scanner(System.in);
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo, name;
	int kor, eng, math, total, ank;
	double avg;
	int choice;
	
	// 화면부분 메서드
	int screen(ArrayList<Students> list) {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.printf("현재 입력된 학생 수 : %d 명 \n",list.size());
		System.out.println("------------------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("7. 학생성적정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("------------------------------");
		System.out.println("원하는 번호를 입력하세요 >> ");
		choice = scan.nextInt();
		scan.nextLine(); // enterkey때문
		
		return choice;
	}// screen
	// 학생입력부분
	void stu_input(ArrayList<Students> list){
		while(true) {
			 // 이름입력
			 System.out.printf("%d번째 학생이름을 입력하세요 >>(0.이전페이지로 이동) \n",list.size()+1);
			 name = scan.nextLine();
			 
			 if(name.equals("0")) {
				 System.out.println("이전페이지로 이동합니다.");
				 System.out.println();
				 break;
			 }
			 
			 System.out.printf("%s 점수을 입력하세요 >> \n",title[2]);
			 kor = scan.nextInt();
			 System.out.printf("%s 점수을 입력하세요 >> \n",title[3]);
			 eng = scan.nextInt();
			 System.out.printf("%s 점수을 입력하세요 >> \n",title[4]);
			 math = scan.nextInt();
			 scan.nextLine();
			 
			 // list저장
			 list.add(new Students(name,kor,eng,math));
			 
			 // 입력완료
			 System.out.printf("%s 학생 점수를 저장합니다.\n",name);
			 System.out.println(); 
		 }// while	 
	 }//stu_input
	 
	 // 학생성적출력 메서드
	 void stu_print(ArrayList<Students> list) {
		System.out.println(" [ 학생성적 출력 ] ");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		
		if(list.size()==0) {
			System.out.println("   <   출력할 학생성적이 없습니다.  >");
			System.out.println();
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			Students s = (Students) list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
					s.getStuNo, s.getName, s.getKor, s.getEng, s.getMath, s.getTotal,s.getAvg,s.getRank);
		}
		System.out.println();
			
	 }// stu_print
	 
	 // 학생성적수정 메서드
	 void stu_update(ArrayList<Students> list) {
		int temp_no = stu_subSearch(list);
		 
		// 찾는 학생 성적수정
		if (temp_no == -1) {
			System.out.printf("검색한 학생 이름이 존재하지 않습니다. 다시 입력하세요 \n");
			System.out.println();
		}

		// 찾는 학생 검색 후 수정
		if (temp_no== -1) {
			System.out.printf("검색한 학생 이름이 존재하지 않습니다.: \n");
			System.out.println();
		}
			
		// 검색된 학생의 위치
		Students s = (Students) list.get(temp_no);
			
		// 과목수정	
		System.out.printf(" [ 과목별 성적 수정 ] \n", s.getName);
		System.out.println("-------------------------------");
		System.out.println("1. 국어성적 수정");
		System.out.println("2. 영어성적 수정");
		System.out.println("3. 수학성적 수정");
		System.out.println("-------------------------------");
		System.out.println("수정하고자 하는 과목을 선택하세요(0. 학생검색 화면으로 돌아가기)");
		choice = scan.nextInt();	

	
		switch(choice) {
			case 1: // 국어점수 수정
				subject_update(s,s.getKor,choice);
				break;
			case 2:
				subject_update(s,s.getEng,choice);
				break;
			case 3:
				subject_update(s,s.getMath,choice);
				break;
			}// switch


		}// stu_update
	 
		// 학생삭제 메서드
		void stu_delete(ArrayList<Students> list) {
			int temp_no = stu_subSearch(list);
			// 찾는 학생 존재하지 않음
			if (temp_no== -1) {
				System.out.printf("검색한 학생 이름이 존재하지 않습니다. 다시 입력하세요 \n");
				System.out.println();
				return;
			}
			// 삭제코드
			Students s = (Students) list.get(temp_no);
			System.out.printf("%s 학생을 정말 삭제하시겠습니까? (1.삭제, 0.취소) \n",s.getName);
			choice = scan.nextInt();
			
			if(choice ==0) {
				System.out.println("삭제가 취소되었습니다.");
				System.out.println();
				return;
			}else {
				System.out.printf("%s 학생성적을 삭제했습니다.\n", s.getName);
				System.out.println();
				list.remove(temp_no);
			}
			
		}// stu_delete
		
		// 학생검색 메서드
		void stu_search(ArrayList<Students> list) {
			System.out.println(" [ 학생검색 ] ");
			System.out.println("-----------------------");
			System.out.println("1. 학생이름 검색");
			System.out.println("2. 합계점수 검색");
			System.out.println("3. 평균점수 검색");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = scan.nextInt();
			scan.nextLine();
			int cnt = 0; // 학생을 찾았는지 확인하는 변수
			ArrayList searchList = new ArrayList();
			String s_name = "";
			int search_num;
			double search_avg = 0;
			
			switch(choice) {
			case 1: // 학생이름 검색
				System.out.println("학생이름을 입력하세요");

				for(int i=0;i<list.size();i++) {
					Students s = (Students) list.get(i);
					if(s.getName.contains(s_name)) {
						searchList.add(s);
					}//if
				}//for
				
				//  학생성적 출력 메서드 호출
				stu_print(searchList);
				break;
				
			case 2: // 합계점수 검색
				System.out.println("몇점 이상의 합계점수를 검색하시겠습니까?");
				search_num = scan.nextInt();
				
				for(int i=0;i<list.size();i++) { 
					Students s = (Students) list.get(i);
					if(s.getTotal >= search_num) { 
						searchList.add(s);
					}
				}
				//  학생성적 출력 메서드 호출
				stu_print(searchList);
				break;
			case 3: // 평균점수 검색
				System.out.println("몇점 이상의 평균점수를 검색하시겠습니까?");
				search_num = scan.nextInt();
				
				for(int i=0;i<list.size();i++) { 
					Students s = (Students) list.get(i);
					if(s.getAvg >= search_num) { 
						searchList.add(s);
					}
				}
				//  학생성적 출력 메서드 호출
				stu_print(searchList);
				break;
			}
		}
		
		// 등수처리 메서드
		void stu_rank(ArrayList<Students> list) {
			System.out.println(" [ 등수처리 ] ");
			for(int i=0;i<list.size();i++) {
				int count = 1; // 초기화
				for(int j=0;j<list.size();j++) { 
					Students s = (Students)list.get(i);
					Students s2 = (Students)list.get(j);
					if(s.getTotal<s2.getTotal) count++;
						s.setRank = count;
			}
			}
			System.out.println("등수처리가 완료되었습니다.");
			System.out.println();
		}// stu_rank
		
		// 학생성적정렬 메서드
		void stu_sort(ArrayList<Students> list) {
			System.out.println(" [ 학생성적 정렬 ] ");
			System.out.println("1.이름순차정렬");
			System.out.println("2.이름역순정렬");
			System.out.println("3.합계순차정렬");
			System.out.println("4.합계역순정렬");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1: // 이름순차
				list.sort(new Comparator<Students>() {
					@Override
					public int compare(Students o1, Students o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				break;
			case 2: //이름역순
				list.sort(new Comparator<Students>() {

					@Override
					public int compare(Students o1, Students o2) {
						return o2.getName().compareTo(o1.getName());
					}
				});
				break;
			case 3://합계순차
				list.sort(new Comparator<Students>() {
					@Override
					public int compare(Students o1, Students o2) {
						return o1.getTotal()-o2.getTotal();
					}
				});
				break;
			case 4://합계역순
				list.sort(new Comparator<Students>() {

					@Override
					public int compare(Students o1, Students o2) {
						return o2.getTotal()-o1.getTotal();
					}
				});
				break;
			case 5://학번순차정렬
				list.sort(new Comparator<Students>(){

					@Override
					public int compare(Students o1, Students o2) {
						return o1.getStuNo().compareTo(o2.getStuNo());
					}
					
				});
				break;
				
				
			}//switch
				
			
		}// stu_sort
		
		// 파일저장 메서드
		void stu_sort(ArrayList<Students> list) {
			System.out.println(" [ 파일저장 ] ");
			String str = "";
			for(int i=0;i<list.size();i++) {
				Students s = list.get(i);
				str += String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			}
			try {
				FileWriter fw = new FileWriter("c:/save/abc.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(str);
				bw.close();
				
			}catch(Exception e) {e.printStackTrace();}
				
			
		}
		
//-----------------------------------------------------------------------
	 
		// 수정, 삭제에서 검색부분 메서드
		int stu_subSearch(ArrayList list) {
			System.out.println("[ 학생 검색 ]");
			System.out.println("찾고자 하는 학생이름을 입력하세요 >>");
			String search = scan.nextLine();
			// 찾는 학생이 검색된 위치값
			int temp_no = -1; 
			for(int i=0;i<list.size();i++) { // 이름이 정확히 맞는 경우
				Students s = (Students) list.get(i);
				if(s.getName.equals(search)) {
					temp_no = i;
					System.out.printf("%s 학생이 검색되었습니다.\n",search);
					System.out.println();
					break;
				}// if
			}//for

			return temp_no;
		}
		
		// 과목별 수정 메서드
		void subject_update(Students s, int score, int choice) {
			System.out.printf("%s 성적 수정을 선택하셨습니다. \n",title[choice+1]);
			System.out.printf("현재 %s 성적 : %d \n",title[choice+1],score);
			System.out.println("수정할 성적을 입력하세요 >>");
			score = scan.nextInt();
			
			if (choice == 1) s.setKor = score;
			else if(choice == 2) s.setEng = score;
			else s.setMath= score;
			
			s.setTotal = s.setKor + s.setEng + s.setMath;
			s.setAvg = s.setTotal/3.0;

			System.out.println("성적수정이 완료되었습니다.");
			System.out.printf("변경된 %s 성적 : %d \n",title[choice+1],score);
			System.out.println();
		}// subject_update
		
		
		
		

		
		
  
}//class
