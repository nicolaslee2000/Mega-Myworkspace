package day05;

import java.util.Scanner;
//Date getTime(): It is used to return a
//Date object representing this
//Calendar's time value.
import java.util.*;




public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 태어난 달을 입력 받고,
		 * 그 달의 최대 일수를 출력하세요.
		 * 또한 계절도 출력하세요.
		 * 
		 * < 출력 예 >
		 * 태어난 달 : 11
		 * 11월은 30일까지 있습니다!
		 * 겨울에 태어나셨네요!
		 * 
		 * 태어난 달 : 5
		 * 5월은 31일까지 있습니다!
		 * 봄에 태어나셨네요!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("month of birthdate");
		int month = sc.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("Born on " + month);
			System.out.println(month+ " is until" + 31);
			break;
		
			
			
		default:
			break;
		}
		
		
		
		
	}
}
// Quiz02.java
