package day07array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int nums[] = new int[6];
//		1. Scanner를 사용하여 6개의 데이터를 입력 받고, 이들을 nums 배열에 저장
		
//		2. 입력 받은 값 중, 20 이상 100 이하인 원소만 출력
		
//		3. 입력 받은 값 중, 최댓값과 최솟값을 출력
//		int max = nums[0];
//		int min = nums[0];
//		(for문 사용)
//		System.out.println("최댓값 : " + max);
//		System.out.println("최댓값 : " + min);
		
//		4. 오름차순(작은->큰)으로 정렬하여 모든 원소를 출력  ==> 버블 정렬 알고리즘 검색해서 ... 
		
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
		
		//선택정렬
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
