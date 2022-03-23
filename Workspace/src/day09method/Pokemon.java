package day09method;
/*
 *
 */
class Pokemon {
	String name;
	String skill;
	double hp;
	double att;
	int level;
	
	void hatch(String name, String skill) {
		this.name = name;
		this.skill = skill;
		this.hp = Math.random()*120 + 80;
		this.att = this.hp > 140 ? Math.random()*10+5 : Math.random()*5+20;
		this.level = 1;
		
	}
	
	String greet() {
		return "Hi, I am " + name;
	}
	
	String getInfo() {
		return "Current Info:"
				+ "\nHP: "+ hp
				+ "\nAtt: "+ att
				+ "\nLevel: "+ level
				+ "\nSkill: "+skill;
	}
	
	String levelUp(int point) {
		level+= point;
		hp *= Math.pow(1.15, point);
		att *= Math.pow(1.1, point);
		return name + "has leveled up to" + level + "\n"+ getInfo();
	}
	
	
}
