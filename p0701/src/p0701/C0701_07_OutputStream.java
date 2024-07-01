package p0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C0701_07_OutputStream {
	
	public static void main(String[] args) throws Exception {
		
		// throws Exception
		FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
		String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n"; // \r: 커서가 가장 끝에서 enter키 명령
		str += "S0002,유관순,50,50,50,150,50.0,0\r\n";
		byte[] bytes = str.getBytes(); // 더해진 총 byte를 1byte씩 잘라서 배열에 담아줌
		for(byte b : bytes) { // 단순 for문
				fos.write(b);
		}

		System.out.println("파일에 글이 저장되었습니다.");
		
		
		// try-catch
//		try {
//			// 1byte 씩 저장됨
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n"; // \r: 커서가 가장 끝에서 enter키 명령
//			str += "S0002,유관순,50,50,50,150,50.0,0\r\n";
//			byte[] bytes = str.getBytes(); // 더해진 총 byte를 1byte씩 잘라서 배열에 담아줌
//			for(byte b : bytes) { // 단순 for문
//					fos.write(b);
//			}
//			
////			for(int i=0;i<bytes.length;i++) {
////				fos.write(bytes[i]);	
////			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일에 글이 저장되었습니다.");

//  파일생성, 폴더생성
//	public static void main(String[] args) throws Exception {
//		String str = "c:/save1";
//		
//		File folder= new File(str);
//		File file = new File(str+"/12.txt");
//		try {
//			if(!(folder.exists())) { //isDirectory()폴더가 있는지 확인  //mkdir() mkdir : 에러가 자주 나서 mkdirs를 주로 사용 -> file/save
//				System.out.println("폴더를 생성했습니다.");
//			folder.mkdirs(); // 폴더생성
//			}
//			file.createNewFile(); // 파일생성 : 로그파일저장시 사용
//		} catch( IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일이 생성되었습니다.");
	}

}
