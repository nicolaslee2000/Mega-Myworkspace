package day05;

import java.util.Scanner;
//Date getTime(): It is used to return a
//Date object representing this
//Calendar's time value.
import java.util.*;




public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * �¾ ���� �Է� �ް�,
		 * �� ���� �ִ� �ϼ��� ����ϼ���.
		 * ���� ������ ����ϼ���.
		 * 
		 * < ��� �� >
		 * �¾ �� : 11
		 * 11���� 30�ϱ��� �ֽ��ϴ�!
		 * �ܿ￡ �¾�̳׿�!
		 * 
		 * �¾ �� : 5
		 * 5���� 31�ϱ��� �ֽ��ϴ�!
		 * ���� �¾�̳׿�!
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
