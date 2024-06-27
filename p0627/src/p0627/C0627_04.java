package p0627;

public class C0627_04 {

	public static void main(String[] args) {
		try {
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e;		
			System.out.println(0/0);
			
		}catch(Exception e){
			System.out.println("에러메시지 : "+e.getMessage()); // 2가지가 동일
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
		
	}// main
}// class
