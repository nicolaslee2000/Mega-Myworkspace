package day11staticfinal;

class Person {
	String name;
	int age;
	String tel;
	
	// �ƹ� ���� �ְ� ���� ���� ���� ���� �⺻ ������
	public Person(){
		System.out.println("�⺻ �����ڸ� ����!");
	}
	
	// �̸��� �ְ� ��ü �����ϰ� ���� ���� ���� ������
	public Person(String name){ // ���ڿ��� 1�� ������ 
		this.name = name;  // name�� ����
		System.out.println("�̸� ���� �Ϸ�!");
	}
	
	// �̸�, ���̸� �ְ� ��ü �����ϰ� ���� ���� ���� ������
	public Person(String name, int age){ // ���ڿ�, ���� ������ 
		this.name = name; // ���ڿ��� name��
		this.age = age;  // ������ age�� ����
		System.out.println("�̸�, ���� ���� �Ϸ�!");
	}
	
	// �̸�, ����, ����ó�� ��� �ְ� ��ü �����ϰ� ���� ���� ���� ������
	public Person(String name, int age, String tel){ // ���ڿ�, ����, ���ڿ� ������
		this.name = name; // ù ��° ���ڿ��� name��
		this.age = age;   // ������ age�� 
		this.tel = tel;   // �� ��° ���ڿ��� tel�� ����
		System.out.println("�̸�, ����, ����ó ���� �Ϸ�!");
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

public class Test01 {
	public static void main(String[] args) {
		Person[] p = new Person[4];
		p[0] = new Person(); // �⺻ �����ڸ� ����!
		p[1] = new Person("����ī��"); // �̸� ���� �Ϸ�!
		p[2] = new Person("��Ǫ��", 10); // �̸�, ���� ���� �Ϸ�!
		p[3] = new Person("�ڶ�����", 25, "010-1111-2222"); // �̸�, ����, ����ó ���� �Ϸ�!
		
		for(Person pp : p) {
			pp.printData();
		}
	}
}