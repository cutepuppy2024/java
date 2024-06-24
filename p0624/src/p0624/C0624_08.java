package p0624;

public class C0624_08 {

	public static void main(String[] args) {	

//		Stu_score stu; // 공간만, 값이 들어갈 수 없음
//		stu.kor = 100;
		
		Stu_score s = new Stu_score();
//		Stu_score s = new Stu_score("S0001","홍길동",100,99,90);
		System.out.println("합계 : "+s.total);
		System.out.println("평균 : "+s.avg);
		Stu_score s2 = new Stu_score();
		s.kor = 100;
		
		System.out.println("s.kor : "+s.kor);
		
		
		// 5 팩토리얼 5*4*3*2*1
		int result = 1;
		for(int i=5;i>0;i--) {
			result *= i;
		}
		// change();
		C0624_08 c = new C0624_08();
		c.change();
		
		System.out.println(result);
		add(); // 같은 클래스 내에서는 클래스명(C0624_08) 생략가능
	}// main
	
	void change() { // 인스턴스 메서드 - 객체선언 후, 참조변수명.메서드명
		System.out.println(0);
	}
	void change(int a) { // 메서드 오버로딩
		System.out.println(a);
	}
	
	void change(int a, int b) {
		System.out.println(a+b);
	}
	
	static void add() { // 클래스메서드 - 객체선언없이 클래스명.메서드명
		
	}

}// class
