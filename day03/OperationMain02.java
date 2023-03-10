package kr.ac.kopo.day03;

public class OperationMain02 {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
//		boolean result = ++a > 1 && ++b >= 0;
		boolean result = ++b >= 0 && ++a > 1;
		
		System.out.printf("a = %d b = %d\n", a, b);
		System.out.println(result);
		
	}

}
