package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num01 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num02 = sc.nextInt();
		
		boolean bool = num02 != 0 & num01 % num02 == 0;
		String result = bool ? "�����" : "����� �ƴϴ�";
		
		System.out.printf("%d�� %d�� ������� : %s\n", num01, num02, result);
		
	}

}
