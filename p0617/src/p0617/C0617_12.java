package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력받아, 90점 이상 A, 80점 이상 B,C,D,F 를 출력할 수 있게 구현
//		// 90~92점 A-, 97~100점 A+, 80~82점 B-, ....
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하시오");
//		double score = scan.nextDouble();
//		
//		if (score>=90) {
//			if (score>=90 && score<=92) {
//				System.out.println("A-");
//			}else if (score>=97) {
//				System.out.println("A+");
//			}else {
//				System.out.println("A");
//			}
//		}else if(score>=80) {
//			if (score>=80 && score<=82) {
//				System.out.println("B-");
//			}else if (score>=87) {
//				System.out.println("B+");
//			}else {
//				System.out.println("B");
//			}
//		}else if(score>=70) {
//			if (score>=70 && score<=72) {
//				System.out.println("C-");
//			}else if (score>=77) {
//				System.out.println("C+");
//			}else {
//				System.out.println("C");
//			}
//		}else if(score>=60) {
//			if (score>=60 && score<=62) {
//				System.out.println("D-");
//			}else if (score>=67) {
//				System.out.println("D+");
//			}else {
//				System.out.println("D");
//			}
//		}else {
//			System.out.println("F");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오");

		int num = scan.nextInt();
		String score = "";
		
		if(num>=90) {
			score = "A";
			if(num>=97) score = score+"+";
			else if(num<=92) score = score+"-";
		}else if(num>=80) {
			score = "B";
			if(num>=87) score = score+"+";
			else if(num<=82) score = score+"-";
		}else if(num>=70) {
			score = "C";
			if(num>=77) score = score+"+";
			else if(num<=72) score = score+"-";
		} else if(num>=60) {
			score = "D";
			if(num>=67) score = score+"+";
			else if(num<=62) score = score+"-";
		}
			
		System.out.println(score);
	}

}
