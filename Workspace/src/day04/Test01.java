package day04;
//bitwise operators


public class Test01 {
	/*
	 * &
	 * |
	 * ^
	 * ~
	 * >>
	 * <<
	 * >>>
	 * <<<
	 * >>=
	 * 
	 */
	public static void main(String[] args) {
		int n1 = 49; //110001
		int n2 = 29; //011101 
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		System.out.println(~n1);
		
		System.out.println(n1 >> 1);
		System.out.println(n1 >> 2);
		System.out.println(n1 >> 3);
		
		System.out.println(n1 << 1);
		System.out.println(n1 << 2);
		System.out.println(n1 << 3);
		
		
	}

	

	
	
}
