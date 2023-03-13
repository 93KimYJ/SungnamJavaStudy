package kr.ac.kopo.day05;

import java.util.Scanner;

/*
 * 정수 4개를 입력받아 가장 큰 수를 출력
 */

public class HomeWorkMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 4개를 입력 : ");
		int num01 = sc.nextInt(); int num02 = sc.nextInt(); int num03 = sc.nextInt(); int num04 = sc.nextInt();
		
		//int max = num01;   
		int max = num01 > num02 ? num01 : num02;
		if(max < num03) {
			max = num03;
		} 
		if(max < num04) {
			max = num04;
		}
		System.out.println("가장 큰 수 : " + max);
		
		
		
		/* 방법 1
		int max01 = num01 > num02 ? num01 : num02;
		int max02 = num03;
		if(num03 < num04) {
			max02 = num04;
		}
		
		System.out.println("가장 큰 수 : " + (max01 > max02 ? max01 : max02));
		*/
		
		
	}

}
