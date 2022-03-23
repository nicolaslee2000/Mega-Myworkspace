package day05;

import java.util.Scanner;



public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("your age");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.println("minor");
		}
		
		// if (20<age<40){} **error
		
		sc.close();
		
	}
}
