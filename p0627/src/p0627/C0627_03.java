package p0627;

public class C0627_03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
//		System.out.println(0/0); // error => 프로그램 종료
		
		try {
			// 예외가 발생 될 것 같은 경우
			System.out.println(3);
			System.out.println(0/0); // error
			System.out.println(4);
			
		}catch(Exception e) {
			// 예외 발생 시
			System.out.println(5);
			e.printStackTrace(); // 어떤 error인지 알려주는 함수
			
		}
		
		System.out.println(6);

	}

}
