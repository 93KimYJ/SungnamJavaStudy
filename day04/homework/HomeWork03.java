package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*  3. 3���� ������ �Է¹޾� ���������� ū�� ������ ����ϴ� �ڵ� �ۼ�
*  ��)
*  ���� 3���� �Է� : 12 7 22 or
*  ù��° ���� : 12
*  �ι�° ���� : 7
*  ����° ���� : 22
*/  

public class HomeWork03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num01 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num02 = sc.nextInt();
		System.out.print("����° ���� : ");
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

