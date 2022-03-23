package day16;
import java.util.*;
//make English dictionary

public class Quiz01 {
	public static void main(String[] args) {
		TreeMap<String, String> dictionary = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			Set<String> keys = dictionary.keySet();
			System.out.println("\nMenu\n1. add new word\n2. look up all words\n3. search word\n4. quiz\n0. exit");
			switch (sc.nextInt()) {
			case 0: {
				System.out.println("exiting...");
				System.exit(0);
				break;
			}
			case 1: {
				System.out.println("type word: ");
				String word = sc.next();
				System.out.println("meaning: ");
				String meaning = sc.next();
				dictionary.put(word,meaning);
				break;
			}
			case 2: {
				for(String i:keys) {
					System.out.println(i + ": " + dictionary.get(i));
				}
				break;
			}
			case 3: {
				System.out.println("search definition for: ");
				String word = sc.next().trim();
				if(dictionary.containsKey(word)) {
					System.out.println(word + ": " + dictionary.get(word));
				}
				else {
					System.out.println("word not found");
				}
				break;
			}
			case 4: {
				Object[] q = dictionary.keySet().toArray();
				int randomq = (int)(Math.random()*dictionary.keySet().size());
				
				System.out.println(q[randomq] + ": ?");
				String ans = sc.next().trim();
				if(ans.equals(dictionary.get(q[randomq]))) {
					
					System.out.println("correct!");
				}
				else {
					System.out.println("wrong");
				}
				break;
			}
			default:
				continue;
			}
		}
		
		
	}
}
