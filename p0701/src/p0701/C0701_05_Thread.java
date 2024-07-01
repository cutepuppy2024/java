package p0701;

public class C0701_05_Thread {

	public static void main(String[] args) {
		// 멀티스레드 : window에서 알아서
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start(); // 실행함수
		th2.start();

	}

}
