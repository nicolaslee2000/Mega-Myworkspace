package whilequizes;

import java.util.Scanner;

public class Quiz03 {
	// Math.random()을 사용하여 구구단 문제를 랜덤하게 내고(2~9단), 
	// 답을 입력 받아 "정답!" 혹은 "땡.."을 출력
	// 정답이 5번 나올 때까지 반복
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answercnt = 0;
		while (answercnt<5) {
			int numA = (int)(Math.random()*8 +2);
			int numB = (int)(Math.random()*8 +1);
			
			System.out.printf("%d X %d ?", numA, numB);
			int answer = sc.nextInt();
			
			if (answer == numA * numB) {
				answercnt += 1;
				System.out.println("correct");
	
			}
			else{
				System.out.println("wrong");
				break;
			}
			
		}
		sc.close();
	}
	
}
// Quiz04.java