package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01 {

	public static void main(String[] args) {
		// lotto, 학생성적프로그램
		Scanner scan = new Scanner(System.in);
		
		String[] score = new String[45];
		for(int i=0;i<score.length;i++) {
			score[i] = i+1+""; // 타입변경
		}
		
//		System.out.println(Arrays.toString(score));
		
		String[][] arr = new String[5][5];
		// 1-25까지의 숫자를 넣고 배열을 섞고, for문으로 출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = 5*i+(j+1)+"";
			}
		}
		// 랜덤섞기
		int no = 0;
		int no2 = 0;
		String temp = "0";
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				no = (int)(Math.random()*5);
				no2 = (int)(Math.random()*5);
				temp = arr[0][0];
				arr[0][0] = arr[no][no2];
				arr[no][no2] = temp;
			}
		}
	
		// 2차원배열 출력
		int count = 0;
		while(true) {
			System.out.println(" [ 2차원 배열 출력 ] ");
			System.out.println("-----------------------------");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
			if(count==25) {
				System.out.println("25번의 X표시가 완료되었습니다.");
				System.out.println(" [ 프로그램 종료 ] ");
				break;
			}
			System.out.println("1-25까지의 숫자를 입력하세요 >>");
			int input = scan.nextInt();
			
			// 입력한 숫자가 1-25를 벗어나면 잘못입력했습니다. 다시 입력하세요 출력
			if(input<0 || input>25 ) {
				System.out.println("잘못입력했습니다. 다시 입력하세요");
				continue;
			}
			
			// 1-25까지의 숫자를 넣으면 X표시가 나타나도록 구현
			String input_str = input+"";
			int tem = 0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j].equals(input_str)) {
						arr[i][j] = "X";
						tem = 1;
						count++;
					}
				}
			}

			if(tem==0) {
				System.out.printf("%s 번은 입력된 숫자입니다. 다시 입력하세요", input_str);
				System.out.println();
			}
			


			System.out.printf("입력한 숫자 :",input_str);
			System.out.println();

		
		}//while	
				
	}//main

}
