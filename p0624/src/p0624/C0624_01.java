package p0624;

public class C0624_01 {

	public static void main(String[] args) {
		// 객체선언 후 참조변수명. 변수명
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x :"+d.x);
		
		change(d.x);
		System.out.println("After:"+d.x);
		System.out.println("d.x 2:"+d.x);

	}

	static void change(int x) { // 기본형 매개변수 - 값만 전달
		x =1000;
		System.out.println("change x : "+x);
	}
	
	static void change(Data d) { // 참조형 매개변수 - 주소값 전달
		d.x = 1000;
		System.out.println("change x : "+d.x);
	}
}

