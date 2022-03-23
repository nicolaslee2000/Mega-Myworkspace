package day16;


import java.util.*;

//set
/*
 * no index, no repeated elements
 * hashset,treeset
 * hashset: faster save and search
 * treeset: automatic sorting
 */
public class Test01 {
	public static void main(String[] args) {
		Set<Integer> set;
		set = new TreeSet<>();
		set.add(10);
		set.add(12);
		set.add(15);
		set.add(10);
		System.out.println(set);
	}
}
