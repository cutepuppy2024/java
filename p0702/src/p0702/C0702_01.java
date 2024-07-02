package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C0702_01 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		String stuNo="", name="";
		int kor=0, eng=0, math=0, total=0, rank=0;
		double avg=0;
		
		ArrayList<Students> list = new ArrayList<Students>();
//		List<Students> list = new ArrayList<Students>();
		
		// #1
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break; // 
			String[] arr = line.split(",");
			stuNo = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]); 
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));

		}// while
		
		// count
		Students.count = list.size()+1; // 삭제시 문제가 생김
		
		while(true) {
			// 학생입력부분 - 학번은 자동부여 : 이름, 국어, 영어, 수학
			System.out.println("이름을 입력하세요 (x 종료) >>");
			name = scan.next();
			
			// x 또는 X가 입력되면, 입력프로그램 종료
			if(name.equalsIgnoreCase("x")) {
				System.out.println("입력화면 종료합니다.");
				break;
			}
			
			System.out.println("국어점수를 입력하세요 >>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요 >>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요 >>");
			math = scan.nextInt();
			
//		Students s = new Students();
			list.add(new Students(name,kor,eng,math));
			
		}// 입력 while
		
		// list 2명 학생 성적을 추가해서, 저장하시오
		// 학생이름은 김유신, 홍길순
		// 파일에 저장
//		String str = "S0001,홍길동,100,100,100,300,100.0,0";
		
		String str = "";
		for(int i=0;i<list.size();i++) {
			Students s = list.get(i);
			str += String.format("%s,%s,%d,%d,%d,%d,%.2f,%d\r\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			
		}
		
		System.out.println(str);
		
		try {
			FileWriter fw = new FileWriter("c:/save/abc.txt",false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
			
		} catch(Exception e) {e.printStackTrace();}
		

//		// 출력 :번호, 이름, 합계, 평균, 등수
//		for(int i=0;i<list.size();i++) {
//			Students s = list.get(i);
//			System.out.printf("%s,%s,%d,%.2f,%d \n",list.get(i).getStuNo(),s.getName(),
//					s.getTotal(),s.getAvg(),s.getRank());
//		}
	
		// #2
//		try {
//			FileReader fr = new FileReader("c:/save/abc.txt");
//			BufferedReader br = new BufferedReader(fr);
//			while(true) {
//				String line = br.readLine();
//				if(line == null) break; // "S0001,홍길동,100,100,100,300,100.0,0"
//				String[] arr = line.split(",");
//				stuNo = arr[0];
//				name = arr[1];
//				kor = Integer.parseInt(arr[2]); 
//				eng = Integer.parseInt(arr[3]);
//				math = Integer.parseInt(arr[4]);
//				total = Integer.parseInt(arr[5]);
//				avg = Double.parseDouble(arr[6]);
//				rank = Integer.parseInt(arr[7]);
//				list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
//	
//			}// while
//			
//			// 출력 :번호, 이름, 합계, 평균, 등수
//			for(int i=0;i<list.size();i++) {
//				Students s = list.get(i);
//				System.out.printf("%s,%s,%d,%.2f%d",list.get(i).getStuNo(),s.getName(),
//						s.getTotal(),s.getAvg(),s.getRank());				
//			}
//	
//		} catch (Exception e) {e.printStackTrace();}

	}

}
