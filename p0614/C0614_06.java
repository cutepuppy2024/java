package p0614;

public class C0614_06 {

	public static void main(String[] args) {
		float f = 1.6f;
		int i = (int)f; // 형변환
		System.out.println(i);

		int n = 10;
		float fl = n;
		System.out.println(n);
		System.out.println(fl); // 소수점이 있음 
		
		int n2 = 65;
		char ch = (char)n2;// 형변환
		System.out.println(ch); // A
		
		char ch2 = 'a';
		int n3 = ch2;
		System.out.println(n3); // 97
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2);
	}

}
