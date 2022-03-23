package day12polymorphism;
import day12override.*;
/*
 * < 다형성 > 
 * - 하나의 객체가 여러 자료형을 갖고 있는 것.
 *   Circle형 객체는 Circle형, Shape형
 *   Triangle형 객체는 Triangle형, Shape형
 * - 자식객체는 부모형이 될 수 있다. 
 * - 업캐스팅    - 자식객체가 부모형으로 형변환 (자동형변환 O)
 *   다운캐스팅 - 부모형이었던 자식객체가 하위클래스로 형변환 
 * 
 * - 부모형 변수 = 모든 자식객체;
 * 
 *   Shape s;
 *   s = new Circle(10);
 *   s = new Triangle(10, 20);
 *   s = new Rectangle(10, 20);
 * 
 *   ** 주의사항 
 *      이렇게 업스캐팅된 객체는 부모가 물려준 멤버와 오버라이드된 메서드만 접근 가능
 */
public class Test01 {
   public static void main(String[] args) {
      Shape[] shapes = {
            (Shape)new Circle(10), 
            (Shape)new Circle(100), 
            (Shape)new Triangle(5, 2),
            (Shape)new Rectangle(10, 7)
      };
      for(Shape s : shapes) {
         System.out.println(s.getArea());
      }
   }
}