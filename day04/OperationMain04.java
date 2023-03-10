package kr.ac.kopo.day04;

/*
 * 두개 정수 입력 : 12 5
 * 12는 5의 배수판단 : 배수가 아닙니다
 * 
 * 두개 정수 입력 : 12 6
 * 12는 6의 배수판단 : 배수입니다
 */

public class OperationMain04 {
	
	public static void main(String[] args) {
		
		// 조건연산자는 어느 문장에서나 결합해서 사용할 수 있다
//		String msg = true ? "배수" : "배수아님";
		// 조건연산자 ?를 쓰고 참일때 왼쪽 메세지가 출력되고 거짓일땐 오른쪽 메세지가 출력된다
//		System.out.println(10 > 4 ? "배수다" : "배수가 아니다");
		
		// , <-- 순서연산자 순서대로 연산할 수 있게 해준다
		int num01 = 15, num02 = 3;
		
		boolean bool = num02 != 0 && (num01 % num02) == 0;
		
		String result = bool ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d는 %d의 배수판단 : %s\n", num01, num02, result);
		
	}

}
