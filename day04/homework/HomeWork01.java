package kr.ac.kopo.day04.homework;

/*
*  1. �������� �Է¹޾� ���� ���̿� �ѷ��� ����ϴ� �ڵ� �ۼ� (�Ҽ��� 4°�ڸ� ���)
*  ��)
*  ������ �Է� : 10
*  ������ : 10 => �� ���� : 314.1492 �� �ѷ� : 62.8318
*  
*/

import java.util.Scanner;

public class HomeWork01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		double radius = sc.nextInt();
		double area = (radius * radius) * 3.14;
		double round = (radius * 2) * 3.14;
		
		System.out.printf("���� ���� : %.4f\n", area);
		System.out.printf("���� �ѷ� : %.4f\n", round);
		
		
	}

}
