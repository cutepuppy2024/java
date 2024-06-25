package p0625;

import java.util.*; // 클래스명의 위치값에서 *가능
//import java.util.Date;
//import java.util.Scanner;

public class C0625_03 {

	public static void main(String[] args) { //접근제어자 그외제어자
		Date d = new Date(); // 클래스패스명(패키지명) -> import하면 작성하지 않아도 됨	
//		java.sql.Date dd = new java.sql.Date(); // 패키지가 다르면 둘 중 하나는 import 하는 대신 풀네임을 기재해 주어야 함
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("안녕"); // import : java.lang 패키지-> 생략가능

	}

}
