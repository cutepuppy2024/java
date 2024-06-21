package p0621;

public class C0621_08 {

	public static void main(String[] args) {
		Data d = new Data();// 객체선언 d:참조형변수
		d.x = 10;
		System.out.println("d.x :"+d.x);
		System.out.println("--------------------------");
		
//		C0621_07 c = new C0621_07();
//		c.change(d.x);
		
		change(d); // d:참조형변수

		System.out.println("change 호출후 d.x :"+d.x);
		
		for(int i=0;i<5;i++) {
			
		}
		for(int i=0;i<5;i++) {
			
		}
	}
	static void change(Data d2) { // 참조형변수는 주소값을 가지므로 주소값이 들어온것
		d2.x = 1000;
		System.out.println("change x : "+d2.x);
	}

}
