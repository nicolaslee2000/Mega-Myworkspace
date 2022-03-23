package day18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/*
 * io
 * input and output stream
 */
public class Test01 {
	public static void main(String[] args) {
		//creating outputstream to bb.txt
		FileWriter fw;
		try {
			fw = new FileWriter("bb.txt");
			fw.write("hi");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
