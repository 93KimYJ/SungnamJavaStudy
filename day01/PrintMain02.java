package kr.ac.kopo.day01;

/*
	printf : ��ȯ���ڸ� �̿��Ͽ� ��� ���
	%c : ���ڷ� �ν�
	%d : 10���� ������ �ν�
	%f : �Ǽ��� �ν�
	%s : ���ڿ��� �ν�
	%b : �������� �ν�
	
	ctrl + alt + c + �Ʒ����� Ű : �� ����
 */

public class PrintMain02 {
	
	public static void main(String[] args) {
		
		System.out.printf("%d %f %s\n" , 10, 12.34, "ȫ�浿");
		// %.2f = �Ҽ��� �ι�° �ڸ������� ������ �� �� �ִ�
		System.out.printf("%d %.2f %s\n" , 10, 12.34, "ȫ�浿");
		// ���ڸ� ���� ��µǰ� �� �� ©���� ���� 6 �̻��� ��� �ݿø��� �ؼ� ����Ѵ�
		System.out.printf("%d %.1f %s\n" , 10, 12.36, "ȫ�浿");
		// �ݿø�, ���� �ǰԲ� �����
		System.out.printf("%.1f\n", 14.59 - 0.05);
		
		System.out.printf("[%d]\n", 10);
		// %�� d ���̿� 5�� ������ ȭ�鿡 ����� �� ������ 5�ڸ��� ����϶�� �ǹ�
		System.out.printf("[%5d]\n", 10);
		// -�� ������ ���ʸ����� �ȴ�
		System.out.printf("[%-5d]\n", 10);
		
		System.out.printf("[%10s]\n", "ȫ�浿");
		System.out.printf("[%-10s]\n", "ȫ�浿");
		// 0�� ������ ���鿡 0�� ä������
		System.out.printf("[%05d]\n", 123 );
		// System.out.printf("[%-05d]", 123 ); -> ����� 12300 ���� �����⶧���� ������ �߻�
		
		// %5d�� �س��� ����� ���ڸ� �� ��� �س����� 5�� ���õǰ� ��µȴ�
		System.out.printf("[%5d] %.2f [%-10s]\n", 1234567, 12.34, "ȫ�浿");
		
		System.out.printf("4 > 2 : %b\n", 4 > 2);
		
	}

}
