package p0628;

import java.util.Arrays;

public class C0628_02 {

	public static void main(String[] args) {
		String str = "Hello, world!!";
		
		// charAt : 지정한 위치에 있는 문자 1개를 가져옴 <-> "A".charAt(0)
		char ch = str.charAt(0); // 
		System.out.println(ch);
		
		String s = "안녕하세요";
		String s2 = "홍길동입니다.";
		
		// concat : 문자열 합치기
		System.out.println(s+s2);		   // 직관적
		System.out.println(s.concat(s2));  // 속도가 더 빠름 

		// contains : 문자열에 문자가 포함되어 있는지 확인
		System.out.println(s.contains("하"));
		
		// endsWith : 지정된 문자열로 끝나는지 확인 -> 파일의 확장자명 확인시 용이
		String e = "abc.txt";
		System.out.println(e.endsWith("txt"));
		
		// length : 문자열 길이를 확인
		String l = "안녕하세요. 반갑습니다.";
		System.out.println(l.length());
		
		// replace : 문자열 중 해당문자열을 다른 문자열로 대체
		String r = "화면을 중지합니다. 중지하려면 중지버튼을 클릭하세요";
		String r2 = r.replace("중지","stop");
		System.out.println(r);
		System.out.println(r2);
		
		// indexOf : 해당문자열이 있으면 위치값을 리턴, 없는 경우 -1을 리턴
		String i = "abcdefghijklmn";
		System.out.println(i.indexOf("f"));
		System.out.println(i.indexOf("z"));
		
		// String.valueOf : 모든 타입이 String으로 전환 가능 <-> Integer.parseInt()/Integer.valueOf()
		int num = 0;
		String st1 = ""+num;
		String st2 = String.valueOf(num);
		System.out.println(st2);
		
		// substring : 
		String sub = "abc aaa aac bbc bbb ccc";
		System.out.println(sub.length());
		System.out.println(sub.substring(8,15));
		System.out.println(sub.substring(8)); // 지정된 문자위치부터 끝까지
		
		// split : 문자열을 분리자로 나누어 문자열로 리턴
		String sp = "국어,영어,수학,합계";
		String[] spArr = sp.split(",");
		String sp2 = "국어,영어,수학,합계";
		String[] spArr2 = sp.split("/");
		System.out.println(Arrays.toString(spArr));
		System.out.println(Arrays.toString(spArr2));
		
		// trim : 문자열의 앞뒤공백 제거(문자열 내부공백제외)
		String tr = "  안녕 하세요. 반갑 습니다.  ";
		System.out.println(tr.trim());
		System.out.println(tr.replace(" ",""));
		
	}

}
