package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// Math.random()을 사용하여 2단 ~ 9단 중 1개를 랜덤하게 내고 
		// 답을 입력 받음
		// "정답!" 혹은 "땡!"을 출력
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()){
			System.out.println("a");
			int randNum1 = (int) (Math.random() * 8 + 2);
			int randNum2 = (int) (Math.random() * 8 + 2);
			System.out.println("b");
			
			System.out.printf("What is %d times %d?%n", randNum1, randNum2);
			
			System.out.println("c");
			int answer = sc.nextInt();
			System.out.println('d');
			System.out.println((answer == randNum1*randNum2) ? "correct" : "incorrect");
			System.out.println('f');
			
				
		} 
		
		System.out.println("exiting");
		
		
	}
}

