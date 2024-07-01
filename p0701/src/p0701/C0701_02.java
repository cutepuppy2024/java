package p0701;

import java.util.ArrayList;

public class C0701_02 {

	public static void main(String[] args) {
		// 
		ArrayList<Card> list = new ArrayList();	
//		ArrayList list = new ArrayList();	
		list.add(new Card(1,"CLOVER"));
		list.add(new Card(10,"HEART"));
		list.add(new Card(2,"SPADE"));
//		list.add(2);
//		list.add(new Students("홍길동",100,100,99));
		
		for(int i=0;i<list.size();i++) {
			Card c = (Card)list.get(i);
//			System.out.println(list.get(i));
			System.out.println(c.getKind()+","+c.getNumber());
			System.out.println(list.get(i).getKind()+","+list.get(i).getNumber());
		}
		

	}

}
