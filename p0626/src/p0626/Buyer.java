package p0626;

import java.util.ArrayList;

public class Buyer {
	String userId = "aaa";
	String userPw = "1111";
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10];
//	int count; // 인스턴스 변수
	ArrayList list = new ArrayList();
	// 구매내역
	
	Buyer(){}
	
	Buyer(String userId, String userPw, int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	// 구매 메서드 : 부모의 참조변수
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액이 부족합니다.( 보유금액 : %d 만원)\n",money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // 객체배열 추가 - add()
//		cart[count++] = p;// 구매물품을 저장
		System.out.printf("%s 제품을 구매했습니다.( 보유금액 : %d 만원) \n",p.pName,money);
	}
	void summary() {
		System.out.println(" [ 구매내역 ] ");
		int sum = 0;
		for(int i=0;i<list.size();i++) {
//			System.out.printf("장바구니에 담은 물품리스트 : %s,%d만원 \n",b.cart[i].pName); 
			Product p = (Product)(list.get(i)); // 타입: obj -> 형변환을 시켜주어야 함.
			System.out.println(p.pName); // b.cart[i].pName
			sum += p.price;
		}
		System.out.println("총 구매개수 :"+list.size());
		System.out.println("총 구매금액 :"+sum);
	}
	// 부모의 참조변수로 통일시키는 과정
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Audio t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
	
//	void buy(Refrigerator r) {
//	money -= r.price;
//	bonusPoint += r.bonusPoint;
//}
}
