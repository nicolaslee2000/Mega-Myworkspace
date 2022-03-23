package day07array;

public class Test05 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6,8},
				{6,7}
		};
//		for (int i = 0; i<arr.length; i++) {
//			for (int j = 0; j<arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		for (int[] i : arr) {
			for (int j : i) {
				System.out.println(j);
			}
		}
		
	}
}
