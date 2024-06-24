package p0624;

public class C0624_09 {

	public static void main(String[] args) {
		
		// 객체선언 후, white, auto, 4
		Car c1 = new Car(); // 객체
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c = new Car("white","auto",4);
		
		System.out.println("c.color : "+c.color);
		System.out.println("c.color : "+c.color);
		
		// 객체선언 후, red, auto, 5
		Car c2 = new Car(); // 객체
		c1.color = "red";
		c1.gearType = "auto";
		c1.door = 5;
		
		Car cc = new Car("red","auto",5);
		
		// 객체선언 후, blue, auto, 3
		Car c3 = new Car(); // 객체
		c1.color = "blue";
		c1.gearType = "auto";
		c1.door = 3;
		
		Car ccc = new Car("blue","auto",3);
		

		
		
		
//		Data d = new Data();
//		Data2 d2 = new Data2(); //error : 기본생성자가 없으면 에러	
//		Data2 d3 = new Data2(10); // 매개변수가 있음

	}

}
