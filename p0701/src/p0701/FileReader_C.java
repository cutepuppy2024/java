package p0701;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_C {  // 한글 error나지 않음

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/save/abc.txt"); 
			BufferedReader br = new BufferedReader(fr); // 한줄씩 가져오기
			while(true) { // 2가지 형태로 가능
				String line = br.readLine(); // 1줄 가져오기
				if(line==null) break;
				System.out.println(line);
			}
			String rline = "";
			while((rline = br.readLine()) !=null) {
				System.out.println(rline);
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
