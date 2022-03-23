package day05;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//quiz1 take input n1 and n2. output n1 and n2, if both of same value output same
		Scanner sc = new Scanner(System.in);
		System.out.println("type n1");
		int n1 = sc.nextInt();
		System.out.println("type n2");
		int n2 = sc.nextInt();
		System.out.println(n1 + " " + n2);
		if (n1 == n2) {
			System.out.println("same");
		}
		
		//quiz2 
		int kr, en, ma; // 국, 영, 수 점수를 저장할 변수
		double avg;     // 평균 저장할 변수
		
		System.out.println("grade kr");
		kr = sc.nextInt();
		System.out.println("grade en");
		en = sc.nextInt();
		System.out.println("grade ma");
		ma = sc.nextInt();
		
		avg = (kr + en + ma)/3.0;
		if (avg>90.0) {
			System.out.println("A");
		}
		else if (avg > 80.0 ) {
			System.out.println("A");
		}
		else if (avg > 70.0) {
			System.out.println('C');
		}
		else if (avg > 60.5) {
			System.out.println('D');
		}
		else {
			System.out.println("fail");
		}
		System.out.println("Average: " + avg);
		
		
		//quiz 3 take a num and output weather factor of 2, 3 or 5]
		
		System.out.println("check if your number is factor of 2, 3 or 5");
		int num = sc.nextInt();

		String message = "";
		
		if (num%2==0) {
			message += "factor of 2";  
		}
		if (num%3==0) {
			message += "\nfactor of 3";
		}
		if (num%5 == 0) {
			message += "\nfactor of 5";
		}
		if (num%2 != 0&& num%3!= 0 && num%5 != 0) {
			System.out.println("just a number");
		} else {
			System.out.println(message); }
		
		//quiz 4 take age and height as input, output name and number of available rides
		System.out.println("your age");
		int age = sc.nextInt();
		System.out.println("height");
		double height = sc.nextInt();
		int count = 0;
		String namesofRides = "";
		
		if (height > 80 && height < 200) {
			namesofRides += "merry go around";
			count += 1;
		}
		if (age >15 && height > 110) {
			namesofRides += "\nghosthouse";
			count += 1;
		}
		if (age >13 && age < 60 && height > 140) {
			namesofRides += "\nrollercoaster";
			count += 1;
		}
		if (age > 10 && height > 130) {
			namesofRides += "\ndrop";
			count += 1;
		}
		System.out.println(namesofRides);
		System.out.println("number of av. rides: " + count);
		
	}
}
