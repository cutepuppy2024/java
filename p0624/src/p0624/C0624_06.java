package p0624;

import java.util.Scanner;

public class C0624_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 99;
		score[2] = 90;
		
		int kor = 100;
		int eng = 99;
		int math = 90;
//		System.out.println("현재 국어점수 "+kor);
		
		// 메서드 사용
		Calculate c = new Calculate(); // 객체선언
		c.change(score);
		
		System.out.println("변경 후 국어점수 : "+score[0] );
		System.out.println("변경 후 영어점수 : "+score[1] );
		System.out.println("변경 후 수학점수 : "+score[2] );
		
		
//		c.change(kor,eng,math);
//		kor = c.kor_change(kor);
//		eng = c.eng_change(eng);
//		math = c.math_change(math);
//		
//		System.out.println("변경 후 국어점수 : "+kor);
//		System.out.println("변경 후 영어점수 : "+eng);
//		System.out.println("변경 후 수학점수 : "+math);
		

	}

}
