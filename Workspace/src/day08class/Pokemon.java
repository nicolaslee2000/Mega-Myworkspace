package day08class;
/*
 * name level hp(1000-3000)
 * an array of Pokemon with size of 5
 * level is random num between 1 and 10
 * hp is 80% 100% and 20% 200%
 * 
 * printout all info
 * 
 * print out pokemon of highest lvl
 * print out pokemon of highest hp
 *main method on Test03
 * 
 */
class Pokemon {
	String name;
	int hp;
	int level;
	
	
	Pokemon (String name, int hp){
		this.name = name;
		this.hp = Math.random()>0.8 ? hp*2 : hp;
		this.level = (int)(Math.random()*9+1);
	}
	
	void printAllInfo() {;
		System.out.println("name: " + name);
		System.out.println("HP: " + hp);
		System.out.println("Level: " + level);
	}
	static Pokemon getMaxLvl(Pokemon[] pk) {
		Pokemon k = pk[0];
		
		for (Pokemon p:pk) {
			if(p.level > k.level) {
				k = p;
			}
		}
		return k;
		
	}
	static Pokemon getMaxHp(Pokemon[] pk) {
		Pokemon k = pk[0];
		
		for (Pokemon p:pk) {
			if(p.hp > k.hp) {
				k = p;
			}
		}
		return k;
		
	}
	
}
