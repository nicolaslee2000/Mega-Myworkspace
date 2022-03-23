package day12polymorphism;
import day12override.*;
/*
 * < ������ > 
 * - �ϳ��� ��ü�� ���� �ڷ����� ���� �ִ� ��.
 *   Circle�� ��ü�� Circle��, Shape��
 *   Triangle�� ��ü�� Triangle��, Shape��
 * - �ڽİ�ü�� �θ����� �� �� �ִ�. 
 * - ��ĳ����    - �ڽİ�ü�� �θ������� ����ȯ (�ڵ�����ȯ O)
 *   �ٿ�ĳ���� - �θ����̾��� �ڽİ�ü�� ����Ŭ������ ����ȯ 
 * 
 * - �θ��� ���� = ��� �ڽİ�ü;
 * 
 *   Shape s;
 *   s = new Circle(10);
 *   s = new Triangle(10, 20);
 *   s = new Rectangle(10, 20);
 * 
 *   ** ���ǻ��� 
 *      �̷��� ����ĳ�õ� ��ü�� �θ� ������ ����� �������̵�� �޼��常 ���� ����
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