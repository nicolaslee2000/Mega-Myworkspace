package day10method;
class Z{
	public int method(Z a) {
		return 1;
	}
}
class Y extends Z{
	public int method(Y a) {
		return 2;
	}
}

public class Test04 {
	
	public static void main(String[] args) {		
		Y b = new Y();
		System.out.println(b.method(b));
	}
}
