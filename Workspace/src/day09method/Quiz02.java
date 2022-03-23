package day09method;
class Calc {
	/*
	 * calc();
	 * argument: int, int, string
	 * calculate according to argument: string: +,-,*,/
	 * if wrong argument then print "wrong operator"
	 * return: calculated value, if wrong operator: 0
	 * 
	 * getRandomName()
	 * no argument
	 * choose random name from an array of 4
	 * return: chosen name
	 * 
	 * 
	 * greet()
	 * argument: string name, int age
	 * print accordingly weather person is adult or not
	 * return: x
	 * 
	 * get multipleTable()
	 * argument: int num
	 * print string of table of corresponding argument
	 * return: string created
	 */
	double calc(int a, int b, char op) {
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return (double)(a)/b;
		default:
			System.out.println("wrong operator");
			return 0.0;
		}
	}
	
	String getRandomName(){
		String[] names = {"Nick", "Jack", "Senna", "Hannah"};
		return names[(int)(Math.random()*4)];
	}
	void greet(String name, int age){
		if(age>=20) {
			System.out.println("Hi " + name + ", you can drink beer!");
		}
		else {
			System.out.println("opps " + name +" "+ (20-age) +"years till you can drink beer..");
		}
	}
	String multipleTable(int num) {
		String table = "Multiple of " + num;
		for (int i = 1; i<10; i++) {
			table += "\n" + num + "X" + i + "=" + num*i;
		}
		
		return table;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.calc(20,50,'/'));
		System.out.println(c.calc(30, 5, '-'));
		System.out.println(c.getRandomName());
		System.out.println(c.getRandomName());
		c.greet("Nick", 20);
		System.out.println(c.multipleTable(3));
		System.out.println(c.multipleTable(9));
		
	}
}
