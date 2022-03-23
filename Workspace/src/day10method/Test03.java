package day10method;

class A {

    public int method(Object o) {
        return 1;
    }
    public int method(A a) {
        return 2;
    }
}

class AX extends A {

    public int method(A a) {
        return 3;
    }
    public int method(AX ax) {
        return 4;
    }
}

public class Test03{
	public static void main(String[] args) {
		Object o = new A();
	    A a1 = new A();
	    A a2 = new AX();
	    AX ax = new AX();
	    
	    System.out.println(a1.method(o));  	
	    System.out.println(a2.method(a1));	
	    System.out.println(a2.method(o));
	    System.out.println(a2.method(ax));
	   
//	    System.out.println(a2 instanceof AX);
//	    System.out.println(a2 instanceof A);
//	    System.out.println(o.getClass());
//	    System.out.println(a1.getClass());
//	    System.out.println(a2.getClass());
//	    System.out.println(ax.getClass());
	}
}


