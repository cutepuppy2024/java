package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		// 로또번호 생성
		// 1~45 -> 6개 뽑아야 함
		// 로또 배열생성
		int[] lotto = new int[45];
		for(int i=1;i<45;i++) {
			lotto[i] = i+1;
		}
		
		// 랜덤섞기
		int no = 0;
		int temp = 0;
		for(int i=0;i<500;i++) {
			no = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[no];
			lotto[no] = temp;
		}
		
		// 내 번호 입력
		int[] myLotto = new int[6];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1~45사이의 숫자를 6개 입력하세요");
		
		for (int i=0;i<6;i++) {
			System.out.print(i+1+"번째 숫자 :");
			myLotto[i] = scan.nextInt();	
		}
		// 내번호 출력
		System.out.print("내가 선택한 번호: ");
		for(int i=0;i<6;i++) {
			System.out.print(myLotto[i]+" ");
		}
		
		// 로또번호
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}

	}

}
