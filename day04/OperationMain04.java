package kr.ac.kopo.day04;

/*
 * �ΰ� ���� �Է� : 12 5
 * 12�� 5�� ����Ǵ� : ����� �ƴմϴ�
 * 
 * �ΰ� ���� �Է� : 12 6
 * 12�� 6�� ����Ǵ� : ����Դϴ�
 */

public class OperationMain04 {
	
	public static void main(String[] args) {
		
		// ���ǿ����ڴ� ��� ���忡���� �����ؼ� ����� �� �ִ�
//		String msg = true ? "���" : "����ƴ�";
		// ���ǿ����� ?�� ���� ���϶� ���� �޼����� ��µǰ� �����϶� ������ �޼����� ��µȴ�
//		System.out.println(10 > 4 ? "�����" : "����� �ƴϴ�");
		
		// , <-- ���������� ������� ������ �� �ְ� ���ش�
		int num01 = 15, num02 = 3;
		
		boolean bool = num02 != 0 && (num01 % num02) == 0;
		
		String result = bool ? "����Դϴ�" : "����� �ƴմϴ�";
		
		System.out.printf("%d�� %d�� ����Ǵ� : %s\n", num01, num02, result);
		
	}

}
