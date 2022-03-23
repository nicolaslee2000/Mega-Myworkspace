package day06array;

import java.util.Arrays;

public class Test01 {
	/*array usage: controlling several data
	 * ! cannot change the length of the array once created
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//how to create an array
		//1. 
		int[] a;
		a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(Arrays.toString(a));
		
		//2. 
		int [] b;
		b = new int[] {10,20,30,40,50};
		System.out.println(Arrays.toString(b));
		
		//3.
		int[] c = {10,20,30,40,50};
		System.out.println(Arrays.toString(c));
	}
}
