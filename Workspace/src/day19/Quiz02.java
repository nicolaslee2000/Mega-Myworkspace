package day19;

import javax.swing.JOptionPane;

class Thread1 extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("oh hi mark");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("2X"+i+"="+i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		while(true) {
			String msg = JOptionPane.showInputDialog("1 for starting himark 2 for timetables");
			Thread1 t1 = new Thread1();
			if(msg.equals("1")) {
				
				t1.start();
			}
			else if(msg.equals("2")) {
				new Thread2().start();
			} else {
				System.out.println("error");
				break;
			}
			if(t1.currentThread().isAlive()) {
				for(int i = 0;i<10;i++) {
					
				}
			}
			
		}
		
		
	}
}
