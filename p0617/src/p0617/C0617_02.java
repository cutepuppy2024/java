package p0617;

public class C0617_02 {

	public static void main(String[] args) {
		int a = 10;
		int b =3;
		System.out.print(a/(double)b); // 소수점 2째자리까지 나타내고자 하는 경우 줄을 바꾸지 않았기 때문에 불가능
		System.out.println(10/3.0);
		System.out.println(a/(double)b);
		
		System.out.printf("%.2f",10/3.0);
		System.out.println("aaa");// 줄단락이 바뀌지 않고 나옴
		
		System.out.printf("%.2f \t",10/3.0); // tab 적용
		System.out.println("aaa");
		
		System.out.printf("%.2f \n",10/3.0); // 개행
		System.out.println("aaa");
		
		System.out.printf("%x \n",15); // 16진수
		System.out.printf("%o \n",15); // 8진수
		System.out.printf("%s \n",Integer.toBinaryString(15)); // 2진수로 변경 : 문자열로 변경하여 실행 -> toBinaryString
	}

}
