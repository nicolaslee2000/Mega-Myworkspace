package day03;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 1. ��,��,�� �� ������ ������ �Է� �ް�
		// 2. �� ������ ����� ����ϼ���.
		// 3. ����� 85.5 �̻��̸� "�հ�!", �ƴϸ� "���հ�!"�� ����ϼ���.
		// ���� : 85, 86, 86�� �Է����� �� �հ��� ��µǾ�� �մϴ�. 
		int kr, en, ma; // ��, ��, �� ������ ������ ����
		double avg;     // ��� ������ ����
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
	