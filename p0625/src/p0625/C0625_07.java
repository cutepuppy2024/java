package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		c2 = a; // 업캐스팅
//		f2 = (FireEngine)c2; error
		
		
		// 다형성 : 부모의 참조변수로 자손의 객체를 다루는 것 
		// 자손의 참조변수로 조상의 객체를 다루는 것(X)
		// 자손참조변수 = 조상의 객체
		a2 = (Ambulance) c;
		
		c = a; // 부모의 참조변수에 자손객체를 넣어줌
		if ( c instanceof Ambulance) {
			System.out.println("가능합니다.");
			c = a;
		}
		
		if ( a instanceof Ambulance) {
			System.out.println("가능합니다.");
			c = a;
		}
		a2 = (Ambulance) c;
		
		// 형변환 - 자손타입에서 조상타입 : 형변환타입생략가능
//		c2 = (Car)a;
//		a.siren();
//		c2 = a; // Ambulance -> Car
//		c2.drive();
////		c2.siren(); // 부모의 참조변수로는 사용할 수 없음
//		
//		a2 = (Ambulance)c2; // Car 에서는 타입을 정해야 함.
//		a2.siren();

	}

}
