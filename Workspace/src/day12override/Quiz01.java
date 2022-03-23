package day12override;





/*
 * 자식 클래스 3개 
 *  1. Circle
 *   필드 : 반지름 
 *   메소드 : 
 *    1) 생성자(반지름1개 넣고)
 *    2) getArea() 오버라이드 (이 객체의 원의 넓이를 리턴)
 *    
 *  2. Triangle
 *   필드 : 밑변, 높이 
 *   메소드 : 
 *    1) 생성자(밑변, 높이넣고)
 *    2) getArea() 오버라이드 (이 객체의 삼각형 넓이를 리턴)
 *    
 *  3. Rectangle
 *   필드 : 밑변 높이
 *   메소드 : 
 *    1) 생성자(밑변, 높이넣고)
 *    2) getArea() 오버라이드 (이 객체의 사각형 넓이를 리턴)
 */

public class Quiz01 {
	public static void main(String[] args) {
		// 오버라이드 잘 됐는지 테스트!
		Circle c = new Circle(5);
		System.out.println(c);
		Triangle t = new Triangle(2,5);
		System.out.println(t);
		Rectangle r = new Rectangle(5,6);
		System.out.println(r);
		
		
	}
}
















