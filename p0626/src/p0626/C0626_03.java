package p0626;

import java.util.ArrayList;
import java.util.Arrays;

public class C0626_03 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // obj만 가능
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",89,87,99));
		list.add(new Students("이순신",90,90,92));
		
		list.remove(1);


		System.out.println("입력된 개수 :"+list.size()); // 입력된 값의 개수만 출력
		
		// 전체출력
		for(int i=0;i<list.size();i++) {
			Students s = (Students) list.get(i);
			System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d \n",
					s.stuNo, s.name, s.kor, s.eng, s.math, s.total,s.avg,s.rank);
		}


		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		arr[5] = 6; // error
		System.out.println("배열 개수 :"+arr.length); // 값이 2개만 입력되었어도 5로 출력
//		int[] arr2 = {1,2,4,5};
//		
//		arr[2] = 0;
//		
//		System.out.println(Arrays.toString(arr));

	}

}
