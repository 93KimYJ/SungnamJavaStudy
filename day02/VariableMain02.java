package kr.ac.kopo.day02;

public class VariableMain02 {
	
	public static void main(String[] args) {
		
		double num = 12.34;
		// ����ȯ
		num = (double)34;
//		num = 34;      // ������ ��Ʈ���� ũ�Ⱑ �� ũ�� ������ (double)�� ������ �� �ִ� : (������ ����ȯ)

		System.out.println("num : " + num);
		
		int num2;
		num2 = (int)12.34;   // ����ȯ Ű���尡 ���� ����ȯ�� ������(�����)����ȯ
		
		System.out.println("num2 : " + num2);
		
		float num3;
		num3 = (float)10.4;   // �Ǽ��� �⺻ �ڷ����� double�̱� ������ �� ũ�Ⱑ ���� float�� ������ ���������ȯ�� ������Ѵ�
		num3 = 10.4f;  // --> �Ǽ� �ڿ� f�� �����ָ� float�� �ν� �ٸ� �ڷ����� �������� L(long��)
		
		System.out.println("num3 : " + num3);
		
		System.out.println(12 + (int)12.34);
		System.out.println(/*(double)*/12 + 12.34);  // ���ϱ⳪ �����Ҷ� ������Ÿ���� �ٸ��� ū Ÿ������ ���󰡱� ������ ����������ȯ�� ���� �ʿ䰡 ����.
			
	}

}
