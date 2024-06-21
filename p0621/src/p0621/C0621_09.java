package p0621;

import java.util.Arrays;

public class C0621_09 {

	public static void main(String[] args) {
		Cal2 c = new Cal2();
		
		int a = 10;
		int b = 3;
		
		double[] arr = new double[4];
		c.cal(a,b,arr);
		
		
		System.out.println(Arrays.toString(arr));

	}

}
