package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// Math.random()�� ����Ͽ� 2�� ~ 9�� �� 1���� �����ϰ� ���� 
		// ���� �Է� ����
		// "����!" Ȥ�� "��!"�� ���
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

