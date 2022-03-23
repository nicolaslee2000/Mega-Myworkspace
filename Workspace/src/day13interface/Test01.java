package day13interface;

class RedPotion implements Item{
	@Override
	public String description() {
		
		return "take when ouch";
	}
	@Override
	public void use() {
		System.out.println("yum");
		
	}
}


public class Test01 {
	public static void main(String[] args) {
		Item item1 = new RedPotion();
		System.out.println(new RedPotion().description());
	}
}
