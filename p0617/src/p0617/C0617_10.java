package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		// 숫자를 입력받아, 60점 이상이면 합격, 60점 미만이면 불합격을 출력
		// 90점 이상 
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int score = scan.nextInt();
		if (score>=90) {
			System.out.println("A");
		}else if (score>=80) {
			System.out.println("B");
		}else if (score>=70) {
			System.out.println("C");
		}else if (score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		String result = score>=90? "A": (score>=80?"B": (score>=70?"C": (score>=60?"D":"F")));
		System.out.println(result);
		
		// 숫자를 입력받아, 60점 이상이면 합격, 60점 미만이면 불합격을 출력
//		System.out.println("숫자를 입력하시오"); 
//		int score = scan.nextInt();
//		if (score>=60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//
//		String result = score>=60? "합격":"불합격";
//		System.out.println(result);
	}

}
