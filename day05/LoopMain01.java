package kr.ac.kopo.day05;

public class LoopMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("----- start -----");
		int count = 1;
		while(count <= 5) {
			System.out.println("Hello");
			++count;
		}
		System.out.println("----- end -----");
		System.out.println("count : " + count); // while�������� ������ ���θ޼ҵ� ��Ͻ����� �ȿ� �ֱ� ������ ���θ޼ҵ� ��Ͻ����� �ȿ����� ��� ����
		
		count = 1;  // while�������� ������ �ʱ�ȭ ���ִ� �۾��� �ʿ���
		while(count <= 3) {
			System.out.println("Good Bye");
			++count;
		}
	}

}
