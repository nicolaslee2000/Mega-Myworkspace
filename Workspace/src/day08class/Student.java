package day08class;
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

import java.util.Scanner;

public class Student {
	String name;
	int kr;
	int en;
	int ma;
	int avg;
	boolean pass = false;
	
	void getAvg() {
		int avg = (kr+en+ma)/3;
		if (avg>=60) {
			pass = true;
		}
		else {
			pass = false;
		}
	}
	void print(){
		getAvg();
		System.out.println(name);
		System.out.println("average: " + avg);
		System.out.println(pass ? "Pass!" : "failed");
	}
	
	
}
