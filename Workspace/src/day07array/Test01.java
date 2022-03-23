package day07array;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		double[] arr = new double[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println("type your number");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
