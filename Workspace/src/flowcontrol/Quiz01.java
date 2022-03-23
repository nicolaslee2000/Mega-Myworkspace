package flowcontrol;


import javax.swing.JOptionPane;

/*
 *  < ��� ���� ���� - ������ ���� ����� >
 *  ��Ģ : 
 *   	1. ����ڿ��� ���ϴ� �� ���� �Է� �޴´�.
 *   	2. �Է� ���� �� �� ��ŭ ������ ������ ����.
 *   	3. ���� �� 100��, ������ ��� -10��.
 *   	4. ��� Ƚ���� ����Ǹ� ������ ����Ѵ�.
 *   	5. ������� �ۼ�Ƽ���� ����Ѵ�.(�Ҽ����� �����Ѵ�.)
 *   	6. ������� 80% �̻��̸� "win"��, �׷��� ������ "lose"�� ����Ѵ�.
 *   	(JOP Ȱ��)
 *  
 *  
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		int rounds = Integer.parseInt(JOptionPane.showInputDialog("type number of rounds"));

		
		
		double answerCnt = 0;
		int score = 0;
		int correctAnsCnt = 0;
		while (answerCnt < rounds) {
			int numA = (int)(Math.random()*8 +2);
			int numB = (int)(Math.random()*8 +1);
			String question = numA + "X" + numB + "= ?";
			
			int answer = Integer.parseInt(JOptionPane.showInputDialog(question));
			
			if (answer == numA * numB) {
				answerCnt += 1;
				correctAnsCnt += 1;
				score += 100;
				JOptionPane.showMessageDialog(null, "Correct!");
				continue;
			}
			
			answerCnt += 1;
			score -= 10;
			JOptionPane.showMessageDialog(null, "Wrong");
				
			
			
		}
		
		System.out.printf("%nScore: %d %n%d%% correct!%n", score, (int)((correctAnsCnt)/(answerCnt)*100));

			if (correctAnsCnt > 0.8) {
				System.out.println("you win!!");
			}
			else {
				System.out.println("you lose..");
			}
			
			
		
		
		
		
	}
}
