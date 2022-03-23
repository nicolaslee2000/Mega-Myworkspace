package day14langclass;
//wrapper class
public class Test02 {
	public static void main(String[] args) {
		Object[] arr = {1, 3/4, "ACB", false, 10L};
		
		for(Object o:arr) {
			System.out.println(o);
		}
	}
}
