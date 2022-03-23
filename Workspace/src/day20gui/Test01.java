package day20gui;
/*
 * < GUI >
 * - java.awt ��Ű��, javax.swing ��Ű��
 * - ����) fx ��Ű���� �� ���� ������.. 
 * - ������� 
 *       1. ������Ʈ (��, ��ư, �Է¶� ���� ȭ���� �������)
 *          - ������ ���� : JPanel, JFrame
 *          - ����� ���� : JButton, JTextArea, JTable, ...
 * 
 *       2. ���̾ƿ� (������Ʈ�� ��� ��ġ�� ���̳�?)
 *          - Ʋ ���� : GridLayout, FlowLayout, BorderLayout
 * 
 *       3. �̺�Ʈ ������ (������Ʈ�� �������� ��ȣ�ۿ��� ���?)
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Test01 {
   public static void main(String[] args) {
      
      // ������ �غ� 
      JFrame frame = new JFrame("���� ù GUI!");  // ������ â �����
      
      // 'X' ��ư ������ ���α׷� ����
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
      // â�� ������ 
      frame.setSize(300, 800); // ����, ����

      // â�� ��ġ (�� �����)
      frame.setLocationRelativeTo(null);
      // frame.setLocation(100, 200); // top, left
      
      
      // TODO ��ư 4�� ����� 
      JButton btn1 = new JButton("Nick");
      JButton btn2 = new JButton("Jack");
      JButton btn3 = new JButton("Dave");
      
      btn1.setBackground(Color.black);
      btn1.setForeground(Color.cyan);
      btn2.setBackground(Color.gray);
      btn2.setForeground(Color.pink);
      
      JPanel panel = new JPanel(); // �� ������ �����
      
//      //layout
//      panel.setLayout(new GridLayout(2,2));
//      
//      panel.add(btn1);
//      panel.add(btn2);
      
      
      panel.setLayout(new BorderLayout());
      panel.add(btn1, BorderLayout.CENTER);
      panel.add(btn2, BorderLayout.SOUTH);
      
      //button eventlistener
      
      ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton button = (JButton)e.getSource();
			String text = button.getText();
			String message = null;
			message = text=="Nick"? "ohhinick": "ohhijack";
			
			JOptionPane.showMessageDialog(panel, message);
			
		}
	};
      
      btn1.addActionListener(listener);
      btn2.addActionListener(listener);
      
      frame.add(panel); // frame�� panel �� ���̱�
      
      
      // ���������� ��! �� â�� ����� ȭ�鿡 ���δ�.
      frame.setVisible(true);
   }
}





