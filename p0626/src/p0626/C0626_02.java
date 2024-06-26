package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		// 구매내역
//		Product[] cart = new Product[10]; // 인스턴스변수

		// 구매
		Product t = new Tv(); // 다형성
		Tv t2 = new Tv();
		b.buy(t); // Tv 1대 구매
		b.buy(t2);
//		b.buy(new Tv()); // 객체생성을 추가로 하지 않아도 되므로 간편

		Product c = new Computer();
		b.buy(c); // 컴퓨터 구매
//		
		Product a = new Audio();
		b.buy(a); // Buy에 구매메서드가 없으면 error
		
		Product r = new Refrigerator();

		b.buy(r);
		b.buy(new Refrigerator());
		b.buy(t);
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Computer()); 
		b.buy(t);
		b.buy(t);
		b.buy(a);


		
		// cart 제품명, 가격을 모두 출력
//		b.cart : 배열
		b.summary();
//		System.out.println(" [ 구매내역 ] ");
//		int sum = 0;
//		for(int i=0;i<list.size();i++) {
////			System.out.printf("장바구니에 담은 물품리스트 : %s,%d만원 \n",b.cart[i].pName); 
//			Product p = (Product)(list.get(i)); // 타입: obj -> 형변환을 시켜주어야 함.
//			System.out.println(p.pName); // b.cart[i].pName
//			sum += p.price;
//		}
//		System.out.println("총 구매개수 :"+list.size());
//		System.out.println("총 구매금액 :"+sum);
	}

}
