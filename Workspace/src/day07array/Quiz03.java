package day07array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int nums[] = new int[6];
//		1. Scanner�� ����Ͽ� 6���� �����͸� �Է� �ް�, �̵��� nums �迭�� ����
		
//		2. �Է� ���� �� ��, 20 �̻� 100 ������ ���Ҹ� ���
		
//		3. �Է� ���� �� ��, �ִ񰪰� �ּڰ��� ���
//		int max = nums[0];
//		int min = nums[0];
//		(for�� ���)
//		System.out.println("�ִ� : " + max);
//		System.out.println("�ִ� : " + min);
		
//		4. ��������(����->ū)���� �����Ͽ� ��� ���Ҹ� ���  ==> ���� ���� �˰��� �˻��ؼ� ... 
		
		//2.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			System.out.println("type integer between 0 to 100");
			int num = sc.nextInt();
			if ((num<100)&&(num>20)) {
				nums[i] = num;
			}
			
		}
		
		//3.
		int max = Integer.MAX_VALUE;//[0];
		int min = Integer.MIN_VALUE;//[0];
	
		for (int i = 0;i<nums.length; i++) {
			if(nums[i]>max) {
				max = nums[i]; 
				
			}
			if(nums[i]<min) {
				min = nums[i]; 
				
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("max number: "+ max);
		System.out.println("min number: "+ min);
		
		
		//4. bubblesort
		
		
		
		for (int i = 0; i < nums.length -1; i++) {
			
			for (int j = 0; j < nums.length - i -1; j++) {
				if (nums[j] > nums[j+1]) {
					int temps = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temps;
					System.out.println(Arrays.toString(nums));
				}
				
			}
			System.out.println("a");
		}
		
		//��������
		for (int i = 0; i<nums.length-1; i++) {
			for (int j = i+1; j<nums.length; j++) {
				if (nums[j] < nums[i]) {
					int temps = nums[j];
					nums[j] = nums[i];
					nums[i] = temps;
					System.out.println(Arrays.toString(nums));
				}
			}
			System.out.println("a");
		}
		//sorting algorithms
		
		sc.close();
	}
}
