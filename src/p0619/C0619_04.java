package p0619;

import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		// Quiz : 5*5 배열을 생성해서 1,1,1,1,1, 나머지는 0으로 채워서 랜덤으로 섞어 출력하시오
		int[][] arr = new int[5][5];
		// 5*5 배열생성하여 5개는 1, 나머지는 0으로 채우기

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (i == 0){ 
					arr[i][j] = 1;
				}else {
					arr[i][j] = 0;
				}
			}
		}
		
		// 랜덤 섞기
		int no = 0;
		int no2 = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				no = (int)(Math.random()*5);
				no2 = (int)(Math.random()*5);
				temp = arr[0][0];
				arr[0][0] = arr[no][no2];
				arr[no][no2] = temp;
			}
		}
		
		// lotto 배열
		String[][] lotto = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				lotto[i][j] = "♥";
			}
		}
			

//		
//		// arr 출력
//		System.out.println("          [ arr좌표 ]");
//		System.out.println("   |\t0\t1\t2\t3\t4\t");
//		System.out.println("--------------------------------");
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(i+"  |\t");
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf("%s\t",arr[i][j]);
//			}
//			System.out.println();
//		}
		
		while(true) {
//			 lotto 출력
			System.out.println("          [ 좌표 ]");
			System.out.println("   |\t0\t1\t2\t3\t4\t");
			System.out.println("--------------------------------");
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(i+"  |\t");
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s\t",lotto[i][j]);
				}
				System.out.println();
			}
			
			// 좌표입력
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("x좌표를 입력하세요");
			int x = scan.nextInt();
			System.out.println("y좌표를 입력하세요");
			int y = scan.nextInt();
			
			
			// 좌표값 확인
//			if((x<0 || x>5) || (y<0 || y>5)) {
			if((0<=x && x<=4) || (0<=y && y<=4)) {
				System.out.println("잘못된 좌표입니다. 다시 입력하세요");
				System.out.println();
				continue;
			}

			// 입력받은 좌표값이 확인이 된 좌표인지 체크 - String
			if(lotto[x][y].equals("꽝") || lotto[x][y].equals("당첨")) {
				System.out.println("확인된 좌표입니다. 다시 입력하세요!");
				System.out.println();
				continue;
			}
			
			// arr 배열에서 x,y 좌표 값을 비교
			// 1이면 당첨, 0이면 꽝 출력
			
			if(arr[x][y] == 1) {
				lotto[x][y] = "당첨";
			}else {
				lotto[x][y] = "꽝";
			}
			
			
			
			
//			String[][] selected = new String[5][5];
//			int x_count = 0;
//			int y_count = 0;
//			int right = 0;
//			int count = 0;
//			for(int i=0;i<selected.length;i++) {
//				for(int j=0;j<selected[i].length;j++) {
//					if(arr[x][y] == 1) {
//						lotto[x][y] = "당첨";
//						right++;
//					}else {
//						lotto[x][y] = "꽝";
//					}
//					count++;
//					selected[x_count][y_count] = lotto[x][y];
//					if ((lotto[x][y] == "당첨") || (lotto[x][y] == "꽝")){
//						System.out.println("이미 선택된 번호입니다");
//					}else {
//						continue;
//					}
//					if (right == 5) {
//						System.out.println("5개 모두 당첨되었습니다.");
//						break;
//					}
//					if (count==10) {
//						System.out.println("10번의 기회를 모두 사용하였습니다.");
//					}
//				}
//			}
			
			
		}// while
	
	}// main
}
