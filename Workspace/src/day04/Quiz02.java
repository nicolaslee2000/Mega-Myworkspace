package day04;

import javax.swing.JOptionPane;

public class Quiz02 {
	public static void main(String[] args) {
//		JOptionPane�� ����Ͽ� �̸��� Ű, ü���� �Է� �ް�
//		BMI(ü����) ������ ����ϼ���.
//		w: ü��
//		t: Ű (*���� : ����)
//		BMI = w/(t^2) 
		
		String name = JOptionPane.showInputDialog("name");
		String sHeight = JOptionPane.showInputDialog("height");
		String sWeight = JOptionPane.showInputDialog("weight");
		
		double BMI = Math.round(Double.parseDouble(sWeight)/ Math.pow((Double.parseDouble(sHeight)/100), 2 )*100)/100;
		
		JOptionPane.showMessageDialog(null, name + "\nBMI: " + BMI);
		
		
	}
}
