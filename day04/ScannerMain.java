package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ���� �Է� �޴� ���
		System.out.print("���ڸ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("���ڿ��� �Է� : ");
	 /* �׳� next�� ���� �ܾ������ ��µǱ� ������ ���⸦ �ϸ� ����� ©���� ���´�
		String str = sc.next();
		�׷��� ���� ���ڸ� ����� �� nextLine�� �ٿ��ش� */
		String str = sc.nextLine();
		
		System.out.println("str : " + str);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		
		System.out.print("�Ǽ��� �Է� : ");
		double number = sc.nextDouble();
		
		System.out.println("number : " + number);
		
	}

}
