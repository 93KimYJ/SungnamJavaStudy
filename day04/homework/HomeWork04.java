package kr.ac.kopo.day04.homework;

/*  
*  4. 4개의 정수를 입력받아 가장 큰수를 출력하는 코드 작성
*  예)
*  정수 4개를 입력 : 23 8 567 34
*  가장 큰수 : 567
*/  

import java.util.Scanner;

public class HomeWork04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num01 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num02 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int num03 = sc.nextInt();
		System.out.print("네번째 정수 : ");
		int num04 = sc.nextInt();
		
		if(num01 > num02) {
			if(num01 > num03) {
				if(num01 > num04) {
					System.out.println("가장 큰 수 : " + num01);
				}
			}
		}
		
		if(num02 > num01) {
			if(num02 > num03) {
				if(num02 > num04) {
					System.out.println("가장 큰 수 : " + num02);
				}
			}
		}
		
		if(num03 > num01) {
			if(num03 > num02) {
				if(num03 > num04) {
					System.out.println("가장 큰 수 : " + num03);
				}
			}
		}
		
		if(num04 > num01){
			if(num04 > num02) {
				if(num04 > num03) {
					System.out.println("가장 큰 수 : " + num04);
				}
			}
		}
	}

}
