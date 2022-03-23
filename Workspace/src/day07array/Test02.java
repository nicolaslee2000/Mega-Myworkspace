package day07array;

import java.util.Arrays;

public class Test02 {
//foreach
	public static void main(String[] args) {
		char[] names = {'a','b','c'};
		
		for (int i = 0; i < names.length ; i++) {
			names[i] = 'd';
		}
		//for each only copies the value of name, but cannot change each elements
		for(char name: names) {
			name = 'd';
		}
		System.out.println(Arrays.toString(names));
	}
}
