package flowcontrol;


import javax.swing.JOptionPane;

/*
 *  < 제어문 최종 문제 - 구구단 게임 만들기 >
 *  규칙 : 
 *   	1. 사용자에게 원하는 판 수를 입력 받는다.
 *   	2. 입력 받은 판 수 만큼 구구단 문제를 낸다.
 *   	3. 정답 시 100점, 오답일 경우 -10점.
 *   	4. 모든 횟수가 종료되면 총점을 출력한다.
 *   	5. 정답률을 퍼센티지로 출력한다.(소숫점은 생략한다.)
 *   	6. 정답률이 80% 이상이면 "win"을, 그렇지 않으면 "lose"를 출력한다.
 *   	(JOP 활용)
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
