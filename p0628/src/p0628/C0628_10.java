package p0628;


import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

import p0628.Card.Kind;

public class C0628_10 {

	public static void main(String[] args) {
		// Generics : 배열에 들어갈 객체를 한정시킴 -> 내부에 형변환 불필요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요 >>");
		String str = scan.next();
		
		ArrayList<Card> list = new ArrayList(); 
		list.add(new Card(1,Kind.CLOVER));
		list.add(new Card(1,Kind.DIAMOND));
//		list.add(new Card(3,"SPADE"));
//		list.add(new Card(7,"spade"));
		list.add(new Card(5,Kind.CLOVER));
		list.add(new Card(2,Kind.DIAMOND));

//		list.sort(new Comparator<Card>() {
//
//			@Override // 숫자, 문자열
//			public int compare(Card o1, Card o2) {
////				return o1.number-o2.number;
//				return o2.number-o1.number;
//			}
//		});
		
		list.sort(new Comparator<Card>() {

			@Override // 숫자, 문자열
			public int compare(Card o1, Card o2) {
//				return o1.kind.compareTo(o2.kind);
//				return o2.kind.compareTo(o1.kind);
				return o2.getKind().compareTo(o1.getKind());
			}
		});
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getKind());
//			System.out.println((Card)(list.get(i)).number); Generic 없는 경우 형변환 필요
		}
	}

}
