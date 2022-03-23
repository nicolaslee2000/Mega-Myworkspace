package day18;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
class ReadTextAsString {
	   
	  public static String readText(String fileName)throws Exception
	  {
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    return data;
	  }
}

public class Test03 {
	public static void main(String[] args) {
		
	}
}
