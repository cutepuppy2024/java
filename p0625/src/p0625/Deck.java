package p0625;

public class Deck {
	// 1,2,3,....11-J, 12-Q, 13-K  : 13number*4kind = 52장
	Card[] c = new Card[52]; // 배열선언
	Card[] cc = new Card[5]; // 5장선택배열 선언
	Card[] cc2 = new Card[5];
	
	String[] shape = {"SPADE", "DIAMOND", "HEART","CLOVER"};
	int count = 0;
	
	// 1,2,3,4,5,6,7,8,9,10
	Deck() { // 기본생성자
		for(int i=0;i<52;i++) {
			// 매개변수생성자
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}
	
	// 카드섞기 메서드
	void shuffle() {
		for(int i=0; i<300;i++) {
			int random = (int)(Math.random()*52); // 0-51
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	Card pick() {
		Card card = c[count];
		count++;
		return card;
	}
	
	Card pick(int n) { // n번째
		return c[n];
	}
	
	Card[] pick5() {
		for(int i=0;i<cc.length;i++) {
			cc[i] = c[count++];
		}
		return cc; // 배열을 보냄
	}
	Card[] pick6() {
		for(int i=0;i<cc.length;i++) {
			cc2[i] = c[count++];
		}
		return cc2; // 배열을 보냄
	}
	
	
	
}

// 기본생성자
//			c[i] = new Card();
//			c[i].number = i%13+1;
//			c[i].kind = shape[i/13];

//			number[i] = i%13+1;
//			kind[i] = shape[i/13];