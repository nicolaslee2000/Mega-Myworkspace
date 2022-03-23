package day18;

import java.io.FileReader;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("bb.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		file.close();
	}
}
