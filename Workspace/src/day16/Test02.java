package day16;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		Set<Integer> set;
		set = new TreeSet<>();
		while(set.size()<6) {
			set.add((int)(Math.random()*45+1));
		}
		System.out.println(set);
	}
}
