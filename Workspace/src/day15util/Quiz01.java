package day15util;

import java.util.ArrayList;
import java.util.Scanner;

class Nation{
	String nation;
	String capital;
	int population;
	public Nation(String nation, String capital, int population) {
		super();
		this.nation = nation;
		this.capital = capital;
		this.population = population;
	}
	@Override
	public String toString() {
		return "Nation [nation=" + nation + ", capital=" + capital + ", population=" + population + "]";
	}
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<Nation> nations = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Menu\n1: Add a country\n2: List all countries\n3. Seach for country\n4. Exit");
			int userin = sc.nextInt();
			switch (userin) {
			case 4: {
				System.out.println("exiting...");
				System.exit(0);
			}
			case 1: {
				System.out.println("Country name: ");
				String nation = sc.next();
				System.out.println("Capital: ");
				String capital = sc.next();
				System.out.println("Population: ");
				int population = sc.nextInt();
				nations.add(new Nation(nation,capital,population));
				break;
			}
			case 2: {
				for(Nation i:nations) {
					System.out.println(i);
				}
			
				break;
				
			}
			
	
			case 3:{
				
				String search = sc.next();
				boolean find = false;
				for(Nation i:nations) {
					if((i.nation.toLowerCase()).equals(search.toLowerCase())) {
						System.out.println("your country exists");
						find=true;
						break;
					}
					
				}
				if(find) {
					System.out.println("country not found");
				}
				break;
				
			}
			default:{
				System.out.println("select from option 1 to 4");
				continue;
			}
		}
		}
		
	}
}