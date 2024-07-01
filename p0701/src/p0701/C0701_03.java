package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class C0701_03 {

	public static void main(String[] args) {
		// Card list 가져오기
		
		Process p = new Process();
		// 메서드명
		ArrayList<Card> clist =  p.clistAdd(); 
		
		for(int i=0;i<clist.size();i++) {
//			System.out.println(list.get(i));//주소값
			System.out.println(clist.get(i));
			System.out.println(clist.get(i).getNumber());// 넘버만
		}
		
		// Students list 가져와서 출력
		ArrayList<Students> slist =  p.slistAdd();
		for(int i=0; i<slist.size();i++) {
			System.out.println(slist.get(i));
		}
		// 2개 모두 가져와서 출력
		HashMap<String, Object> map = p.listAdd();
		
		clist = (ArrayList<Card>)map.get("clist"); // obj를 형변환해줌 : ArrayList<Card>
		for(int i=0; i<clist.size();i++) {
			System.out.println(clist.get(i));
//			System.out.println(clist.get(i).getKind());
		}
		
		slist= (ArrayList<Students>)map.get("slist");;
		for(int i=0; i<slist.size();i++) {
			System.out.println(clist.get(i));
//			System.out.println(clist.get(i).getName());
		}

	}// main

}// class
