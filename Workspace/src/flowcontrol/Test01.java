package flowcontrol;

public class Test01 {
	//breaking out of nested loops
	
	public static void main(String[] args) {
		outerloop: 
			
		for (int i = 0; i< 10 ;i++) {
			System.out.println(i);
			for (int b = 0; b<20; b+=2) {
				System.out.println(b);
				if (b == 14 && i == 6) {
					break outerloop;
				}
			}
		}
		System.out.println("hi");
		
	}
}
