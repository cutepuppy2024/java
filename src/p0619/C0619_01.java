package p0619;

import java.util.Scanner;

public class C0619_01 {

	public static void main(String[] args) {
		// 로또 프로그램 구현순서
		// 1~45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또번호
		// 입력한 입력번호 6개
		// 당첨번호 개수배열, 카운트변수
		// 모든 배열을 출력
		Scanner scan = new Scanner(System.in);
		
		
		// 1) ball 배열 : 1~45까지 번호 입력
		int[] ball = new int[45];
//		System.out.println(ball);
//		ball[0] = 1;
//		System.out.println(ball[0]);
		for(int i =0;i<45;i++) {
			ball[i] = i+1;
		}

		// 2. ball 배열 섞기
		int no = 0; 		// 0번째 배열과 바꿀 배열번호
		int t_value = 0; 	// 임시적으로 저장하는 공간
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*45); //0~44까지의 번호가 랜덤으로 선택됨
			t_value = ball[0];	// 임의의 공간에 0번째 값 이동
			ball[0] = ball[no]; // 랜덤값을 0번째 방으로 이동
			ball[no] = t_value; // 비어있는 랜덤공간에 임의의 공간에 있던 (0번째) 값이 이동	
		}
		
		// 3. my_ball 입력
		// 6개의 로또번호 입력
		int[] my_ball = new int[6];
		for(int i=0;i<6; i++) {
			System.out.printf("%d번째 로또번호를 입력하세요 :",i+1);
			my_ball[i] = scan.nextInt();
		}
		
		System.out.println(" [ 로또번호 현황 ]");
		System.out.println("--------------------------");
		
		//  4. my_ball 6개 출력
		System.out.print("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%4d",my_ball[i]); // 공간을 줌
		}
		System.out.println();
		
		
		// 5. ball 배열 출력
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%4d",ball[i]);
		}
		System.out.println();
		
		// 6. 당첨개수
		int[] matched = new int[6];
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(ball[i] == my_ball[j]) {
					matched[count] = my_ball[j];
					count++;
					break;
				}

			}
		}
			
		System.out.printf("당첨된 개수 : %d 개 \n",count);
		
		// 7. 당첨번호 출력

		System.out.print("당첨된 번호 : ");
		for(int i=0;i<count;i++) {
			System.out.printf("%4d",matched[i]);
		}
		if(count==0) {
			System.out.println("없음");
		}
		System.out.println();
		

		
		
		// 2차원에서의 입출력 방법
//		int[][] arr =  new int[5][5];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length; j++) {
//				arr[i][j] = 5*i+(j+1);
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}

	}//main
}
