package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		// 변수의 용이함
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a+1)-(b+1));
		System.out.println((a+1)*(b+1));
		System.out.println((a+1)/(b+1));

		
		
		int num = 0;
		int num2 = 10;
		
		num2 = num; // num2 : 0이됨
		
		
		// 객체선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t2 채널 : "+t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.print("t2 채널 : "+t2.channel+"\t/\t");
		System.out.println("t1 채널 : "+t1.channel);
		
		
		
		
		
		
		
		
		
		
		// Tv 객체생성
//		Tv t = new Tv();
		// 참조변수명, 변수명 값을 넣을 수 있음

//		t.channel = 7;
//		t.channelUp();
//		System.out.println("현재채널 :"+t.channel);
//		t.channelDown();
//		t.channelDown();
//		System.out.println("바뀐채널 :"+t.channel);

	}

}
