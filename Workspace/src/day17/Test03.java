package day17;

import java.io.PrintWriter;

public class Test03 {
	public static void main(String[] args) throws Exception{
		
		for(int i = 2;i<10;i++) {
			PrintWriter pw = new PrintWriter(i + "timetable.txt");
			
			for(int a = 1; a<9;a++) {
				pw.println(i+"X"+a + "="+ i*a);
			}
			pw.close();
		}
	}
}
