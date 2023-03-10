package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
*  2. 물건값을 입력하고, 돈을 지불 했을 때 거스름돈과 잔액을 표시하는 코드를 작성하시오
*  예)
*  물건값을 입력 : 4230
*  지불한 돈 입력 : 10000
*  
*  거스름돈 : 5770원
*  1000원 : 5개
*  500원 : 1개
*  100원 : 2개
*  50원 : 1개
*  10원 : 2개
*  
*  물건값을 입력 : 4230
*  지불한 돈의 액수 : 3000
*  1230원이 부족합니다
*/ 

public class HomeWork02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값 입력 : ");
		int price = sc.nextInt();
		System.out.print("지불한 돈 입력 : ");
		int payment = sc.nextInt();
		
		int change = (payment - price);
		
		System.out.println("거스름돈 : " + change);
		
		int num1000 = (change/1000);
		change = change % 1000;
		System.out.println("1000원 : " + num1000 + " 개");
		int num500 = (change/500);
		change = change % 500;
		System.out.println("500원 : " + num500 + " 개");
		int num100 = (change/100);
		System.out.println("100원 : " + num100 + " 개");
		change = change % 100;
		int num50 = (change/50);
		change = change % 50;
		System.out.println("50원 : " + num50 + " 개");
		int num10 = (change/10);
		change = change % 10;
		System.out.println("10원 : " + num10 + " 개");
	}

}
