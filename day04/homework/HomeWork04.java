package kr.ac.kopo.day04.homework;

/*  
*  4. 4���� ������ �Է¹޾� ���� ū���� ����ϴ� �ڵ� �ۼ�
*  ��)
*  ���� 4���� �Է� : 23 8 567 34
*  ���� ū�� : 567
*/  

import java.util.Scanner;

public class HomeWork04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num01 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num02 = sc.nextInt();
		System.out.print("����° ���� : ");
		int num03 = sc.nextInt();
		System.out.print("�׹�° ���� : ");
		int num04 = sc.nextInt();
		
		if(num01 > num02) {
			if(num01 > num03) {
				if(num01 > num04) {
					System.out.println("���� ū �� : " + num01);
				}
			}
		}
		
		if(num02 > num01) {
			if(num02 > num03) {
				if(num02 > num04) {
					System.out.println("���� ū �� : " + num02);
				}
			}
		}
		
		if(num03 > num01) {
			if(num03 > num02) {
				if(num03 > num04) {
					System.out.println("���� ū �� : " + num03);
				}
			}
		}
		
		if(num04 > num01){
			if(num04 > num02) {
				if(num04 > num03) {
					System.out.println("���� ū �� : " + num04);
				}
			}
		}
	}

}
