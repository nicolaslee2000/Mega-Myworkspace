package day07array;

public class Quiz02 {
	public static void main(String[] args) {

		/*
		 * 'A' : 65 , 'Z' : 90
		 * 
		 * chArr[i] >= 65 && chArr[i] <= 90   ===> 대문자니? 
		 * chArr[i] >= 'A' && chArr[i] <= 'Z' ===> 대문자니?
		 * 
		 * 대문자 + 32 == 소문자 소문자 - 32 == 대문자
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

//		위 세 단어가 잘 출력되도록 sysout 중간 중간에 for문을 사용하여 코드를 완성하세요.

	}
}
