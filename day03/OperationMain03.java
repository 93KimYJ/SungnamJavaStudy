package kr.ac.kopo.day03;

/*
 * �ΰ� ���� �Է� : 12 5
 * 12�� 5�� ����Ǵ� : flase
 * 
 * �ΰ� ���� �Է� : 12 6
 * 12�� 6�� ����Ǵ� : true
 */

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		// , <-- ���������� ������� ������ �� �ְ� ���ش�
		int num01 = 15, num02 = 0;
		
		boolean bool = num02 != 0 && (num01 % num02) == 0;
		
		System.out.printf("%d�� %d�� ����Ǵ� : %b\n", num01, num02, bool);
		
	}

}
