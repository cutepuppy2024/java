package p0614;

public class C0614_11 {

	public static void main(String[] args) {
		byte a = 1;
		int n = 350;
//		byte c = (byte)(a + n); // type mismatch : c 타입 정의 때문
		int c = a + n;
		System.out.println(c);

		char ch = 'A'; // ASCII, 출력값: 65
		char ch2 = 'B'; // ASCII  출력값 : 66
		System.out.println(ch+ch2);
		
		System.out.println(ch+32); // 97
		System.out.println((char)(ch+32)); // a : 소문자로 변환시 +32
		
		byte by = 10;
		byte by2 = 20;
		byte by3 = (byte)(by + by2);
		System.out.println(by3);
		
		int by4 = by + by2;
		System.out.println(by4);
		
		int num = 1000000;
		int num2 = 2000000;
		long total = (long)num * num2;
		System.out.println("long :"+total);
		
		long num3 = 1000000L;
		long num4 = num * num3;
		System.out.println(num4);
		
		int num5 = 1000000;
		System.out.println(num/num5*1000000);
		System.out.println(num*num5/1000000);
		
		char c1 = 'a';
//		char c2= c1 + 1; // error
		char c2 = (char)(c1+1);
		System.out.println(c2);
		
		char c3 = c1++;
		System.out.println(c3);
		
		char c4 = ++c1; // 형변환하지 않고 증가시킴
		System.out.println(c4);
		
		int i = 'B'-'A'; // A:65, B:66, C:67, D:68 / a:97, b:98, c:99
		System.out.println(i);
		
		
		// 문자 숫자 : 문자숫자 '0'을 빼면 숫자값이 나옴 <- 숫자 출력 원할 때 활용, for문 사용시에도
		int j = '2'-'0'; //0:48, 1:49, 2:50
		System.out.println(j);
		
		int k  = '8'-'0';
		System.out.println(k);
		
		
	}

}
