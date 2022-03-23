package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("bb.txt");
			int i;
	        // Holds true till there is nothing to read
	        while ((i = f.read()) != -1) {
	 
	            // Print all the content of a file
	            System.out.print((char)i);
			}
			
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
