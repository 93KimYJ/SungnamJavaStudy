package kr.ac.kopo.day04.homework;

/*  
*  5. 다음의 결과를 보이는 코드를 if문 switch문으로 각각 작성하시오
*  예)
*  보유하고 있는 책 권수 : 0
*  보유하고 있는 책 없음
*  
*  보유하고 있는 책 권수 : 1
*  1 book
*  
*  보유하고 있는 책 권수 : 3
*  3 books
* 
* 	보유하고 있는 책 권수 : -3
*  잘못입력했습니다.
* 
*/

import java.util.Scanner;

public class HomeWork05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 : ");
		int bookCount = sc.nextInt();
		
		if(bookCount == 0 ) {
			System.out.println("보유하고 있는 책 없음");
		} else if(bookCount == 1) {
			System.out.println("보유하고 있는 책 권수 : " + bookCount + " book");
		} else if(bookCount > 1) {
			System.out.println("보유하고 있는 책 권수 : " + bookCount + " books");
		} else {
			System.out.println("잘못 입력했습니다");
		}
		
		switch(bookCount) {
		case 0:
			System.out.println("보유하고 있는 책 없음");
			break;
		case 1:
			System.out.println("보유하고 있는 책 권수 : " + bookCount + " book");
			break;
		default:
			System.out.println(bookCount < 0 ? "잘못 입력했습니다" : "보유하고 있는 책 권수 : " + bookCount + " books");
		}
		
	}

}
