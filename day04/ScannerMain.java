package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자 입력 받는 방법
		System.out.print("문자를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
	 /* 그냥 next만 쓰면 단어단위로 출력되기 때문에 띄어쓰기를 하면 출력이 짤려서 나온다
		String str = sc.next();
		그래서 보통 문자를 출력할 때 nextLine을 붙여준다 */
		String str = sc.nextLine();
		
		System.out.println("str : " + str);
		
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		
		System.out.print("실수를 입력 : ");
		double number = sc.nextDouble();
		
		System.out.println("number : " + number);
		
	}

}
