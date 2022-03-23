package day05;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("natural number (type -1 to exit)");
			n = sc.nextInt();
			
			if (n == -1) {
				System.out.println("exiting");
				break;
			}
		}
		sc.close();
		
	}
}
