package day07array;

import java.util.Scanner;

/*
 * double�� 4ĭ¥�� �迭�� �����ϰ� 
 * Scanner�� ����Ͽ� �� ���Ҹ� �Է� ����
 * �Է� �� ��� ���Ҹ� ���
 *   a[0] = sc.nextDouble();
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		double[] a = new double[4];
		for(int i = 0; i < a.length; ++i) {
			System.out.print((i+1) + "�� �Ǽ� : ");
			a[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		
	}
}









