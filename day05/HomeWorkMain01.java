package kr.ac.kopo.day05;

import java.util.Scanner;

/*
 * 3���� ������ �Է¹޾� ���� ������� ����ϱ�
 */

public class HomeWorkMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է� : ");
		int num01 = sc.nextInt(); int num02 = sc.nextInt(); int num03 = sc.nextInt();
		
		int min = num01, max = num02;
		if(num01 > num02) {
			min = num02;
			max = num01;
		}
		
		if(num03 < min) {
			System.out.println(num03 + " < " + min + " < " + max);
		} else if(num03 < max) {
			System.out.println(min + " < " + num03 + " < " + max);
		} else {
			System.out.println(min + " < " + max + " < " + num03);
		}
		
/*		
		if(num01 < num02) {
			if(num03 < num01) {
				// num03 < num01 < num02 ����
			} else { // num01 < num02, num03 ????
				if(num01 < num03) {
					// num01 < num02 < num03 ����
				} else {
					//num01 < num03 < num02 ����
				}
			}
		} else { // num2 < num01
		
		}
*/		
/*		
		if(num01 < num02 && num02 < num03) {
			
		} else if(num01 < num03 && num03 < num02) {
			
		} else if(num02 < num01 && num01 < num03) {
			
		} else if(num02 < num03 && num03 < num01) {
			
		} else if(num03 < num01 && num01 < num02) {
			
		} else {
			
		}
*/		
		
		
	}

}
