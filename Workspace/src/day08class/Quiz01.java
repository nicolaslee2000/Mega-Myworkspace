package day08class;

import java.lang.reflect.Field;
import java.util.Scanner;

/*
 * 1. Student Ŭ���� 
 *  - �������(=�ʵ�) ����
 *   �̸�, ��, ��, ��, ���, �հݿ���(boolean)
 * 
 * 2. Quiz01 ����Ŭ���� 
 *  - Student �ν��Ͻ��� 3�� �����Ͽ� 
 *  - Scanner�� ����ؼ� �л� 3���� �̸�, ��, ��, ���� �Է� �޴´�
 *  - ��� �ν��Ͻ��� ��հ� �հ� ����(��� 60�� �̻��̸� �հ�)�� ���Ǿ� ����
 *  - 3���� �̸�, ���, �հ� ���θ� ��� 
 *   
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		
		//Field[] fields = Student.class.getDeclaredFields();
		
		Scanner sc = new Scanner(System.in);

		Student[] arr = new Student[3];
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = new Student();
			System.out.println("name: ");
			arr[i].name = sc.next();
			System.out.println("kr: ");
			arr[i].kr = sc.nextInt();
			System.out.println("en: ");
			arr[i].en = sc.nextInt();
			System.out.println("ma: ");
			arr[i].ma = sc.nextInt();

		}
		for (Student s : arr) {
			s.name = "changed by for each because s is a reference variable";
		}
		for (Student s : arr) {
			s.print();
		}
		
	}
}
