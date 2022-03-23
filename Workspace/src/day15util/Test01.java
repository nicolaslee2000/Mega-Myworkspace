package day15util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * java util package
 * calendar, collection framework
 */
public class Test01 {
	public static void main(String[] args) {
		Calendar cal = GregorianCalendar.getInstance(); //singleton class
		
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(dayofweek);
		//set()
		cal.set(Calendar.YEAR, 2021); 
		cal.set(Calendar.MONTH, 3); 
		
		//get date after 30 days
		cal = GregorianCalendar.getInstance();
		cal.add(Calendar.DATE,30);
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		//10years ago
		cal = GregorianCalendar.getInstance();
		cal.add(Calendar.YEAR, -10);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
	}
}
