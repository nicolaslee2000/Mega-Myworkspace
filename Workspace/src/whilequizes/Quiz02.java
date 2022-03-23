package whilequizes;

public class Quiz02 {
	public static void main(String[] args) {
		// 30 + 31 + 32 + 33 + ... + 100 의 결과를 출력하세요.
		// 4615가 나오면 정답.
		int num = 30;
		int sum = 0;
		while (num<=100) {
			sum += num;
			num ++;
		}
		System.out.println(sum);
	}
}
// Quiz03.java
