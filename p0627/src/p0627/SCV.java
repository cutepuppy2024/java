package p0627;

public class SCV extends GroundUnit{

	SCV() {
		super(50);
		hitPoint = MAX_HP;
	}
	void repair(Tank u) {
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint += 5;
		}
	}
	void repair(Marine u) {
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint += 5;
		}
	}
	void repair(DropShip u) {
		while(u.hitPoint != u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint += 5;
		}
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u =(Unit) r;
			while(u.hitPoint != u.MAX_HP) {
				System.out.println("에너지를 5씩 증가합니다.");
				u.hitPoint += 5;
			}
		}
		
	}

}
