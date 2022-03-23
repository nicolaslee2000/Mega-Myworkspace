package day03;

import java.util.Scanner;

//string equal comparison

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.print("name of pokemon? \ntype:");
		answer = sc.next();
		
		System.out.println("Result : " + (answer == "pikachu"));
		System.out.println("Result : "+ (answer.equals("pikachu")));
	}
}
