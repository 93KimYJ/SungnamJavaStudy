package kr.ac.kopo.day02;

public class VariableMain {
	
	public static void main(String[] args) {
		
		char ch;
		ch = 'A';
		System.out.println("ch : " + ch);
		
		{
			int a = 10;
			System.out.println("a : " + a);
		}
//		a = 20;  --> ������ ��Ͻ����� �ȿ����� ����������Ŭ�� ���� ������ ��Ͻ����� �ۿ��� �����ϸ� ������ �߻��Ѵ�.
		
		ch = '!';
		ch = 79;
		ch = '\u0061';
		
		System.out.println("ch : " + ch);
	}

}
