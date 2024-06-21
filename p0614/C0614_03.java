package p0614;

public class C0614_03 {
	public static void main(String[] args) {
		
		boolean power = true;
		char ch = 'A';
		
		System.out.println(ch);
		
		char ch2 = '\u0041'; // u : 16진수 형태
		System.out.println(ch2);

		char ch3 = 'A';
		System.out.println((int)ch3); // ASCII 
		
		int a = 65; // a:97 A:64 0:48
		System.out.println(a);
		System.out.println((char)a); // 아스키코드의 65는 A
		
		int hex = 0x100;
		System.out.println(hex); // 8진수 : 0
		
	}
	

}
