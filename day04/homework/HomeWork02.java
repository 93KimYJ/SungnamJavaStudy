package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
*  2. ���ǰ��� �Է��ϰ�, ���� ���� ���� �� �Ž������� �ܾ��� ǥ���ϴ� �ڵ带 �ۼ��Ͻÿ�
*  ��)
*  ���ǰ��� �Է� : 4230
*  ������ �� �Է� : 10000
*  
*  �Ž����� : 5770��
*  1000�� : 5��
*  500�� : 1��
*  100�� : 2��
*  50�� : 1��
*  10�� : 2��
*  
*  ���ǰ��� �Է� : 4230
*  ������ ���� �׼� : 3000
*  1230���� �����մϴ�
*/ 

public class HomeWork02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ǰ� �Է� : ");
		int price = sc.nextInt();
		System.out.print("������ �� �Է� : ");
		int payment = sc.nextInt();
		
		int change = (payment - price);
		
		System.out.println("�Ž����� : " + change);
		
		int num1000 = (change/1000);
		change = change % 1000;
		System.out.println("1000�� : " + num1000 + " ��");
		int num500 = (change/500);
		change = change % 500;
		System.out.println("500�� : " + num500 + " ��");
		int num100 = (change/100);
		System.out.println("100�� : " + num100 + " ��");
		change = change % 100;
		int num50 = (change/50);
		change = change % 50;
		System.out.println("50�� : " + num50 + " ��");
		int num10 = (change/10);
		change = change % 10;
		System.out.println("10�� : " + num10 + " ��");
	}

}
