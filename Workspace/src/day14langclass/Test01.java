package day14langclass;

import java.lang.reflect.Field;

class Testc {
	int age = 10;
	private String name = "hi";
}

public class Test01 {
	public static void main(String[] args) {
		//java.lang.Object
		
		//important methods
		/*
		 * 1. int hashCode() unique number of an object
		 * 
		 * 2. class getClass
		 */
		Testc p1 = new Testc();
		Object j = new Object();
		
		Class clazz = p1.getClass();
		System.out.println(clazz.getName());
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getName());
			System.out.println(f.getType().getName());
			System.out.println(f.getModifiers());
		}
		
		/*
		 * 4. equals
		 */
	}
}
