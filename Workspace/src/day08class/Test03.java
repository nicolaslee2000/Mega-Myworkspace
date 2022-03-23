package day08class;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pokemon[] pokemons = new Pokemon[2];
		
		for (int i = 0; i<pokemons.length;i++) {
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("HP: ");
			int hp = sc.nextInt();
			pokemons[i] = new Pokemon(name,hp);
			pokemons[i].printAllInfo();
		}
		
		System.out.println("Name: " + Pokemon.getMaxHp(pokemons).name + "Hp: " + Pokemon.getMaxHp(pokemons).hp);
		sc.close();
		
	}
}
