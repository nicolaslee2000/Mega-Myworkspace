package day16;

import java.util.*;

//map
public class Test03 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("Nick", 10);
		Object o;
		o=map.get("Nick");
		System.out.println(o);
		
		Set<String> keys = map.keySet();
		for(String s :keys) {
			System.out.println(s);
		}
	}
}
