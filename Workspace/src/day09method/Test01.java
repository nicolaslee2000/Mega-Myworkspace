package day09method;
//methods
class MyMethods{
	double getCircleArea(int radius) {
		return Math.pow(radius, 2)*Math.PI;
	}
}

public class Test01 {
	public static void main(String[] args) {
		MyMethods mm = new MyMethods();
		
		double res = mm.getCircleArea(10);
		System.out.println(res);
	}
	
	
	
}
