package p0618;

import java.util.Scanner;

public class 로또연습 {
	public static void main(String[] args) {
		// 배열생성
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		
		// 1~45까지의 lotto 숫자
		for(int i=0;i<45;i++) {
			lotto[i] = i+1;
		}
		// 랜덤섞기
		int no = 0;
		int temp = 0;
		for(int p=0;p<300;p++) {
			no = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[no];
			lotto[no] = temp;
		}
		
		// 로또6개의 숫자 출력
		System.out.print("로또번호 : ");
		for(int q=0;q<6;q++) {
			System.out.print(lotto[q]+" ");
		}
		
		// 내 숫자 선택
		Scanner scan = new Scanner(System.in);
		System.out.println("1~45까지의 숫자 6개를 선택하세요");
		for(int j=0; j<6;j++) {
			System.out.println(j+"번째 숫자 :");
			myNum[j] = scan.nextInt();
		}
		
		// 내 숫자 출력
		System.out.print("내가 선택한 숫자 : ");
		for(int r=0; r<6; r++) {
			System.out.print(r+"번째 숫자 :");
		}
		// 숫자 확인
		int count = 0;
		int[] matched = new int[6];
		for(int m=0;m<6;m++) {
			for(int n=0; n<6; n++) {
				if (lotto[m]==myNum[n]);
				 matched[count] = myNum[n];
			}
		}
		// 당첨번호 출력
		System.out.print(" :");
		for(int x=0;x<count;x++) {
			System.out.print(matched[x]);
		}
		
		
	}
}
