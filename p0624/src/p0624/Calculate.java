package p0624;

import java.util.Scanner;

public class Calculate {
	static Scanner scan = new Scanner(System.in);

	// 메서드 1개를 사용해서 처리하는 방법
	void change(int[] score) { 
		System.out.println("변경 국어점수를 입력하세요 >>");
		score[0] = scan.nextInt();
		
		System.out.println("변경 영어점수를 입력하세요 >>");
		score[1] = scan.nextInt();
		
		System.out.println("변경 수학점수를 입력하세요 >>");
		score[2] = scan.nextInt();
		
//		System.out.println("변경 후 국어점수 : "+kor);
//		System.out.println("변경 후 영어점수 : "+eng);
//		System.out.println("변경 후 수학점수 : "+math);

	}
	
	
//	void change(int kor, int eng, int math) {
//		System.out.println("변경 국어점수를 입력하세요 >>");
//		kor = scan.nextInt();
//		
//		System.out.println("변경 영어점수를 입력하세요 >>");
//		eng = scan.nextInt();
//		
//		System.out.println("변경 수학점수를 입력하세요 >>");
//		math = scan.nextInt();
		
//		System.out.println("변경 후 국어점수 : "+kor);
//		System.out.println("변경 후 영어점수 : "+eng);
//		System.out.println("변경 후 수학점수 : "+math);

//	}
	
	
//	int kor_change(int kor) {
//		System.out.println("변경 국어점수를 입력하세요 >>");
//		kor = scan.nextInt();	
//		System.out.println("");		
//		return kor;	
//	}
//	int eng_change(int eng) {
//		System.out.println("변경 영어점수를 입력하세요 >>");
//		eng = scan.nextInt();
//		System.out.println();
//
//		return eng;
//	}
//	int math_change(int math) {
//		System.out.println("변경 수학점수를 입력하세요 >>");
//		math = scan.nextInt();	
//		System.out.println();
//		
//		return math;
//	}
	
	
//	int result = 0;
//	// cal()
//	// return result;
//	int num;
//	int num2;
//	
//	void cal(int[] arr, String str) {
//		switch(str) {
//		case "+":
//			result = arr[0] + arr[1];
//			break;
//		case "-":
//			result = arr[0] - arr[1];
//			break;
//		case "*":
//			result = arr[0] * arr[1];
//			break;
//		case "/":
//			result = arr[0] / arr[1];
//			break;

//		}//switch
		
//	}
}// class
