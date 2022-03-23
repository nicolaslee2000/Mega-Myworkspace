package day18;

import java.io.FileReader;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("bb.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		sc.close();
		file.close();
	}
}
