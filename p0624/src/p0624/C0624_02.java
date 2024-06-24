package p0624;

import java.util.Arrays;

public class C0624_02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println("arr1 :"+Arrays.toString(arr));
		
		int[] arr2 = null;
		
		arr2 = arr; // 주소값이 복사되어 있는 것
		System.out.println("arr2 :"+ Arrays.toString(arr2)); //  => 값이 출력됨
		
		arr2[0] = 1000;	
		System.out.println("arr2 2nd :" + Arrays.toString(arr2));
		System.out.println("arr 도 변경됨:"+ Arrays.toString(arr)); // 복사하면 모두 변경되므로 주의!
		
		
	}// main

}// class
