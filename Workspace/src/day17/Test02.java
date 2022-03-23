package day17;

import java.util.Timer;

//unhandled exception
public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i<10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
