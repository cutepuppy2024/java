package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열에 입력
		int[] score = new int[5];
		for(int i=0; i<5;i++) {
			System.out.println("숫자를 입력하세요 >>");
			score[i] = scan.nextInt();
		}
		
		// 배열에 출력
		System.out.println(score); // 전체에 대한 주소값이 출력
		System.out.println(Arrays.toString(score)); // 배열의 모든 데이터 확인 메서드
		System.out.println(score[3]);
		
		for(int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
		
//		int score[] = new int[5]; // 두가지 모두 가능
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		

		
		// 5개의 숫자를 입력받은 후 3번째 숫자만 출력
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		
//		int n = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//
//		System.out.println(n3);
//		
//		int[] n = new int[5];
		

	}

}
