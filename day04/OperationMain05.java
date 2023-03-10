package kr.ac.kopo.day04;

public class OperationMain05 {
	
	public static void main(String[] args) {
		
		// 비트연산자
		
		int num = 0xE855AA39;
		
		System.out.printf("%x\n", num);
		
		System.out.printf("%x\n", ~num);
		
		System.out.printf("%08x\n", num & 0xffff0000);
		System.out.printf("%08x\n", num | 0x0000ffff);
		
	}

}
