package day19;
import java.io.*;

public class Quiz01 {
	public static void main(String[] args) {
		
		long start,end;
		start = System.currentTimeMillis();
		
		FileInputStream fIn = null;
		FileOutputStream fOut = null;
		
		try {
			fIn = new FileInputStream("vid.mp4");
			fOut = new FileOutputStream("copied.mp4");
			
//			int data;
//			while((data = fIn.read()) != -1) {
//				fOut.write(data);
//			
//			
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
		
		end = System.currentTimeMillis();
		System.out.println(start-end);
	}
}
