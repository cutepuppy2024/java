package p0619;

import java.util.Arrays;

public class C0619_03_array복사 {

	public static void main(String[] args) {
		int[] score = {1,2,3,4,5};
		System.out.println(score); // 주소값
		
		int[] score2 = score; // 얕은복사 : 주소값을 가리키게됨
		
		// 그렇다면 복사하는 방법은? 
		// 1) 새롭게 공간을 만들어 값을 넣어준다
		int[] score3 = new int[score.length];
		for(int i=0;i<score3.length;i++) {
			score3[i] = score[i];
		}
		
		// 2) arraycopy 메서드 사용
		int[] score4 = new int[5];
		System.arraycopy(score3,  0, score4, 0, score.length);
		System.out.println(Arrays.toString(score4));
		
		// score 배열 값을 변경
//		score[4] = 0;
//		System.out.println(Arrays.toString(score));
//		System.out.println(Arrays.toString(score2));
//		

		
		// 변수를 복사했을 때, 기존의 값이 변경이 된다고 해서 복사한 값이 변경되지 않음.
//		int num = 10;
//		int num2 = num;  // num, num2는 서로 다른 저장소에 값 저장
//		num = 5;
//		System.out.println(num);
//		System.out.println(num2);

	}

}
