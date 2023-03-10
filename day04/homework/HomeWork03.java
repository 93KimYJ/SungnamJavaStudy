package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*  3. 3개의 정수를 입력받아 작은수에서 큰수 순으로 출력하는 코드 작성
*  예)
*  정수 3개를 입력 : 12 7 22 or
*  첫번째 정수 : 12
*  두번째 정수 : 7
*  세번째 정수 : 22
*/  

public class HomeWork03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num01 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num02 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int num03 = sc.nextInt();
		
		if(num01 > num02 && num02 > num03) {
			if(num02 > num03) {
				System.out.printf("%d, %d, %d\n", num03, num02, num01);
			} else {
				System.out.printf("%d, %d, %d\n", num02, num03, num01);
			}
			
		} else if(num02 > num01 && num02 > num03) {
			if(num01 > num03) {
				System.out.printf("%d, %d, %d\n", num03, num01, num02);
			} else {
				System.out.printf("%d, %d, %d\n", num01, num03, num02);
			}
		} else if(num03 > num01 && num03 > num02) {
			if(num01 > num02) {
				System.out.printf("%d, %d, %d\n", num02, num01, num03);
			} else {
				System.out.printf("%d, %d, %d\n", num01, num02, num03);
			}
		}


}
}

