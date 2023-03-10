package kr.ac.kopo.day04.homework;

/*
*  1. 반지름을 입력받아 원의 넓이와 둘레를 출력하는 코드 작성 (소수점 4째자리 출력)
*  예)
*  반지름 입력 : 10
*  반지름 : 10 => 원 넓이 : 314.1492 원 둘레 : 62.8318
*  
*/

import java.util.Scanner;

public class HomeWork01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		double radius = sc.nextInt();
		double area = (radius * radius) * 3.14;
		double round = (radius * 2) * 3.14;
		
		System.out.printf("원의 넓이 : %.4f\n", area);
		System.out.printf("원의 둘레 : %.4f\n", round);
		
		
	}

}
