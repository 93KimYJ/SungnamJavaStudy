package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 *  보유하고 있는 책권수 입력 : 3
 *  3 books
 *  
 *  보유하고 있는 책권수 입력 : 1
 *  1 book
 */

public class IfMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책 권수 입력 : ");
		int bookCount = sc.nextInt();
		
/*		System.out.print(bookCount + " book");
		
		if(bookCount != 1) {
			System.out.println("s");
		}
*/		
		
		if(bookCount == 1) {
			System.out.println("보유하고 있는 책 권수 : " + bookCount + " book");
		} else {
			System.out.println("보유하고 있는 책 권수 : " + bookCount + " books");
		} 
		
	}

}
