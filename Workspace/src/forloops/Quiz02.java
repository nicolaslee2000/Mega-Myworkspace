package forloops;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 1 ~ 20 중 랜덤한 정수를 5번 출력 (중복 가능)
		// 2. 1 ~ 1000 중 11과 17의 공배수만 출력
		// 3. 2단 ~ 9단까지 모든 구구단을 출력
		
		//1. 
		for (int i = 0; i < 5; i++ ) {
			System.out.println((int)(Math.random() * 20 + 1));
		}
		
		//2.
		for (int i = 11*17; i < 1000; i += 11*17) {
			System.out.println(i
					);
			

		}
		
		//3.
		for (int a = 2; a < 10; a++) {
			System.out.println("---" + a + "---");
			for (int b = 1; b < 10; b++) {
				System.out.printf("%n%d X %d = %d%n", a, b, a*b);
			}
			
		}
		
		//4. this month calendar
		System.out.println("\nS\tM\tT\tW\tT\tF\tS\t");
		System.out.print("\t\t\t\t\t\t");
		for (int i = 1; i <= 31; i++) {
			
			if ((i+6)%7 == 0) {
				System.out.println(i);
			}
			else {
				System.out.print(i + "\t");
			}
		}
		
		
	}
}
