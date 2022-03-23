package day10method;

class Person {
	String name; 
	int age;
	
	void printData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(isAdult()?"adult":"minor");
		
	}
	void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	boolean isAdult() {
		return age >=20;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setData("Nick", 20);
		p2.setData("Jack",10);
		p1.printData();
		p2.printData();
		
		
	}
}
