package kr.ac.kopo.day03;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int num = 123;
		
//		num = num + 1;
		
		// ���Ѱ��� ������Ʈ (���մ��� ������, ����������) : += -= *= /= &=
		num += 50;
		
		++num;
		
		System.out.println("num : " + num);
		
		num--;
		
		System.out.println("num : " + num);
		
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
//		++a; = �������� ������
//		a++; = �������� ������
		
		/* 
		   == ���� �������
		   != ���� �ٸ����
		   && AND
		   || OR
		   ! NOT
		*/
	}

}
