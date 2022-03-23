package day03;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 1. 국,영,수 세 과목의 점수를 입력 받고
		// 2. 세 과목의 평균을 출력하세요.
		// 3. 평균이 85.5 이상이면 "합격!", 아니면 "불합격!"을 출력하세요.
		// 주의 : 85, 86, 86를 입력했을 때 합격이 출력되어야 합니다. 
		int kr, en, ma; // 국, 영, 수 점수를 저장할 변수
		double avg;     // 평균 저장할 변수
		int numberofSub = 3;
		String[] subjects = {"kr", "en", " ma"};  

		Scanner sc = new Scanner(System.in);
		
//		for (int i = 0; i < numberofSub; i ++) {
//			
//			System.out.printf("Grade %d", kr);
//			
//			
//		}
		
		System.out.println("grade kr");
		kr = sc.nextInt();
		System.out.println("grade en");
		en = sc.nextInt();
		System.out.println("grade ma");
		ma = sc.nextInt();
		
		avg = (kr + en + ma)/3.0;
		System.out.println((avg >= 85.5 && kr>65 && en>65 && ma>65) ? "Pass!" : "Fail");
		
		System.out.println(avg);
	}
	
}
	