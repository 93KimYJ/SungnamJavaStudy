package kr.ac.kopo.day01;

/*
	��¸޼ҵ�  System.out.��¸޼ҵ�(); 
	print()
	println() : ���๮��O (enter�� ������ �ִ�)
	printf()
 */

public class PrintMain {

	public static void main(String[] args) {
		
		System.out.print('ȫ');
		
		// ���3
		System.out.print("A\n");
		// ���2
		System.out.print('A');
		System.out.print('\n');
		// ��� 1
		System.out.println('A');
		
		System.out.println(10);
		System.out.println(12.34);
		
		// 10 12.34 ȫ�浿
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("ȫ�浿");
		// �ڵ� ���
		System.out.println(10 + " " + 12.34 + " " + "ȫ�浿");
		
		System.out.printf("%d %f %s", 10, 12.34, "ȫ�浿\n" );
		
		// ���ڿ��� + ���ڿ��� �ϸ� ���ڿ����� �������� ��µȴ�
		System.out.println("�迩��" + "�迩��");
		
		// ���� + ���� = �����ڵ�� ���� ���ڷ� ���ε� �־ ���ڳ��� ���Ѱŷ� ��µ� ����
		System.out.println('A' + 'B');
		System.out.println(10 + ' ');
		// 10 �����̽��� ����ϱ� ���� ���ڿ��� �����̽��� ����ش�
		System.out.println(10 + " ");

	}
}
