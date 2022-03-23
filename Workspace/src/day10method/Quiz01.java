package day10method;

import java.util.Scanner;

/*
 * Ŭ���� : Student
 *  �ʵ� : �̸�, ��, ��, ��, ���, ���
 *  �޼ҵ� : 
 *    1) setData() : �̸�, ��, ��, ���� ���ڰ����� �޾�, �ش� �ʵ忡 ��� ����
 *    2) setMean() : ��ü�� ������ �ִ� ��, ��, ���� ������ ����� ����Ͽ� ��� �ʵ忡 ����
 *    3) setGrade() : ��ü�� ������ �ִ� ����� ������ ����� ���� 
 *       90�̻� : A
 *       80�̻� ~ 90�̸� : B
 *       70�̻� ~ 80�̸� : C
 *       60�̻� ~ 70�̸� : D
 *       60�̸� : F
 * 	  4) printData() : ��ü�� ��� ����(�̸�, ��, ��, ��, ���, ���)�� sysout
 * 
 *  ���� Ŭ���� : Quiz03
 *   4���� �л� ��ü�� �迭�� �����ϰ� 
 *   �ݺ����� ����Ͽ� �л����� �̸�, ��, ��, ���� �Է� ����
 *   �Է��� ������ ��� �л��� ������ ���
 */
class Student {
	String name;
	double kr;
	double en;
	double ma;
	double avg;
	char grade;
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("KR:");
		kr = sc.nextInt();
		System.out.println("EN:");
		en = sc.nextInt();
		System.out.println("MA:");
		ma = sc.nextInt();
		sc.close();
	}
	void setMean() {
		avg = (kr+en+ma)/3;
	}
	void setGrade() {
		setMean();
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg>=80) {
			grade = 'B';
		}
		else if(avg>=70) {
			grade = 'C';
		}
		else if(avg>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
	}
	void printData() {
		setData();
		setGrade();
		System.out.println("KR: " + kr);
		System.out.println("EN: " + en);
		System.out.println("MA: " + ma);
		System.out.println("Average: " + avg);
		System.out.println("Grade: " + grade);
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		Student[] students = new Student[4];
		for(int i = 0; i<students.length; i++) {
			students[i] = new Student();
			students[i].printData();
		}
		
	}
}
