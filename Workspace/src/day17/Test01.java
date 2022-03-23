package day17;

import javax.swing.JOptionPane;

//1.compile error
/*
 * 2. runtime error
 * 
 * exception class
 */
public class Test01 {
	public static void main(String[] args) {
		try {	
			String s = JOptionPane.showInputDialog("integer");
			int n1 = Integer.parseInt(s);
			s = JOptionPane.showInputDialog("integer2");
			int n2 = Integer.parseInt(s);
			System.out.println(n1/n2);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "no integer");
		} catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null	, e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			
			
		}
		
		
	}
}
