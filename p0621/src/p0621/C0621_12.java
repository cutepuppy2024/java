package p0621;

public class C0621_12 {

	public static void main(String[] args) {
		// 클래스메서드를 호출하여 출력
		System.out.println(MyMath2.add(200L,100L));
		
		// 메서드 오버로딩 : 동일한 이름의 메서드를 사용하는 것
		int a = 0;
//		int a = 0; // 동일한 인스턴스변수 사용할 수 없음
		
		// 오버로딩의 조건 : 메서드 이름이 같다-> 매개변수의 개수 or 타입이 달라야 함
		// 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않음
		
		// 객체선언 후 인스턴스변수 -> 인스턴스메서드 호출하여 출력
		MyMath2 mm = new MyMath2();
		mm.a = 10;
		mm.b = 20;
		System.out.println(mm.add());

	}

}
