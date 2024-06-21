package p0614;

public class C0614_10 {

	public static void main(String[] args) {
		// 전위형 증감연산자
//		int i = 5;
//		int j = 0;
//		j = ++i;
//		System.out.println(j);
		
		// 후위형 증감연산자
		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j :"+j);
		System.out.println("i :"+i);
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		System.out.println(bol1 == bol2);
		System.out.println(bol1 != bol2);

	}

}
