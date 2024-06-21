package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		// 논리형 
		boolean bol = true;
		boolean bol2 = false;
		
		// 문자형
		char ch1 = 'a';
//		char ch2 = 'xx'; // error : char 는 문자1개만 저장
		char ch3 = ' '; // 공백 불가, 사이공간 가능

		
		// 정수형 - byte, short, int(default), long(:L 접미사 붙여야 함)
//		byte a = 128; // byte 127까지 입력가능 
		short b = 2;
//		int c = 2147483647; 2147483647까지 입력가능
		long d = 2147483648L; 
		
		// 실수형 - float(:F 접미사 붙여야 함), double(default: D를 생략가능/붙여도 됨)
		float e = 3.14F;
		double f = 3.14;
		
		//정수형 - byte, short, int, long 타입
//		int num = 10;
//		System.out.println(num);
		//print(num);

	}//main

}//class
