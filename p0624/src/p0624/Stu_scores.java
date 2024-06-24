package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_scores {

	// 학번 자동생성
	{ // 공통
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.stuNo = "S"+sdf.format(d)+String.format("%04d",count);
	}
	
	// 매개변수 생성자
	Stu_scores(String stuNo, String name,int kor,int eng,int math){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total/3.0;
	}
	
	//인스턴스변수
	static int count;
	String stuNo;
	String name;
	int kor,eng,math,total,rank;
	double avg;
	int s_count = 0;
	
}
