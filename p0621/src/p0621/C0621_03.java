package p0621;

import java.util.Scanner;

public class C0621_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 클래스를 외부에서 작성 -> 객체선언 후 사용가능
		Cal cal = new Cal();
		
		int result = cal.add(10,5); // 함수호출
		System.out.println(result);

		
//		C0621_03 c = new C0621_03();
//		// 참조변수명.메서드명
//		int result = c.add(10,5);
//		System.out.println(result);

	}// main
	
	// 메서드 선언
	// 리턴타입과 return 결과값은 타입이 같아야함. 
	int add(int a, int b) {
		int result = a+b; // 지역변수
		return result;
	}
		
	void add2(int a, int b) {
		System.out.println(a+b);
		// 리턴타입이 void이면, return이 필요없음
	}

}// class

