package p0617;

import java.util.Scanner;

public class C0617_03 {

	public static void main(String[] args) {
//		java.util.Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
//		input("데이터를 입력하세요");
		System.out.println("데이터를 입력하세요");
		String input = scan.next();
		System.out.printf("입력한 데이터 : %s", input);
//		System.out.println("입력한 데이터 : %s", input); error
		System.out.println(input); 
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		System.out.printf("입력한 데이터 : %s, 입력한 숫자 : %d \n", input, num);
		System.out.printf("입력한 데이터 : %s"+input, "입력한 숫자 : %d \n",+num);

		

	}

}
