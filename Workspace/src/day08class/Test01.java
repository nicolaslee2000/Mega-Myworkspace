package day08class;

public class Test01 {
	public static void main(String[] args) {
		Person p1, p2, p3;
		
		p1 = new Person();
		p2 = new Person();
		p3 = null;
		
		p1.name = "Nick";
		p1.age= 20;
		p2.name = "Jack";
		p2.age = 22;
		//p3.name = "Dick";
		p1.printData();
		p2.printData();
	}
	
	
}
