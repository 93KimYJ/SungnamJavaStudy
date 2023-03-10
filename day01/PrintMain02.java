package kr.ac.kopo.day01;

/*
	printf : 변환문자를 이용하여 상수 출력
	%c : 문자로 인식
	%d : 10진수 정수로 인식
	%f : 실수로 인식
	%s : 문자열로 인식
	%b : 논리값으로 인식
	
	ctrl + alt + c + 아래방향 키 : 줄 복사
 */

public class PrintMain02 {
	
	public static void main(String[] args) {
		
		System.out.printf("%d %f %s\n" , 10, 12.34, "홍길동");
		// %.2f = 소수점 두번째 자리까지만 나오게 할 수 있다
		System.out.printf("%d %.2f %s\n" , 10, 12.34, "홍길동");
		// 한자리 수만 출력되게 할 때 짤리는 수가 6 이상일 경우 반올림을 해서 출력한다
		System.out.printf("%d %.1f %s\n" , 10, 12.36, "홍길동");
		// 반올림, 절사 되게끔 만들기
		System.out.printf("%.1f\n", 14.59 - 0.05);
		
		System.out.printf("[%d]\n", 10);
		// %와 d 사이에 5를 넣으면 화면에 출력할 때 정수를 5자리로 출력하라는 의미
		System.out.printf("[%5d]\n", 10);
		// -를 넣으면 왼쪽맞춤이 된다
		System.out.printf("[%-5d]\n", 10);
		
		System.out.printf("[%10s]\n", "홍길동");
		System.out.printf("[%-10s]\n", "홍길동");
		// 0을 넣으면 공백에 0이 채워진다
		System.out.printf("[%05d]\n", 123 );
		// System.out.printf("[%-05d]", 123 ); -> 출력이 12300 으로 나오기때문에 에러가 발생
		
		// %5d를 해놓고 출력할 숫자를 더 길게 해놓으면 5가 무시되고 출력된다
		System.out.printf("[%5d] %.2f [%-10s]\n", 1234567, 12.34, "홍길동");
		
		System.out.printf("4 > 2 : %b\n", 4 > 2);
		
	}

}
