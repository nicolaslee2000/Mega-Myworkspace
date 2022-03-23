package day12override;
//super keyword

class Parent{
	int x;
	Parent (int x){
		this.x = x;
	}
}
class Child extends Parent{
	Child (int x){
		super(x);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Child c = new Child(10); 
	}
}
