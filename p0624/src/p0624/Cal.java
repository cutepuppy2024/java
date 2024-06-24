package p0624;

public class Cal {
	// #1
	// 인스턴스 메서드
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	// #2
	int add2(int[] num) {
		int sum = 0;
		for(int i=0; i<num.length;i++) {
			sum += num[i];
		}
		return sum;
	}
	
	// #3
	int result1 = 0;
	int cal(int[] arr, String str) {
		switch(str) {
		case "+":
			result1 = arr[0] + arr[1];
			break;
		case "-":
			result1 = arr[0] - arr[1];
			break;
		case "*":
			result1 = arr[0] * arr[1];
			break;
		case "/":
			result1 = arr[0] / arr[1];
			break;
		}//switch
		return result1;
	}// method
}
