package p0627;

public class C0327_01 extends Object {

	public static void main(String[] args) {
//		Unit u = new Unit(); //  객체선언 불가
		Marine m = new Marine(); // 객체선언 가능
		System.out.println("현재체력 :"+m.hitPoint);
		Tank t = new Tank();
		System.out.println("현재체력 :"+t.hitPoint);
		DropShip d = new DropShip();
		System.out.println("현재체력 :"+d.hitPoint);
		
		System.out.println("----------------------------");
		System.out.println("탱크가 포탄을 맞았습니다.");
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
//		t.hitPoint -= 10;
//		t.hitPoint -= 10;
//		t.hitPoint -= 10;
		System.out.println("현재체력 :"+t.hitPoint);
		hpDown(d);
		hpDown(d);
		System.out.println("현재체력 :"+d.hitPoint);
//		d.hitPoint -= 10;
		hpDown(m);
		hpDown(m);
		hpDown(m);
		System.out.println("현재체력 :"+m.hitPoint);
		
		
		// SCV는 기계를 수리할 수 있는 능력
		System.out.println("탱크 수리를 요청합니다.");
		SCV s = new SCV(); // scv 1대
		s.repair(t);
		System.out.println("현재체력 :"+t.hitPoint);
		
		System.out.println("마린을 수리 요청합니다.");
//		s.repair(m); // 
		System.out.println("현재체력 :"+m.hitPoint);
		
		System.out.println("수송선을 수리 요청합니다.");
		s.repair(d);
		System.out.println("현재체력 :"+d.hitPoint);
		
		
		
		
	}
	
	static void hpDown(Unit u) {
		u.hitPoint -= 10;
	}
	
//	int add(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	Marine move(int x, int y) {
//		Marine m = new Marine();
//		return m;
//	}
//	
//	Unit start(int x, int y) {
//		Marine m = new Marine();
//		return m;
//	}

}
