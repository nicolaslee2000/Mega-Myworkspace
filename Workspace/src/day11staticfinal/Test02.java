package day11staticfinal;

class Person2 { // Test02.java�� Person2 Ŭ���� �״�� ������!
	String name;
	int age;
	String tel;
	
	public Person2(){
		this(null, 0, null); // �Ű����� 3��(String, int, String)¥�� ������, ��, 4��° �����ڸ� �����ؼ� �ʱ�ȭ�ϰڴٴ� �ǹ�
	}
	
	public Person2(String name){  
//		this.name = name;  
		this(name, 0, null); // �Ű����� 3��¥�� ������, ��, 4��° �����ڸ� �����ؼ� �ʱ�ȭ�ϰڴٴ� �ǹ�
							 // ���, �ڽ��� �޾� �� name�� ���� �״�� 4�� �����ڿ� �Ѱ���
	}
	public Person2(int age) {
		this.age = age;
	}
	public Person2(String name, int age){ 
//		this.name = name; 
//		this.age = age;  
		this(name, age, null); // �Ű����� 3��¥�� ������, ��, 4��° �����ڸ� �����ؼ� �ʱ�ȭ�ϰڴٴ� �ǹ�
		 					   // ���, �ڽ��� �޾� �� name�� age ���� �״�� 4�� �����ڿ� �Ѱ���
	}
	
	public Person2(String name, int age, String tel){
		this.name = name; 
		this.age = age;  
		this.tel = tel;   
	}
	
	// Ȯ���ϱ� ���� printData() ������.
	public void printData() {
		System.out.println("====" + this + "====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age + "��");
		System.out.println("����ó : " + this.tel);
		System.out.println();
	}
}

public class Test02{
	public static void main(String[] args) {
		Person2[] people = {
				new Person2(),
				new Person2("Nick"),
				new Person2(20),
				new Person2("Jack,25")
		};
		for (Person2 i:people) {
			i.printData();
		}
	}
}