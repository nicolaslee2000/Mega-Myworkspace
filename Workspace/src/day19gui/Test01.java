package day19gui;
import java.awt.*;
import javax.swing.*;


public class Test01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("my gui");
		
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		panel.setBackground(Color.pink);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
