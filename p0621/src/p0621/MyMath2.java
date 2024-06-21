package p0621;

public class MyMath2 {
	long a,b; // 인스턴스변수
	
	long add() {
		return a+b; // 인스턴스메서드
	}
	static long add(long a, long b) { // 클래스메서드
		return a+b;
	}
}
