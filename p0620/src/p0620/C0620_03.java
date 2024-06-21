package p0620;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0620_03 {

	public static void main(String[] args) {
		
		// 객체생성
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		System.out.println(sdf.format(date)); // 2024-06-20 10:48:39 오전
		System.out.println(sdf2.format(date)); // 2024
//		System.out.println(date.getTime()); // millisecond 
//		System.out.println(date); // Thu Jun 20 10:46:07 KST 2024

		// Calendar 객체
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

		// currentTimeMillis()함수 사용
		long today = System.currentTimeMillis();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf3.format(today));
//		System.out.println(todakay);

	}
	


}
