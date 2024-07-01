package p0628;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class C0628_06 {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		ArrayList<Students> list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("홍길동",99,99,99));
		list.add(new Students("이순신",80,90,94));
		list.add(new Students("강감찬",70,87,99));
		list.add(new Students("홍길동",66,88,99)); 
		list.remove(1); // 위치값으로 삭제
//		list.remove(new Students("이순신",80,90,94)); // 데이터로는 삭제불가
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		// 제너릭
//		ArrayList<Card> list = new ArrayList();
//		list.add(new Card(1,"SPADE"));
//		list.add(new Card(2,"SPADE"));
//		list.add(new Card(2,"DIAMOND"));
//		list.add(new Card(3,"HEART"));
//		list.add(new Card(4,"CLOVER"));
////		list.add(new Students()); // 다른 객체가 들어올 때 error
////		list.add("안녕");
//		
//		for(int i=0;i<list.size();i++) {
////			Card c = (Card)list.get(i); // 강제형변환 하지 않아도 됨
//			System.out.println(list.get(i).number+","+list.get(i).kind);
//		}
		
		
		
		
//		ArrayList list = new ArrayList();
//		list.add("홍길동");
//		list.add("유관순");
//		list.add("이순신");
//		list.add("김구");
//		list.add("강감찬");
//		list.remove(1); 	// index를 가지고 유관순 삭제
//		list.remove("김구"); // 객체 형태로 삭제
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		// List : 순서가 있음, 중복을 허용
//		ArrayList list = new ArrayList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.remove(1); // remove : 삭제
//		
//		// size() : 컬렉션 크기
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); // get : 데이터를 읽어옴
//		}
		
	}

}
