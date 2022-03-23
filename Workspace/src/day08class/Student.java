package day08class;
/*
 * 1. Student 클래스 
 *  - 멤버변수(=필드) 선언
 *   이름, 국, 영, 수, 평균, 합격여부(boolean)
 * 
 * 2. Quiz01 메인클래스 
 *  - Student 인스턴스를 3개 생성하여 
 *  - Scanner를 사용해서 학생 3명의 이름, 국, 영, 수를 입력 받는다
 *  - 모든 인스턴스의 평균과 합격 여부(평균 60점 이상이면 합격)이 계산되어 저장
 *  - 3명의 이름, 평균, 합격 여부를 출력 
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
