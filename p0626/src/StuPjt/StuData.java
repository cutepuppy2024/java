package StuPjt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StuData {

	
	{// 공통 - 학번자동생성
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		stuNo = "S"+sdf.format(d)+String.format("%03d",1+count++);	
	}
	StuData(){}
	StuData(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total/3.0;
	}
	
	static int count;
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	int choice = 0;
	
	String getstuNo() {
		return stuNo;
	}
	
	void setstuNo(String stuNo) {
		
	}
}
