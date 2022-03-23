package day20gui;
/*
 * < GUI >
 * - java.awt 패키지, javax.swing 패키지
 * - 참고) fx 패키지를 더 많이 쓰긴함.. 
 * - 구성요소 
 *       1. 컴포넌트 (판, 버튼, 입력란 등의 화면의 구성요소)
 *          - 레고판 역할 : JPanel, JFrame
 *          - 레고블럭 역할 : JButton, JTextArea, JTable, ...
 * 
 *       2. 레이아웃 (컴포넌트를 어떻게 배치할 것이냐?)
 *          - 틀 역할 : GridLayout, FlowLayout, BorderLayout
 * 
 *       3. 이벤트 리스너 (컴포넌트와 유저간의 상호작용을 어떻게?)
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Test01 {
   public static void main(String[] args) {
      
      // 레고판 준비 
      JFrame frame = new JFrame("나의 첫 GUI!");  // 윈도우 창 만들기
      
      // 'X' 버튼 누르면 프로그램 종료
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
      // 창의 사이즈 
      frame.setSize(300, 800); // 가로, 세로

      // 창의 위치 (한 가운데로)
      frame.setLocationRelativeTo(null);
      // frame.setLocation(100, 200); // top, left
      
      
      // TODO 버튼 4개 만들기 
      JButton btn1 = new JButton("Nick");
      JButton btn2 = new JButton("Jack");
      JButton btn3 = new JButton("Dave");
      
      btn1.setBackground(Color.black);
      btn1.setForeground(Color.cyan);
      btn2.setBackground(Color.gray);
      btn2.setForeground(Color.pink);
      
      JPanel panel = new JPanel(); // 빈 레고판 만들기
      
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
      
      frame.add(panel); // frame에 panel 을 붙이기
      
      
      // 마지막에는 꼭! 이 창을 띄워야 화면에 보인다.
      frame.setVisible(true);
   }
}





