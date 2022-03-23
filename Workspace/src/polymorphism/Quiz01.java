package polymorphism;
/*
 * < Sniper VS Tank >
 * - ���ݼ�, ��ũ �� ĳ���� �� �ƹ��ų� �����ϰ� 2�� ����
 *   (��ũ vs ��ũ, �� vs ��, �� vs ��)
 * - �� ��ü�� ���� ���� ������ ���� ������ �ݺ�
 * - ù��°, Ȥ�� �ι�° �÷��̾ �̰���� ������ ���� ���! 
 *  e.g. �÷��̾�1(��ũ)�� �¸�!
 */

abstract class Unit { // �θ� Ŭ����
	String name;
	int hp, att; // ü��, ���ݷ�
	
	
	public Unit() {}
	public Unit(String name) {
		this.name = name;
	}
	public Unit(String name, int hp, int att) {
		this.name = name;
		this.hp = hp;
		this.att = att;
	}
	abstract public void attack(Unit enemy);
	
	int getHp() {
		return hp;
		
	}
	
	static public void battle() {
		Unit[] players = new Unit[]{addRandomUnit(),addRandomUnit()};
		int rounds = 1;
		System.out.println(players[0].name + " vs " + players[1].name + "\n-------------");
		while(true) {
					
					System.out.printf("Round%d!%n",rounds);
					players[0].attack(players[1]);
					players[1].attack(players[0]);
					
					
					if(players[0].hp<=0 && players[1].hp<=0) {
						System.out.println("Both players dead!");
						break;
					}
					else if (players[0].hp<=0) {
						System.out.println("P2 "+ players[1].name + " wins!");
						break;
					}
					else if (players[1].hp<=0){
						System.out.println("P1 "+ players[0].name + " wins!");
						break;
					}
					System.out.println(players[0].getHp());
					System.out.println(players[1].getHp());
					rounds += 1;
				}
	}
	
	
	
	private static Unit addRandomUnit() {
		return Math.random()>0.5 ? new Sniper() : new Tank();
	}
}

class Sniper extends Unit { // �ڽ� Ŭ����
	// ��ü �����Ǹ�, �ڵ����� name�� "���ݼ�", hp�� 400, att�� 100
	Sniper(){
		super("Sniper",400 , 100);
	}
	
	
		
	
	// attack �������̵� 
	public void attack(Unit enemy) {
		// 1. 10% Ȯ���� ��弦 (��� ���)
		// 2. ������ Ȯ���� ��Ÿ(�Ϲ� ����, ��� hp�� 100��ŭ ��´�.)
		
		if(Math.random()>0.9) {
			enemy.hp = 0;
			System.out.println("Headshot");
		}
		else {
			enemy.hp -= 100;
		}
		
	}



	
}

class Tank extends Unit {
	// ��ü �����Ǹ�, �ڵ����� name�� "��ũ", hp�� 4000, att�� 50
	Tank(){
		super("Tank", 4000, 50);
	}
	// attack �������̵� 
	// 1. 30% Ȯ���� ����� hp 30% ����
	// 2. ������ Ȯ���� ��Ÿ(�Ϲ� ����, ��� hp�� 50��ŭ ��´�.)
	public void attack(Unit enemy) {
		
		if(Math.random()>0.7) {
			enemy.hp *= 0.7;
			System.out.println("Fire in the hole");
		}
		else {
			enemy.hp -= 5;
		}
	
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		// �� Ÿ���� ��ü�� �����ϰ� 2�� ����
		// ���� �ݺ����� ����Ͽ� �� �� �ϳ��� ���� ������ ���θ� ����
		// ��, ���� ��ü�� �����ϸ� �ȵ�
		Unit.battle();
		
		
	}
}











