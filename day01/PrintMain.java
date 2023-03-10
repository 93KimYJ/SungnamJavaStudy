package kr.ac.kopo.day01;

/*
	출력메소드  System.out.출력메소드(); 
	print()
	println() : 개행문자O (enter를 가지고 있다)
	printf()
 */

public class PrintMain {

	public static void main(String[] args) {
		
		System.out.print('홍');
		
		// 방법3
		System.out.print("A\n");
		// 방법2
		System.out.print('A');
		System.out.print('\n');
		// 방법 1
		System.out.println('A');
		
		System.out.println(10);
		System.out.println(12.34);
		
		// 10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		// 코드 축소
		System.out.println(10 + " " + 12.34 + " " + "홍길동");
		
		System.out.printf("%d %f %s", 10, 12.34, "홍길동\n" );
		
		// 문자열에 + 문자열을 하면 문자열끼리 합쳐져서 출력된다
		System.out.println("김여준" + "김여준");
		
		// 문자 + 문자 = 유니코드로 인해 숫자로 맵핑돼 있어서 숫자끼리 더한거로 출력됨 주의
		System.out.println('A' + 'B');
		System.out.println(10 + ' ');
		// 10 스페이스를 출력하기 위해 문자열로 스페이스를 찍어준다
		System.out.println(10 + " ");

	}
}
