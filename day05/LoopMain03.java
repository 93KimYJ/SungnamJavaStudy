package kr.ac.kopo.day05;

public class LoopMain03 {
	
	public static void main(String[] args) {
		
/*		int count = 1;
		while(count >= 5) {  // ���ǹ��� ���� ���� �������� �����ϱ� ������ false�� ��� �ٷ� ���������� �ȴ�
			System.out.println("Hello");
			++count;
		}
		
		for(; count >= 5; count++) {  //  for���� �������� �ݺ����� ���� 0ȸ �����ϰԵ�
			System.out.println("Hello");
			++count;
		}*/
		
		int cnt = 1;
		do {  /* while�� ���̶��  do��� Ű���尡 �ִ� ��Ͻ����� ���� �����Ѵ�
		 (���ǹ��� �ݺ����� ��ġ�� �ٲٴ� ��� ���, ��? = ���� ��� �ּ� �ѹ��� ��� ����) */
			System.out.println("Hello");
			++cnt;
		} while(cnt <= 5); // do ~ while���� ����üũ �� �� ���� ����Ѵ�. (�̷����� ������ �ִ� ������ ����)

	}

}
