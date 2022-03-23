package day19;

import javax.swing.JOptionPane;

class TimeTable{
	
	void Questions(int num) {
		JOptionPane.showMessageDialog(null, "Ready?");
		Timer t = new Timer();
		t.start();
		for(int i=0;i<num;i++) {
			int rand1 = (int)(Math.random()*9+1);
			int rand2 = (int)(Math.random()*9+1);
			int ip = Integer.parseInt(JOptionPane.showInputDialog(rand1+"X"+rand2 + "= ?"));
			System.out.println(ip==rand1*rand2?"correct!":"wrong");
		}
		t.exit();
		System.out.println(t.i+"seconds passed!");
	}
}

class Timer extends Thread{
	int i=0;
	private boolean exit;
	Timer(){
		exit = false;
	}
	@Override
	public void run() {
		
		while(exit!=true) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
	public void exit() {
		exit = true;
	}
	
}
public class Quiz03 {
	public static void main(String[] args) {
		new TimeTable().Questions(5);
	}
}
