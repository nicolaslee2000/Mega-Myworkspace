package day17;

import java.util.InputMismatchException;
import java.util.Scanner;
class CreateArr{
	int size = 0;
	int[] arry;
	
	Scanner sc = new Scanner(System.in);
	public void setSize(){
		
		System.out.println("Type size of your array");
		System.out.println("a");
		size = sc.nextInt();
		System.out.println("b");
		arry = new int[size];
	}
	public void setIndex() {
		System.out.println("type index");
		arry[sc.nextInt()] = 100;
	}
	public void print() {
		for(int i = 0; i < size; i++) {
			System.out.println(arry[i] + "at" + i);
		}
	}
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		CreateArr arr = new CreateArr();
		while(arr.size == 0) {
			try {
				arr.setSize();
			} catch(InputMismatchException e) {
				System.out.println("Type number");
				arr.sc.nextLine();
			} 
			catch(NegativeArraySizeException e) {
				System.out.println("negative index");
			} 
			catch(Exception e) {
				System.out.println("error");
			}
			finally {
				arr.print();
			}
			
		}
		while(true) {
			try {
				arr.setIndex();
			} catch(InputMismatchException e){
				System.out.println("type number");
			} catch(IndexOutOfBoundsException e) {
				System.out.println("index out of bound");
			} 
			finally {
				arr.print();
			}
		}
		
		
		
		
		
	}
}
