package day12inheritance;
class Person{
	String name;
	String tel;

	public String toString() {
		return "Person [name=" + name + ", tel=" + tel + "]";
	}
	
}

class Teacher extends Person{
	String subject;
	
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", name=" + name + ", tel=" + tel + "]";
	}
}
class Employee extends Person{
	String department;
	int salary;
}

public class test01 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Nick";
		t.tel = "00000";
		t.subject = "Math";
		System.out.println(t);
		
	}
}
