package whilequizes;

public class Quiz04 {
	public static void main(String[] args) {
		// 500 ���ϱ��� �Ǻ���ġ ������ ����϶� (1���� ������ �� �� ���� ���� ���� ��)
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
