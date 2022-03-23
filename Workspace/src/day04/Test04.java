package day04;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("type your name");
		String sAge = JOptionPane.showInputDialog("type your age");
		JOptionPane.showMessageDialog(null, name);
		JOptionPane.showMessageDialog(null, sAge);
		
		int age = Integer.parseInt(sAge);
		
		System.out.println(age >= 20 ? "adult" : "minor");
	}
}
