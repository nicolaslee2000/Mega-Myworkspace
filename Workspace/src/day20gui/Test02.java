package day20gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class TextApp extends JFrame implements ActionListener, KeyListener{

	private final int F_WIDTH = 400;
    private final int F_HEIGHT = 600;
	JTextArea textArea;
	JButton button;
	JTextField textField;
    
	JPanel mainPanel;
	JPanel subPanel;
	
    public TextApp() {
    	super("My App");
    	button = new JButton("Delete");
    	button.addActionListener(this);
    	textArea = new JTextArea();
    	textField = new JTextField();
    	textArea.setEditable(false);
    	textField.addKeyListener(this);
    	
    	mainPanel = new JPanel();
    	subPanel = new JPanel();
    	
    	mainPanel.setLayout(new BorderLayout());
    	subPanel.setLayout(new BorderLayout());
    	
    	subPanel.add(textField, BorderLayout.CENTER);
    	subPanel.add(button, BorderLayout.EAST);
    	
    	
    	mainPanel.add(subPanel, BorderLayout.SOUTH);
    	mainPanel.add(textArea, BorderLayout.CENTER);
    	
    	add(mainPanel);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(F_WIDTH,F_HEIGHT);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
    }
    
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textArea.setText(null);
	}



	@Override
	public void keyTyped(KeyEvent e) {
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		String text = "";
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			String input = textField.getText();
			text += textArea.getText()+ input + "\n";
			textArea.setText(text);
			textField.setText(null);
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	
	
	
}

public class Test02 {

	
	public static void main(String[] args) {
		new TextApp();
	}
	
}
