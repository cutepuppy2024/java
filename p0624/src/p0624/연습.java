package p0624;

import java.util.Scanner;

public class 연습 {
	// 인스턴스 메서드
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	
	int add2(int[] num) {
		int sum = 0;
		for(int i=0; i<num.length;i++) {
			sum += num[i];
		}
		return sum;
	}
}
