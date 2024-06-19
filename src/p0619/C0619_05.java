package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		// [5,5] 배열을 생성해서 1-25의 숫자를 입력하고, 랜덤으로 섞은 후, 출력
		int[][] arr = new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = 5*i+(j+1);
			}
		}
		
		int no = 0;
		int no2 = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				no = (int)(Math.random()*5);
				no2 = (int)(Math.random()*5);
				temp = arr[0][0];
				arr[0][0] = arr[no][no2];
				arr[no][no2] = temp;
			}
		}//for

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
	}//main

}
