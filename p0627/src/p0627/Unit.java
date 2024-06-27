package p0627;

abstract public class Unit {
	
	int hitPoint; 	  // 현재체력
	final int MAX_HP; // 최대체력
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
	int x,y;
//	abstract void move(int x, int y);// 추상메서드 : class명에도 기재되어 있어야 함., 메서드를 구현: {}
	void stop() {
		
	}

}
