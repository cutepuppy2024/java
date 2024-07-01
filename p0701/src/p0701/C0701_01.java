package p0701;

public class C0701_01 {

	public static void main(String[] args) {
		Card c = new Card();
//		c.password = "1111"; // 간편하지만 보안상 불리
//		c.number = 15;
		c.setPassword("1111");
		c.setNumber(12);
		System.out.println(c.getNumber()); // c.number
		System.out.println(c.getPassword("admin")); 

	}

}
