package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("bb.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String s;
		
		while(reader.ready()) {
			s = reader.readLine();
			
			
			System.out.println(s);
		}
		
		reader.close();
		file.close();
	}
}
