package day12override;





/*
 * �ڽ� Ŭ���� 3�� 
 *  1. Circle
 *   �ʵ� : ������ 
 *   �޼ҵ� : 
 *    1) ������(������1�� �ְ�)
 *    2) getArea() �������̵� (�� ��ü�� ���� ���̸� ����)
 *    
 *  2. Triangle
 *   �ʵ� : �غ�, ���� 
 *   �޼ҵ� : 
 *    1) ������(�غ�, ���ְ̳�)
 *    2) getArea() �������̵� (�� ��ü�� �ﰢ�� ���̸� ����)
 *    
 *  3. Rectangle
 *   �ʵ� : �غ� ����
 *   �޼ҵ� : 
 *    1) ������(�غ�, ���ְ̳�)
 *    2) getArea() �������̵� (�� ��ü�� �簢�� ���̸� ����)
 */

public class Quiz01 {
	public static void main(String[] args) {
		// �������̵� �� �ƴ��� �׽�Ʈ!
		Circle c = new Circle(5);
		System.out.println(c);
		Triangle t = new Triangle(2,5);
		System.out.println(t);
		Rectangle r = new Rectangle(5,6);
		System.out.println(r);
		
		
	}
}
















