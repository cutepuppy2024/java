package p0614;

import java.util.Scanner;

public class C0614_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 >>");
		int input = scan.nextInt();

		if (input >=0) {
			System.out.println("양수");
		}else{
			System.out.println("음수");
		}
//		int a = 10;
//		if (a>0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}	
//		if (a==10) {
//			System.out.println("10과 같다");
//		}else {
//			System.out.println("10과 같지 않다");
//		}

	}//main

}//system
