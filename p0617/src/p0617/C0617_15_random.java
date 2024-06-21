package p0617;

import java.util.Scanner;

public class C0617_15_random {

	public static void main(String[] args) {
		// 1부터 10까지 랜덤숫자를 생성해서
		// 숫자 1개를 입력받아 정답인지 아닌지 출력
		// 같으면 당첨, 다르면 꽝
		int n = (int)(Math.random()*10)+1;
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		if (n==num) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
			
		
		// 1부터 100까지의 숫자를 랜덤으로 생성해서 출력
//		int n = (int)(Math.random()*100)+1;
//		System.out.println(n);
//		
//		// 1부터 3까지 랜덤숫자
//		int n1 = (int)(Math.random()*3)+1;
//		System.out.println(n1);
//		
//		// 1부터 45까지
//		int n2 = (int)(Math.random()*45)+1;
//		System.out.println(n2);
		
		
//		Math.random(); // 0~0.99999999999 / 0.0 <=x && x<1 식과 같음, 0<=x<1 이 표현을 쓸 수 없음 
//		Math.round(0); // -> int
//		Math.max(10.5,5); 

//		System.out.println(Math.random()); // 15자리까지 - double
//		// 0~9까지의 랜덤숫자를 출력
//		int n = (int)(Math.random()*10);
//		System.out.println(n);	
//		//0~10까지의 랜덤숫자를 출력
//		int n1 = (int)(Math.random()*11);
//		System.out.println(n1);	
//		// 1~10까지 랜덤숫자를 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		// 2~10까지
//		int num_1 = (int)(Math.random()*9)+2;
//		System.out.println(num_1);
//		// 1~100까지의 랜덤숫자를 출력
//		int num1 = (int)(Math.random()*100)+1;
//		System.out.println(num1);
//		// 0~4까지의 랜덤숫자를 출력
////		int num2 = (int)(Math.random()*10)/2;
//		int num2 = (int)(Math.random()*5);
//		System.out.println(num2);
//		// 0~19까지 의 랜덤숫자를 출력
//		int num3 = (int)(Math.random()*20);
//		System.out.println(num3);

	}

}
