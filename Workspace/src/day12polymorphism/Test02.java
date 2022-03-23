package day12polymorphism;

abstract class Pokemon {
	String level;
	abstract void attack();
}
class Pikachu extends Pokemon {
	void attack() {
		System.out.println("pi attack");
	}
}
class Raichu extends Pokemon {
	void attack () {
		System.out.println("ri attack");
	}
	String mic = "wow";
}
public class Test02 {
	public static void main(String[] args) {
		Pokemon p;
		p = new Pikachu();
		p.attack();
		p = new Raichu();
		p.attack();
		//downcasting
		System.out.println(((Raichu)p).mic);
		
	}
}
