package polymorphism;

class Super {

    public int method(Object o) {
        return 1;
    }

    public int method(Super a) {
        return 2;
    }
}

class Sub extends Super {

    public int method(Super a) {
        return 3;
    }

    public int method(Sub ax) {
        return 4;
    }
}
public class Test01 {

	public static void main(String[] args) {
	    Object o = new Super();
	    Super a1 = new Super();
	    Super a2 = new Sub();
	    Sub ax = new Sub();
	
	    System.out.println(a1.method(o));
	    System.out.println(a2.method(a1));
	    System.out.println(a2.method(o));
	    System.out.println(a2.method(ax));
	}
}



