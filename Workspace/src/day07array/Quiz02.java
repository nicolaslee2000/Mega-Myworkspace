package day07array;

public class Quiz02 {
	public static void main(String[] args) {

		/*
		 * 'A' : 65 , 'Z' : 90
		 * 
		 * chArr[i] >= 65 && chArr[i] <= 90   ===> �빮�ڴ�? 
		 * chArr[i] >= 'A' && chArr[i] <= 'Z' ===> �빮�ڴ�?
		 * 
		 * �빮�� + 32 == �ҹ��� �ҹ��� - 32 == �빮��
		 * 
		 * 
		 */

		char[] chArr = { 'p', 'o', 'k', 'E', 'M', 'o', 'N','!' };
		System.out.println(chArr);
		
		//change all uppercase
		for (int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 97 && chArr[i] <= 122) {
				chArr[i] -= 32;
			}
		}
		System.out.println(chArr);
		for (int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 65 && chArr[i] <= 90) {
				chArr[i] += 32;
			}
		}
		System.out.println(chArr);
		
// pokEMoN
// POKEMON
// pokemon

//		�� �� �ܾ �� ��µǵ��� sysout �߰� �߰��� for���� ����Ͽ� �ڵ带 �ϼ��ϼ���.

	}
}
