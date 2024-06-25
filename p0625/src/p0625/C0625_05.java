package p0625;

public class C0625_05 {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(12); // 메서드만 접근가능 : 캡슐화
		
		System.out.println("현재시간 : "+t.getHour()+"시");
	}

}

//		t.day = 50;
//		System.out.println("현재날짜 : "+t.day+"일");