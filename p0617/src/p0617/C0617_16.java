package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 구구단 출력시 1,3,5,7,9단만
		for(int i=1;i<=9;i+=2) {	
			System.out.println(i+"단");
			for (int j=1;j<=9; j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);

			}
		}
		
		for (int i=2;i<=9;i++) {
			if (i%2==0) continue;
			System.out.println(i+"단");
			for (int j=1;j<=9;j++) {

				System.out.printf("%d *%d = %d \n",i,j,i*j);
			}
		}
		
		
		// 1~10까지의 합
//		int sum = 0;
//		int i = 0;
//		for(i=1; i<=10; i++) {
//			sum += i;	
//		}
//		System.out.println((i-1)+"까지의 합 : "+"total"+sum);
		
		
		//1~100까지 합을 구하는데, sum 값이 150을 넘었을 때 i값과 sum값을 출력하시오
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			sum += i;
//			if (sum>=150) {
//				System.out.println((i-1)+"일 때");
//				System.out.println(sum+"으로 최초로 150을 넘음");
//				break;
//			}
//		}
//		
//		int sum1 = 0;
//		int k = 0; // 타입 선언을 밖에서 해야 중괄호 끝난 후 출력가능
//		for(k=1; k<=100; k++) {
//			sum1 = sum1 + k;
//			if (sum1>=150) {
//				break;
//			}
//		}
//		System.out.println((k-1)+"일 때"); 
//		System.out.println(sum1+"으로 최초로 150을 넘음");
		
		
		
		// 구구단 출력
//		for (int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
////			System.out.println(i+"단");
//			for (int j=1;j<=9;j++) {
////			System.out.println(i+"*"+j+"="+i*j);
//				System.out.printf("%d *%d = %d \n",i,j,i*j);
////			System.out.printf("%d *%d = %d \t",i,j,i*j);
//				
//			}
//			System.out.println("-----------------");
//		}	
		
		
		// 10번 입력 받을 때마다 합계를 출력하시오

//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			System.out.println(i+"번째 숫자를 입력하시오");
//			int num = scan.nextInt();
//			sum += num;
//			
//			System.out.println(i+"번째 숫자"+num);
//			System.out.println(i+"번째 숫자를 더한 값"+sum);
//		}
//		System.out.println("total :"+sum);
		
		
		
		// 1~100까지 홀수만 더해서 최종값을 출력
//		int sum = 0;
//		for(int i=1;i<=100; i++) { 
////		for(int i=1;i<=100; i+=2)
//			if (i%2 == 1) {
//			sum += i;
//			System.out.println(i);
//			System.out.println(sum);
//			}
//		}
//		System.out.println("total :"+sum);
				
		
		// 1~100까지 더하기
//		int sum = 0;
//		for(int i=1;i<=100; i++) {
//			sum += i;
//			System.out.println(i);
//			System.out.println(sum);
//		}
//		System.out.println("total :"+sum);
//		
		
		// for문
//		int sum = 0;		
//		for(int i=1; i<=10; i++) {
//			sum = sum + i;
//			System.out.println("i :"+i);
//			System.out.println("sum :"+sum);
//		}
//		System.out.println("최종 sum :"+sum);
	}

}
