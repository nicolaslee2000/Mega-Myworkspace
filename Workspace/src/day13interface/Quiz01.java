package day13interface;

import java.util.Scanner;

class Bus implements Transportation{
	@Override
	public int getCharge(int age, int km) {
		
		return age<18 ? (int)((MINOR_CHARGE + km*10)*0.8) : ADULT_CHARGE + km*10;
		
	}
}
class Taxi implements Transportation{
	@Override
	public int getCharge(int age, int km) {
		
		return km<=10 ? 4000 : 4000+(km-10)*100;
	}
}

class Subway implements Transportation{
	@Override
	public int getCharge(int age, int km) {
		return age<18 ? (MINOR_CHARGE + km*5) : ADULT_CHARGE + km*10;
	}
}
class Train implements Transportation{
	@Override
	public int getCharge(int age, int km) {
		return age<18 ? (int)((15000+km*33.33 + km*10)*0.5) :(int)(15000+km*33.33 + km*10);
	}
}

class CalcCheapest{
	public static String calc(int age, int km) {
		Transportation[] transportations = {new Bus(), new Taxi(), new Subway(), new Train()};
		int cheapest = transportations[0].getCharge(age,km);
		String msg = "Cheapest mode of transportation is " + transportations[0].getClass().getSimpleName() + "at " + transportations[0].getCharge(age, km) + "Won";
		for(Transportation i : transportations) {

			if(i.getCharge(age, km)<cheapest) {
				cheapest = i.getCharge(age, km);
				msg = "Cheapest mode of transportation is " + i.getClass().getSimpleName() + " at " + i.getCharge(age, km) + "Won";
			}
		
			
		}
		
		
		return msg;
	}

	
	
	
	
}

public class Quiz01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("cheapest");
		System.out.println(CalcCheapest.calc(sc.nextInt(),sc.nextInt()));
		
		System.out.println("take your mean of transportation");
		Transportation t;
		switch (sc.next().toLowerCase()) {
		case "bus":
			t = new Bus();
			break;
		case "taxi":
			t = new Taxi();
			break;
		case "subway":
			t = new Subway();
			break;
		case "train":
			t = new Train();
			break;
		default:
			t = null;
			break;
		}
		if(t!=null) {
			System.out.println("Type age and km");
			System.out.println("your charge will be: "+ t.getCharge(sc.nextInt(),sc.nextInt()) + "Won");
		} else {
			System.out.println("unknown mode of transportation");
		}
		
	}
}
