package day19;
import java.io.*;
import java.nio.channels.FileChannel;

public class Test02 {
	 public static void main(String[] args)
		        
		    {
		 	long start, end;
		 	start = System.currentTimeMillis();
		        // Creating two channels one input and other output
		        // by creating two objects of FileChannel Class
		   
				try (FileChannel src = new FileInputStream("vid.mp4").getChannel();
						FileChannel dest =new FileOutputStream("copied.mp4").getChannel();
						
						
						){
					dest.transferFrom(src, 0, src.size());
					System.out.println("file copied");
				} catch(Exception e) {
					
				}
				
		        // Try block to check for exceptions
		     System.out.println(System.currentTimeMillis()-start);
				
		    }
}
