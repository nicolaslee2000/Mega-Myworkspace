package day03;



public class Quiz01 {
	public static void main(String[] args) {
		//  �������� ����, �̸�, ����ó, Ű(�Ǽ���)�� 
		//	������ ����Ͽ� ����ϼ���. (���� ����, �ʱ�ȭ �ʼ�!)
		int age = 21;
		String name = "Nick";
		String contact = "0108889999";
		int height = 150;
		
		String msg = String.format("My name is %s, I am %d years old, my phone number is %s and my height is %d", name, age, contact, height);
		
		
		System.out.println(msg);
		System.out.printf("My name is %s, I am %d years old, my phone number is %s and my height is %d", name, age, contact, height);
		
		
		
		
	}
}
	