package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 *  �����ϰ� �ִ� å�Ǽ� �Է� : 3
 *  3 books
 *  
 *  �����ϰ� �ִ� å�Ǽ� �Է� : 1
 *  1 book
 *  
 *  �����ϰ� �ִ� å �Ǽ� �Է� : 0
 *  �����ϰ� �ִ� å ����
 */

public class IfMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ� �ִ� å �Ǽ� �Է� : ");
		int bookCount = sc.nextInt();
		
		if(bookCount == 1) {
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " book");
		} else if (bookCount > 1) {
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " books");
		} else {
			System.out.println("�����ϰ� �ִ� å ����");
		}
		
	}
}
