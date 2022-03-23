package day03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//1. input one int and check if multiple of 3 or not
		//2. check password. If its "pika1234", print access, otherwise check again
		
		Scanner sc = new Scanner(System.in);
		int userInt;
		System.out.print("type integer");
		userInt = sc.nextInt();
		System.out.println((userInt %3  == 0) ? "factor of 3" : "not a factor of 3");
		
		String password = null;
		System.out.println("type your password");
		password = sc.next();
		System.out.println(password.equals("pika1234") ? "access" : "check again");
		
	}
}
