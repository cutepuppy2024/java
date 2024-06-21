package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계산할 2개의 숫자를 입력하세요");
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		// 입력한 두 수의 더하기, 빼기, 곱하기, 나누기 계산결과값을 출력하시오
		Cal2 c = new Cal2();
		int r1 = c.plus(num,num2);
		int r2 = c.minus(num,num2);
		int r3 = c.multi(num,num2);
		int r4 = c.divide(num,num2);
		
		System.out.printf("입력한 두 수 : %d,%d / 결과값 : %d,%d,%d,%d", num,num2,r1,r2,r3,r4);

	}

}
