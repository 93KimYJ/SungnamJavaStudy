package kr.ac.kopo.day05;

import java.util.Scanner;

public class HomeWorkMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ� �ִ� å �Ǽ� �Է� : ");
		int book = sc.nextInt();
		
		switch(book) {
		case 0 :
			System.out.println("�����ϰ� �ִ� å�� �����ϴ�");
			break;
		case 1 :
			System.out.println(book + " book");
			break;
		default:
			switch(book & 0x80000000) // ��Ʈ AND����
			{
			case 0 :
				System.out.println(book + " books");
				break;
			default :
				System.out.println("�߸� �Է��߽��ϴ�");
			}
		} 
		
		/* if��
		if(book < 0) {
			System.out.println("�߸� �Է��߽��ϴ�");
		} else if (book == 0) {
			System.out.println("�����ϰ� �ִ� å�� �����ϴ�");
		} else if (book == 1) {
			System.out.println(book + " book");
		} else {
			System.out.println(book + " books");
		}
		*/
	}

}
