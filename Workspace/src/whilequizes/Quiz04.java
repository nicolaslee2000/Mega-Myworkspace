package whilequizes;

public class Quiz04 {
	public static void main(String[] args) {
		// 500 이하까지 피보나치 수열을 출력하라 (1부터 시작한 앞 두 수의 합이 다음 수)
		// 1 1 2 3 5 8 13 21 34 .. 
		int num1 = 1;
		int num2 = 1;
		int fib =  1;
		
		while(num1<=500) {
			//num1 is second previous fibonacci number, num2 is the previous fibonacci number
			System.out.println(num1);
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
			
			
		}
		
	}
}
