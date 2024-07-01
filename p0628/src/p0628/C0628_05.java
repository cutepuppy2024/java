package p0628;

public class C0628_05 {

	public static void main(String[] args) {
		
		// [ String ]
		String str = "123";
		str = str+"12";
		System.out.println(str);
		
		// [ String Buffer ]
//		StringBuffer sb = "123"; error
		StringBuffer sb = new StringBuffer("123");
//		sb = sb + "12"; // error
		sb.append("12"); // "123"+"12"와 같은 의미
		System.out.println(sb);
		
		int a = 10;
		int b = 5;
		int c = 100;
		System.out.println(Math.max(Math.max(a, b), c));
		
	}

}
