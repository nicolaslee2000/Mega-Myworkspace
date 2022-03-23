package day04;

import javax.swing.JOptionPane;

public class Quiz02 {
	public static void main(String[] args) {
//		JOptionPane을 사용하여 이름과 키, 체중을 입력 받고
//		BMI(체질량) 지수를 출력하세요.
//		w: 체중
//		t: 키 (*단위 : 미터)
//		BMI = w/(t^2) 
		
		String name = JOptionPane.showInputDialog("name");
		String sHeight = JOptionPane.showInputDialog("height");
		String sWeight = JOptionPane.showInputDialog("weight");
		
		double BMI = Math.round(Double.parseDouble(sWeight)/ Math.pow((Double.parseDouble(sHeight)/100), 2 )*100)/100;
		
		JOptionPane.showMessageDialog(null, name + "\nBMI: " + BMI);
		
		
	}
}
