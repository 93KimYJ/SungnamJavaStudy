package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 *  �����ϰ� �ִ� å�Ǽ� �Է� : 3
 *  3 books
 *  
 *  �����ϰ� �ִ� å�Ǽ� �Է� : 1
 *  1 book
 */

public class IfMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ� �ִ� å �Ǽ� �Է� : ");
		int bookCount = sc.nextInt();
		
/*		System.out.print(bookCount + " book");
		
		if(bookCount != 1) {
			System.out.println("s");
		}
*/		
		
		if(bookCount == 1) {
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " book");
		} else {
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " books");
		} 
		
	}

}
