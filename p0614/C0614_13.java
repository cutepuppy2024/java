package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
		
		// 입력한 숫자를 소수점 2자리 절사하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		double a = scan.nextDouble();
//		double r_a = (int)(a*100)/100d;  // 절사 floor()
//		double r_a = Math.round(a*1000)/1000d; // 반올림 round()
//		double r_a = Math.ceil(a*1000)/1000d; // 올림 ceil()
		double r_a = Math.floor(a*1000)/1000d; // 버림 floor()
		System.out.println(r_a);
		
		
//		float pi = 3.141592f;
//		float shortPi = (int)(pi*1000)/1000f;
//		System.out.println(shortPi);

	}

}
