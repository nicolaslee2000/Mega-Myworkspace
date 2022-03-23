package day20gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.*;

class MyCafe extends JPanel implements ActionListener{
	
	
	private JFrame frame = new JFrame("Cafe Menu");
	private final int F_WIDTH = 600;
	private final int F_HEIGHT = 400;
	private int totalprice = 0;
	private Map<String, Integer> menu = new LinkedHashMap<>();
	private JButton[] buttons;

	
	
	public MyCafe(){
		AddButtons();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(F_WIDTH,F_HEIGHT);
		frame.setLocationRelativeTo(null);
		setLayout(new GridLayout(2,3));
		frame.add(this);
		frame.setVisible(true);
		
		
		
	}
	
	public void AddButtons() {
		AddMenu("Americano", 2000);
		AddMenu("Latte", 2500);
		AddMenu("Vanila\nLatte", 3500);
		AddMenu("Cappuchino", 4000);
		AddMenu("Orange\njuice", 3200);
		AddMenu("purchase", 0);
		
		buttons = new JButton[menu.keySet().size()];
		
		int a = 0;
		for(String i:menu.keySet()) {
			
			buttons[a] = new JButton(i);
			buttons[a].setBackground(Color.white);
			buttons[a].setForeground(Color.black);
			buttons[a].setFont(new Font("Serif", Font.PLAIN, 14));
			buttons[a].addActionListener(this);
			add(buttons[a]);
			a++;
		}
		
		
//		for(int i = 0; i< menu.keySet().size(); i++) {
//			
//			JButton button[i] = new JButton(menu.keySet().toArray()[i]);
//		}
	
		
		//debug
		for(int i = 0;i<buttons.length;i++) {
			System.out.println(buttons[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton)e.getSource();
		
	
		if(button.getText() == "purchase") {
			JOptionPane.showMessageDialog(this, "Your total price is:"+totalprice);
			totalprice = 0;
			return;
		}
		for(String i:menu.keySet()) {
			totalprice += button.getText()==i?menu.get(i):0;
			
			
		}
		
	}
	
	public void AddMenu(String name, int price) {
		menu.put(name, price);
	}
	
}


public class Quiz01 {
	public static void main(String[] args) {
		new MyCafe();
	}
}
