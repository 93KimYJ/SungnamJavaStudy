package kr.ac.kopo.day04.homework;

/*  
*  5. ������ ����� ���̴� �ڵ带 if�� switch������ ���� �ۼ��Ͻÿ�
*  ��)
*  �����ϰ� �ִ� å �Ǽ� : 0
*  �����ϰ� �ִ� å ����
*  
*  �����ϰ� �ִ� å �Ǽ� : 1
*  1 book
*  
*  �����ϰ� �ִ� å �Ǽ� : 3
*  3 books
* 
* 	�����ϰ� �ִ� å �Ǽ� : -3
*  �߸��Է��߽��ϴ�.
* 
*/

import java.util.Scanner;

public class HomeWork05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϰ� �ִ� å �Ǽ� : ");
		int bookCount = sc.nextInt();
		
		if(bookCount == 0 ) {
			System.out.println("�����ϰ� �ִ� å ����");
		} else if(bookCount == 1) {
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " book");
		} else if(bookCount > 1) {
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " books");
		} else {
			System.out.println("�߸� �Է��߽��ϴ�");
		}
		
		switch(bookCount) {
		case 0:
			System.out.println("�����ϰ� �ִ� å ����");
			break;
		case 1:
			System.out.println("�����ϰ� �ִ� å �Ǽ� : " + bookCount + " book");
			break;
		default:
			System.out.println(bookCount < 0 ? "�߸� �Է��߽��ϴ�" : "�����ϰ� �ִ� å �Ǽ� : " + bookCount + " books");
		}
		
	}

}
