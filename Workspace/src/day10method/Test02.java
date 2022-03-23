package day10method;
//method overloading

class Champ{
	String name;
	int level;
	int hp;
	
	void setData(String n) {
		name = n;
		printData();
	}
	
	void setData(String n, int lvl) {
		this.setData(n);
		level = lvl;
		printData();
	}
	
	void setData(String n, int lvl, int hp) {
		this.setData(n,lvl);
		this.hp = hp;
		printData();
	}
	
	void printData() {
		
		System.out.println(name + level + hp);
	}
}

public class Test02 {
	public static void main(String[] args) {
		Champ[] p = new Champ[3];
		p[0] = new Champ();
		p[1] = new Champ();
		p[2] = new Champ();
		p[0].setData("Nick");
		p[1].setData("Nick",10);
		p[2].setData("Nick",20,3000);
	}
}
