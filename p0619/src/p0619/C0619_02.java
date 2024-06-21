package p0619;

import java.util.Arrays;

public class C0619_02 {

	public static void main(String[] args) {
		// 1~45까지 로또 번호를 생성해서, 랜덤으로 섞은 후, 출력하시오
		
//		int[][] arr = new int[5][5];
//		// 1~25 번호를 넣고, 랜덤으로 섞은 후
//		// [5,5] 형태로 출력
//		
//		// 2차원 배열내에서 랜덤섞기
//		// 2차원배열
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				arr[i][j] = 5*i+(j+1);
//			}
//		}
//		// 출력
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				System.out.println(arr[i][j] +"\t");
//			}
//		}System.out.println();
//		
//		int no = 0;
//		int no2 = 0;
//		int t_value = 0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				no = (int)(Math.random()*5);
//				no2 = (int)(Math.random()*5);
//				t_value = arr[0][0];
//				arr[0][0] = arr[no][no2];
//				arr[no][no2] = t_value;
//			}
//		}
//		
//		// 출력
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.println(arr[i][j] +"\t");
//			}
		
		
		
//		int[][] arr = new int[5][5];
//		// 1~25 번호를 넣고, 랜덤으로 섞은 후
//		// [5,5] 형태로 출력
//
//		// 임시배열 생성
//		int[] temp = new int[25];
//		// 25까지의 숫자 넣기
//		for(int i=0;i<25;i++) {
//			temp[i] = i+1;
//		}
////		System.out.println(Arrays.toString(temp));
//		
//		// 랜덤섞기
//		int no = 0;
//		int t_value = 0;
//		for(int i=0; i<25; i++) {
//			no = (int)(Math.random()*25);
//			t_value = temp[0];
//			temp[0] = temp[no];
//			temp[no] = t_value;
//		}
////		System.out.println(Arrays.toString(temp));
//		
//		// 5*5배열에 숫자 넣기
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				arr[i][j] = temp[5*i+j];
//			}
//		}
//
//		// 5*5 형태로 출력
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
//		// 1. 배열생성
//		int[] lotto = new int[25];
//		for(int i=0;i<25;i++) {
//			lotto[i] = i+1;
//		}
//		// 2. 랜덤섞기
//		int no = 0;
//		int temp = 0;
//		for(int i=0;i<300;i++) {
//			no = (int)(Math.random()*25);
//			temp = lotto[0];
//			lotto[0] = lotto[no];
//			lotto[no] = temp;
//		}
//		
//		// 3. 출력
//		System.out.print("로또배열 생성 :");
//		for(int i=0;i<lotto.length;i++) {
//			System.out.print(lotto[i]+" ");
//		}

	}

}
