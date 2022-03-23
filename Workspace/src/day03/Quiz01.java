package day03;



public class Quiz01 {
	public static void main(String[] args) {
		//  여러분의 나이, 이름, 연락처, 키(실수형)를 
		//	변수를 사용하여 출력하세요. (변수 선언, 초기화 필수!)
		int age = 21;
		String name = "Nick";
		String contact = "0108889999";
		int height = 150;
		
		String msg = String.format("My name is %s, I am %d years old, my phone number is %s and my height is %d", name, age, contact, height);
		
		
		System.out.println(msg);
		System.out.printf("My name is %s, I am %d years old, my phone number is %s and my height is %d", name, age, contact, height);
		
		
		
		
	}
}
	