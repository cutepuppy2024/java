package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자 하는 문자열을 입력하세요 >>");
		String search = scan.next();
		
		String str = "abcabcabcabcaaabbbkkkllllabcdeakabcdefga";
		System.out.println("해당 문자열 : "+str);
		int count = 0;
		while(true) {
			int num = 0;
			num = str.indexOf(search);
			if(num == -1) {
				break; // 해당하는 문자열을 못찾을 때 
			}else {
				count++;
				str = str.substring(num+2);
			}
		}// while
		
		System.out.printf("%s 찾는 문자열 개수 : %d \n",search,count);
//		
//		
//		System.out.println(str);
//		System.out.println(str.indexOf("a"));
//		
//		String str2 = str.substring(1);
//		System.out.println("str2 : "+str.substring(1));
//		
//		String str3 = str2.substring(5);
//		System.out.println("str3 : "+str2.indexOf("a"));
//		
//		String str4 = str3.substring(2);
//		System.out.println("str4 : "+str3.indexOf("a"));

	}// main

}// class
