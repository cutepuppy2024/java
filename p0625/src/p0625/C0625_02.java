package p0625;

public class C0625_02 {

	public static void main(String[] args) {

		Deck d = new Deck(); // 52장의 카드가 모두 생성됨

		d.shuffle();
		
		// 5장을 뽑는 메서드를 구현해서 실행
		Card[] cc = d.pick5();
		for(int i=0;i<cc.length;i++) {
		System.out.printf("카드 %d : [ %s,%d ] \n",i,d.cc[i].kind,cc[i].number);
		}
		
		Card[] cc2 = d.pick6();
		for(int i=0;i<cc2.length;i++) {
		System.out.printf("카드 %d : [ %s,%d ] \n",i,d.cc2[i].kind,cc2[i].number);
		}
		
		


//		Card card = d.pick();
//		System.out.printf("카드1장 : %s,%d \n",card.kind,card.number);
//		
//		Card card2 = d.pick();
//		System.out.printf("카드1장 : %s,%d \n",card2.kind,card2.number);
//		
//		Card card3 = d.pick(3); 
//		System.out.printf("카드1장 : %s,%d \n",card3.kind,card3.number);
		
		// 출력부분 
//		for(int i=0;i<52;i++) {
//			System.out.printf("카드 %d : [%s , %d] \n",i+1,d.c[i].kind,d.c[i].number);
//		}

	}

}
