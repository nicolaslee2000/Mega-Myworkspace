package day13interface;

import java.util.Scanner;

public interface Transportation {
	int ADULT_CHARGE = 1250;
	int MINOR_CHARGE = 700;
	
	int getCharge(int age, int km); 
}
