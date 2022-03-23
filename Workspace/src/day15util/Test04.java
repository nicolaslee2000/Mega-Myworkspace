package day15util;

import java.util.ArrayList;

//generic
interface Transportation{
	
}
class Bus implements Transportation{
	
}
class SomeClass<T extends Transportation>{
	T aa() {
		return null;
	}
	void bb(T t) {
		
	}
}
//class Person1{
//	String name;
//	int age;
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//}
//public class Test04 {
//	public static void main(String[] args) {
//		//SomeClass<String> c1 = new SomeClass();
//		SomeClass<Bus> c2 = new SomeClass();
//		
//		//adding generics to arraylist
//		ArrayList<Person1> list = new ArrayList();
//		list.add(new Person1("Nick",10));
//		list.add(new Person1("Jack",310));
//		for(Person1 o: list) {
//			o.age++;
//		}
//		
//		
//	}
//}
