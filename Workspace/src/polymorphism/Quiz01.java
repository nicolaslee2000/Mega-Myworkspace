package polymorphism;
/*
 * < Sniper VS Tank >
 * - 저격수, 탱크 두 캐릭터 중 아무거나 랜덤하게 2개 생성
 *   (탱크 vs 탱크, 저 vs 탱, 저 vs 저)
 * - 두 객체가 서로 죽을 때까지 서로 공격을 반복
 * - 첫번째, 혹은 두번째 플레이어가 이겼는지 마지막 승자 출력! 
 *  e.g. 플레이어1(탱크)의 승리!
 */

abstract class Unit { // 부모 클래스
	String name;
	int hp, att; // 체력, 공격력
	
	
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

class Sniper extends Unit { // 자식 클래스
	// 객체 생성되면, 자동으로 name은 "저격수", hp는 400, att는 100
	Sniper(){
		super("Sniper",400 , 100);
	}
	
	
		
	
	// attack 오버라이드 
	public void attack(Unit enemy) {
		// 1. 10% 확률로 헤드샷 (상대 즉사)
		// 2. 나머지 확률로 평타(일반 공격, 상대 hp를 100만큼 깎는다.)
		
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
	// 객체 생성되면, 자동으로 name은 "탱크", hp는 4000, att는 50
	Tank(){
		super("Tank", 4000, 50);
	}
	// attack 오버라이드 
	// 1. 30% 확률로 상대의 hp 30% 감소
	// 2. 나머지 확률로 평타(일반 공격, 상대 hp를 50만큼 깎는다.)
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
		// 두 타입의 객체를 랜덤하게 2개 생성
		// 무한 반복문을 사용하여 둘 중 하나가 죽을 때까지 서로를 공격
		// 단, 죽은 객체가 공격하면 안됨
		Unit.battle();
		
		
	}
}











