package p0701;

public class C0701_04_pre_Thread {

	public static void main(String[] args) {
		for(int i=0;i<300;i++) {
			System.out.println(i+" : "+"-");
		}
		for(int i=0;i<300;i++) {
			System.out.println(i+" : "+"|");
		}
		
		C0701_04_pre_Thread m = new C0701_04_pre_Thread();
		int n = m.max(20,10);

	}// main
	
	int max(int a , int b) {
		return a>b? a:b;	
	}
	
	
}// class
