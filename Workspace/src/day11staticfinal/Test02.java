package day11staticfinal;

class Person2 { // Test02.java의 Person2 클래스 그대로 가져옴!
	String name;
	int age;
	String tel;
	
	public Person2(){
		this(null, 0, null); // 매개변수 3개(String, int, String)짜리 생성자, 즉, 4번째 생성자를 실행해서 초기화하겠다는 의미
	}
	
	public Person2(String name){  
//		this.name = name;  
		this(name, 0, null); // 매개변수 3개짜리 생성자, 즉, 4번째 생성자를 실행해서 초기화하겠다는 의미
							 // 대신, 자신이 받아 온 name의 값을 그대로 4번 생성자에 넘겨줌
	}
	public Person2(int age) {
		this.age = age;
	}
	public Person2(String name, int age){ 
//		this.name = name; 
//		this.age = age;  
		this(name, age, null); // 매개변수 3개짜리 생성자, 즉, 4번째 생성자를 실행해서 초기화하겠다는 의미
		 					   // 대신, 자신이 받아 온 name과 age 값을 그대로 4번 생성자에 넘겨줌
	}
	
	public Person2(String name, int age, String tel){
		this.name = name; 
		this.age = age;  
		this.tel = tel;   
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