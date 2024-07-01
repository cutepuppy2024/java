package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaClass {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		
		}

//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//list 출력
		list.forEach(i -> System.out.println(i)); 
		
		list.removeIf(x -> x%2==0 || x%3==0); // 람다식인 경우 매개변수로 메서드가 올 수 있음
		System.out.println(list);
		
		list.replaceAll(i -> i*10);
		System.out.println(list);

		Map<String, String> map = new HashMap();
		map.put("1","1");
		map.put("2","2");
		map.put("3","3");
		map.put("4","4");
		
		map.forEach((str,str2) -> System.out.println("{"+str+","+str2+"}")); // 람다식-매개변수
//		map.forEach(data_list()); // 매개변수에는 함수가 올 수 없음 : error
	}
	
//	public static Integer data_list() {
//		return "1";
//	}
	
	void list_print(int i) {
		System.out.println(i);
	}
	
//	(int i) -> {System.out.println(i); }
//	(int i) -> System.out.println(i)
	
//	// 람다식
//	int max(int a , int b) {
//		return a>b? a:b;
//	}
//	// return 생략가능
//	(int a , int b) -> a>b? a:b

}
