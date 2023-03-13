package kr.ac.kopo.day05;

public class ContinueMain {
	
	public static void main(String[] args) {
		
		int cnt;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3) {
				continue; // 반복문을 시행하지 않고 증가연산으로 바로 이동 3을 안찍게됨 (잘 사용 X)
			}
			
			System.out.println("HI");
		} System.out.println("cnt : " + cnt);

	}

}
