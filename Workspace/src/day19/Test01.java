package day19;

import java.io.*;

/*
 * origin.jpg copied to copied.jpg
 * byte type stream
 */
public class Test01 {
	public static void main(String[] args) {
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		
		try {
			fIn = new FileInputStream("PA220061.jpg");
			fOut = new FileOutputStream("copied.jpg");
			
//			int data;
//			while((data = fIn.read()) != -1) {
//				fOut.write(data);
//			}
			
			byte[] alldata = fIn.readAllBytes();
			fOut.write(alldata);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(fIn != null) fIn.close();
				if(fOut != null) fOut.close();
					
				
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
