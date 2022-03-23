package day05;
import java.util.Scanner;

public class Test02 {
	//bloodtype switch case
	public static void main(String[] args) {
		String bloodType;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(("Bloodtype: "));
		bloodType = sc.next().toUpperCase();
		
		
		switch (bloodType) {
		case "A":
			System.out.println("can only donate to A");
			break;
			
		case "B": 
			System.out.println("can only donate to B");
			break;
		
		case "C":
			System.out.println("can donate to A,B,O,AB");
			break;
		case "AB":
			System.out.println("can donate to A and B");
			break;
		default:
			System.out.println("undefined bloodtype");
			break;
		}
		
	}
	
	
}
