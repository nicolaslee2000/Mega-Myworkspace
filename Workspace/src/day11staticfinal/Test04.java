package day11staticfinal;
/*
 * static
 * static member: class member
 * non static member: instance member
 */

class A{
	static void aa() {
		System.out.println("hi");
	}
}
public class Test04 {
	public static void main(String[] args) {
		A a= new A();
		a.aa();
		A.aa();
	}
}
