package day03;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		int age;
		Scanner sc =  new Scanner(System.in);
		
		
		System.out.println("age: ");
		age = sc.nextInt();
		
		System.out.println(age >= 20 ?  "Adult" : "Minor");
		
		
	}
}
