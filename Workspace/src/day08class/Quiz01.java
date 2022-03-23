package day08class;

import java.lang.reflect.Field;
import java.util.Scanner;

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
