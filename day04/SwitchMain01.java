package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 *  1 - 3������ ���� �Է� : 
 *  1 �Է� => ONE
 *  2 �Է� => TWO
 *  3 �Է� => THREE
 *  �׿��Է� => ERROR
 */

public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3������ ���� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break; // break�� ������ �ٷ� ������ ��Ͻ������� �̵��ϰ� ��. (�б⹮)
		case 2 : 
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		/* 
		 * default = switch �������� if�� else�� ����
		 * if���� else�� �޸� �ڵ��� ��ġ�� ��� �ִ� ������� ����� �����ϴ�
		 */
		default : 
			System.out.println("ERROR");
			break;
		}
		
/*		if(num == 1) {
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("TWO");
		} else if (num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
*/
		
	}

}
