package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_10 {

	public static void main(String[] args) {
		// 1~100까지의 랜덤숫자를 생성해서, 랜덤숫자를 맞추는 프로그램을 구현
		// 숫자를 입력해서 "큰수를 입력하세요"/"작은수를 입력하세요"
		// 10번까지만 입력가능하도록 구현
		// 랜덤숫자 :
		// 입력한 숫자 :
		// 의형태로 출력, 정답을 맞추면 프로그램 종료

		Scanner scan = new Scanner(System.in);
		int r_num= (int)(Math.random()*100)+1; // 1~100까지의 랜덤숫자
		System.out.println("랜덤번호 : "+r_num);
		
		int[] input = new int[10];
		int count = 0;
		int num = 0;
		while(count<10) {
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			
			if(num<1 || num>100) { // 유효값 확인
				System.out.println("1-100까지의 숫자를 입력하셔야 합니다. 다시 입력하세요");
				continue;
			}
			input[count] = num; //입력한 번호 저장 
			count++;
			if(num>r_num) {
				System.out.println("입력한 숫자보다 작은수를 입력하세요");
			}else if(num<r_num) {
				System.out.println("입력한 숫자보다 큰수를 입력하세요");
			}else {
				System.out.println("정답입니다.");
				break;
			}

		} // while

		System.out.println("입력번호 : ");
		for(int j=0;j<count;j++) {
			System.out.print(input[j]+" ");
		}
		System.out.println();
		
		// 정답이 없을 때 가장 근사치의 값을 출력
		// r_num : 45 , num : 1,2,3,4,5,6,10

		
		int arr_no = 0; //저장위치
		int temp = 0;   //저장값
		
		if(count==10) {
			int[] no = new int[10]; //배열생성
			for(int i=0;i<10;i++) { // 랜덤값 입력한 값을 뺄셈을 해줌.
				no[i] = Math.abs(r_num - input[i]);
			}
			
			arr_no = 0;
			temp = no[0];
			for(int i = 1; i<10;i++) {
				if(temp>=no[i]) {
					arr_no = i;
					temp = no[i];
				}
			}
			
			System.out.println("근사치 값 1개 : "+input[arr_no]);
			
			
			System.out.print("근사치 값 : ");
			for(int i=0;i<10;i++) {
				System.out.print(no[i]+" ");
			}
			System.out.println();
		}
//		int min = Integer.MIN_VALUE;
//		for(int q:result) {
//			min = Math.min(min,q);
//		}
//		
//		System.out.println(min);
		

		
//		System.out.println("랜덤숫자 :"+r_num);
//		
//		int[] myNum = new int[10];
//		int count = 0;
//		System.out.println("입력한 숫자 :");
//		for(int i=0;i<10;i++) {
//			myNum[i] = scan.nextInt();
//			System.out.println(myNum[i]+" ");
//			count++;
//			if(myNum[i]>r_num) {
//				System.out.println("큰수를 입력하세요");
//			}else if(myNum[i]<r_num) {
//				System.out.println("작은수를 입력하세요");
//			}else {
//				System.out.println("정답입니다");
//				break;
//			}
//		}//for
//
//		System.out.println(count+"번 만에 맞추셨습니다");
	

	}

}
