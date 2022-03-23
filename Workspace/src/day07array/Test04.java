package day07array;

public class Test04 {
	public static void main(String[] args) {
		//multidimensional arrays
		int[][] arr1 = new int[4][3];
		int[][] arr2 = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] arr3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}};
		
		for (int i = 0; i<arr3.length; i++) {
			for (int j = 0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
	}
}
