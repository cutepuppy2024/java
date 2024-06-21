package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		// printf의 출력
		// 소수점 제한 출력가능, 8진수, 16진수 출력가능
		System.out.println(10.0/3); // 소수점을 제어할 수 없음
		System.out.println(10.0f/3);
		System.out.printf("%.2f \n", 10.0/3); // 줄단락을 입력해야함
		int x = 0x1a; // 16진수(유니코드) 표현 1a 값은? 1*16 + 0*16 = 16
		System.out.println("x :"+x);
		System.out.printf("%X \n", x); // printf 16진수 출력가능
		
		long a = 10L;
		System.out.printf("%d \n", a);
		int b = 20;
		System.out.printf("%d \n", b);
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이 : %d 세, 년도 : %d 년 \n", age, year);
		System.out.println("나이 : "+age+"세, 년도 : "+year+"년");
		
		System.out.printf("[%5d] \n",10);
		System.out.printf("[%05d] \n",10);
		
		

		
	}

}
