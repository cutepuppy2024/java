package p0625;

import Introduce.ComInfo;
import Introduce.Info;

public class C0625_04 {

	public static void main(String[] args) {
		Info i = new Info(); // 패키지가 다름에도 클래스 선언가능
		
		ComInfo c = new ComInfo(); // error : default가 같은 패키지 내애서만 가능하므로 선언/접근불가

	}

}
