package day07array;

import java.util.Scanner;

/*
 * double형 4칸짜리 배열을 생성하고 
 * Scanner를 사용하여 각 원소를 입력 받음
 * 입력 후 모든 원소를 출력
 *   a[0] = sc.nextDouble();
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		double[] a = new double[4];
		for(int i = 0; i < a.length; ++i) {
			System.out.print((i+1) + "번 실수 : ");
			a[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		
	}
}









