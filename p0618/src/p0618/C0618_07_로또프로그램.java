package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07_로또프로그램 {

	public static void main(String[] args) {
		// 45개짜리의 ball 배열을 생성, 1-45까지 숫자를 입력하고
		// 6개짜리 myArr배열을 만들어서 1~45까지 6개의 숫자를 입력받아 출력하시오
		
		// 1. 45개 배열을 생성
		int[] ball = new int[45];
		int[] myArr = new int[6];
		int[] myLotto = new int[6]; 
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		// 2. 랜덤으로섞기
		int no = 0; // 랜덤번호
		int t_value = 0; // 값을 저장하는 가상의 공간
		
		for(int i=0; i<300; i++){
			no = (int)(Math.random()*45); // 0-44번째의 수를 랜덤으로 리턴
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		
		// 4. 로또번호 출력
		System.out.printf("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
			
		// 3. my로또번호 입력

		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int n = 0;
		while(n<6) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45까지)",n+1);
			num = scan.nextInt();
			if(num<1 || num>45) {
				System.out.println("1~45까지의 숫자만 입력하셔야 합니다. 다시 입력해 주세요");
				continue;
			}
			myArr[n] = num;
			n++;
//			for(int i=0; i<myArr.length; i++) {
//			System.out.println("1-45까지의 숫자를 입력하세요");
		}
		
		System.out.print("입력한 숫자 :");
		for(int i=0; i<myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
//		System.out.println(Arrays.toString(myArr));
		

		
		// 5. 로또번호와 일치하는 번호 - myArr, ball
		int count = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(myArr[i]==ball[j]) {
					myLotto[count] = myArr[i];
					count++;
					break;
				}
			}
		}
		
		System.out.println("로또 당첨개수 :"+count);
		
		// 당첨된 번호가 출력되도록
		System.out.print("로또당첨된 번호 :");
		for (int i=0;i<count;i++) {
			System.out.print(myLotto[i]+" ");
				
			}	
		// 당첨된 번호가 없을 때
		if(count==0) System.out.println("없음");

		// 당첨금액 : 6개- 100억, 5개-1억, 4개-1백만원, 3개-1만원
		System.out.print("당첨금액 :");
		switch(count) {
		case (3):
			System.out.println("1만원");
			break;
		case (4):
			System.out.println("1백만원");
			break;
		case (5):
			System.out.println("1억원");
			break;
		case (6):
			System.out.println("100억원");
			break;
		default:
			System.out.println("없음");
			break;
		}
	
		
//		System.out.println(Arrays.toString(ball));
		
		// 10개짜리 배열을 생성하고 숫자를 입력받아,3,4번째 숫자만 출력
//		Scanner scan = new Scanner(System.in);
//		int[] num = new int[10];
//		
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("숫자를 입력하세요");
//			num[i] = scan.nextInt();
//			
////			int input = scan.nextInt();
////			num[i] = input;
//		}
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.printf("%d, %d \n",num[2],num[3]);
	}// main
}
