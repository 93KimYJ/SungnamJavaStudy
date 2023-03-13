package kr.ac.kopo.day05;

public class BreakMain {
	
	public static void main(String[] args) {
		
		int cnt;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3) {
				break;
			}
			
			System.out.println("HI");
		} System.out.println("cnt : " + cnt);

	}

}
