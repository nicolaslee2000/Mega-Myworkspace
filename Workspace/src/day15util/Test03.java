package day15util;

import java.util.ArrayList;
import java.util.List;

//collection
/*
 * disadvantage of arry
 * fixed size
 * linear structure
 * Continuous structure
 * 
 * List, set, map
 * can store elements infinitely
 * stores only objects
 * 
 * 1. List
 * - interface of util package
 * 
 * classes: ArrayList, LinkedLIst, Vector, Stack...
 * - index o
 * - repeated elements
 * 
 * 2. Set
 * classes: HashSet, TreeSet
 * - no index, no repeated elements
 * 
 * 3. Map
 * Classes: HashMap, TreeMap
 * - no index, store data as key and value pair
 */
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new Person("Nick",10));
		
		System.out.println(list);
		
		for(Object e: list) {
			System.out.println(e);
		}
		
		//get element
		Object o = list.get(0);
		System.out.println(o);
		
		//insert element add(int index, Object element)
		list.add(0, new Person("NI", 10));
		System.out.println(list);
		
		//change element set(int index, Object new element)
		list.set(0, "zzz");
		System.out.println(list);
		
		//delete element Object remove(index), boolean remove(Object element)
		o = list.remove(2);
		System.out.println(list);
		System.out.println(o);
		System.out.println(list.remove((Integer) 10));
		System.out.println(list);
		int[] arry = new int[]{10,20,30};
		//isempty, size, addall
		List list3 = List.of(arry);
		list.addAll(list3);
		System.out.println(list);
		list3 = List.of(10,20,30,40,"dh");
		System.out.println(list3);
		//contains, indexof, clear
	}
}
