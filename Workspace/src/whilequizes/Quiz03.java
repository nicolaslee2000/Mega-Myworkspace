package whilequizes;

import java.util.Scanner;

public class Quiz03 {
	// Math.random()�� ����Ͽ� ������ ������ �����ϰ� ����(2~9��), 
	// ���� �Է� �޾� "����!" Ȥ�� "��.."�� ���
	// ������ 5�� ���� ������ �ݺ�
	
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