package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C0701_06_InputStream {

	public static void main(String[] args){ // aaa가 없으면 error-> Exception하면 모든 에러처리
		// 기본적인 InputStream 형태
		try {
			FileInputStream fis = new FileInputStream("c:save/aaa/txt"); // InputStream : 1byte씩 가지고 옴
			int read = 0;
			try {
				while((read = fis.read()) != -1) { 
					System.out.println((char)read);
				
				}
			}catch (IOException e) {e.printStackTrace();}
		}catch(FileNotFoundException e ) {e.printStackTrace();}
		
		
		// try-catch문을 1개로만 사용가능
		try {
			FileInputStream fis = new FileInputStream("c:save/aaa/txt"); // InputStream : 1byte씩 가지고 옴
			int read = 0;
			while((read = fis.read()) != -1) { 
					System.out.println((char)read);
					}
		} catch(Exception e ) {e.printStackTrace();}
		
		
		//		byte[] b = new byte[1024]; => 1024byte씩(약 500자) 읽어옴, 메모리를 많이 차지함
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			fis.read(b); // 파일 읽어오기
//			System.out.println(new String(b));
//			
//		}catch(Exception e ) {e.printStackTrace();}
		

	}//main

}//class
