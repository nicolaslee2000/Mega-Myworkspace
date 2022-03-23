package day16;
import java.util.*;
class Pokemon{
	String name;
	int level;
	public Pokemon(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", level=" + level + "]";
	}
	
}
public class Test04 {
	public static void main(String[] args) {
		TreeMap<String,Pokemon> map = new TreeMap<>();
		map.put("Pi", new Pokemon("Pi",20));
		map.put("Ri", new Pokemon("Ri",30));
		map.put("Zi", new Pokemon("Zi",40));
		
		System.out.println(map.get("Pi"));
	}
}
