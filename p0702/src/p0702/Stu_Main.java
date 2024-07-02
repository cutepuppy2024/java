package p0702;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.객체사용 process에서
		// 2.직접
		String stuNo="", name="";
		int kor=0, eng=0, math=0, total=0, rank=0;
		double avg=0;
		int choice = 0;
		
		Stu_process sp = new Stu_process();
		ArrayList<Students> list = new ArrayList<Students>();
		
		Loop1 : while(true) {
			choice = screen(list);
			
			switch(choice) {
			case 1:// 학생입력 구현
				// 읽어오기
				FileReader fr = new FileReader("c:/save/abc/txt");
				BufferedReader br = new BufferedReader(fr);
				while(true) {
					String line = br.readLine();
					if(line==null) break;
					
					String[] arr = line.split(",");
					stuNo = arr[0];
					name = arr[1];
					kor = Integer.parseInt(arr[2]);
					eng = Integer.parseInt(arr[3]);
					math = Integer.parseInt(arr[4]);
					total = Integer.parseInt(arr[5]);
					avg = Double.parseDouble(arr[6]);
					rank = Integer.parseInt(arr[7]);
					list.add(new Students (stuNo,name,kor,eng,math,total,avg,rank));
					
				}
				

				// 번호더하기
//				sp.stu_input(list); 
				String lastStr = list.get(list.size()-1).getStuNo().substring(1);
				Students.count = Integer.parseInt(lastStr)+1;


					break;
				case 2:// 학생성적 출력
					sp.stu_print(list);
					break;
				case 3: // 학생성적 수정
					sp.stu_update(list);
					break;
				case 4:// 학생성적삭제
					sp.stu_delete(list);
					break;
				case 5:// 학생성적검색
					sp.stu_search(list);
					break;
				case 6: // 등수처리
					sp.stu_rank(list);
					break;
					
				case 7: // 학생성적정렬
					sp.stu_sort(list);
					break;
				case 8: // 파일저장
					sp.stu_save(list);
					break;
				case 0: // 프로그램 종료
					break Loop1;
				}// switch
				}//while
	
				
				
		}// main

	}// class

