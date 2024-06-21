package p0621;

public class C0621_11 {

	int a = 0; // 인스턴스변수 
	static int b = 0; // 클래스변수 : static
	
	// 클래스 메서드 : static - 클래스변수만 사용가능
	public static void main(String[] args) { 
		// 인스턴수 변수는 사용이 안됨
//		a = 0;  // 사용불가 - 인스턴스 변수
		b = 10; // 사용가능 - 클래스변수
		int c = 300; // 사용가능 - 지역변수
	}

	// 인스턴스 메서드- 인스턴스변수, 클래스변수 모두 사용가능
	void add() {
		a = 100; // 인스턴스 변수 사용가능
		b = 200; // 클래스 변수 사용가능
		int c = 0; // 지역 변수 사용가능
	}
}
