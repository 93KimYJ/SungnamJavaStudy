package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 *  1 - 3사이의 정수 입력 : 
 *  1 입력 => ONE
 *  2 입력 => TWO
 *  3 입력 => THREE
 *  그외입력 => ERROR
 */

public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3사이의 정수 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break; // break를 넣으면 바로 마지막 블록스코프로 이동하게 됨. (분기문)
		case 2 : 
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		/* 
		 * default = switch 문에서는 if의 else와 같다
		 * if문의 else와 달리 코드의 위치가 어디에 있던 상관없이 출력이 가능하다
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
