package p0621;

public class C0621_13 {
	public static void main(String[] args) {
		int a = 0;
		float b = 1.0f;
		double c = 2.0;
		String str = "안녕하세요.";
		char ch = 'A';
		
		// 5개는 모두 모두 다른 메서드 : 타입이 다름
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch);
	}
	
	// 매개변수의 개수 또는 타입이 다르면 오버로딩 - 전혀 다른 메서드임
	int add(int a, int b) {return a+b;}
	long add(int a, long b) {
		return a+b;} // 오버로딩 : 타입을 다르게 설정
//	int add(int x, int y) {return a+b;} // 오버로딩 성립조건이 아님 -> error
	

}
