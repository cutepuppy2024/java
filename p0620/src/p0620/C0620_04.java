package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		// 변수선언
		Scanner scan = new Scanner(System.in);
		
		// 타입 변수명 = 0
		int a = 0;
		
		// 객체선언 : 반드시!		
		// 클래스타입 참조변수명 = new 클래스타입()
		Tv tv1; 		// 객체를 다루기 위한 참조변수가 선언됨
		tv1 = new Tv(); // 객체생성 후, 생성된 객체의 주소를 참조변수에 저장시켜줌.(공간이 형성됨)
		
		System.out.println("tv1의 주소값 : "+tv1); // 주소값이 출력됨 
		
		Tv t2 = new Tv();

		int[] num; // 배열을 다루기 위한 참조변수가 선언
		num = new int[5]; // 배열생성후, 생성된 배열의 주소를 참조변수에 저장
		
		System.out.println("num의 주소값 :"+num);
		
//		int num = 0;
//		String str = new String("aaa");
//		Tv.volume = 10; // class를 바로 사용할 수 없음
//		t1.color = "white";
//		t1.power = false;
//		t1.channel = 0;
		
		
//		String color = "white";
//		boolean power = false;
//		int channel = 0;
		// volume, size, inch....

		while(true) {
			System.out.println("1. TV 켜기 ");
			System.out.println("2. TV 끄기");
			System.out.println("========================");
			System.out.println("TV 상태를 선택하세요 >>");
			int choice = scan.nextInt();
			
		}//while
		
	}// main

}//class
