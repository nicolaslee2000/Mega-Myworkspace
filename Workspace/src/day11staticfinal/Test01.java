package day11staticfinal;

class Person {
	String name;
	int age;
	String tel;
	
	// 아무 값도 넣고 싶지 않을 때를 위한 기본 생성자
	public Person(){
		System.out.println("기본 생성자를 실행!");
	}
	
	// 이름만 넣고 객체 생성하고 싶을 때를 위한 생성자
	public Person(String name){ // 문자열을 1개 넣으면 
		this.name = name;  // name에 저장
		System.out.println("이름 저장 완료!");
	}
	
	// 이름, 나이만 넣고 객체 생성하고 싶을 때를 위한 생성자
	public Person(String name, int age){ // 문자열, 정수 넣으면 
		this.name = name; // 문자열은 name에
		this.age = age;  // 정수는 age에 저장
		System.out.println("이름, 나이 저장 완료!");
	}
	
	// 이름, 나이, 연락처를 모두 넣고 객체 생성하고 싶을 때를 위한 생성자
	public Person(String name, int age, String tel){ // 문자열, 정수, 문자열 넣으면
		this.name = name; // 첫 번째 문자열은 name에
		this.age = age;   // 정수는 age에 
		this.tel = tel;   // 두 번째 문자열은 tel에 저장
		System.out.println("이름, 나이, 연락처 저장 완료!");
	}
	
	// 확인하기 쉽게 printData() 만들자.
	public void printData() {
		System.out.println("====" + this + "====");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age + "세");
		System.out.println("연락처 : " + this.tel);
		System.out.println();
	}
}

public class Test01 {
	public static void main(String[] args) {
		Person[] p = new Person[4];
		p[0] = new Person(); // 기본 생성자를 실행!
		p[1] = new Person("김피카츄"); // 이름 저장 완료!
		p[2] = new Person("이푸린", 10); // 이름, 나이 저장 완료!
		p[3] = new Person("박라이츄", 25, "010-1111-2222"); // 이름, 나이, 연락처 저장 완료!
		
		for(Person pp : p) {
			pp.printData();
		}
	}
}