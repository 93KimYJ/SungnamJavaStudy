package kr.ac.kopo.day01;

/*
	명명규칙에 의거하여 클래스, 변수, 메소드 구분하기
	클래스 : (NamingMain, String, Integer, System) ---> 대문자로 시작하는 것!
	메소드 : 3개 (main(), parseInt(), println())
	변수 : 3개 (args, no, out)
*/

public class NamingMain {
	
	public static void main(String[] args) {
		
		int no;
		
		no = Integer.parseInt("123");
		
		System.out.println(no);
		
	}

}
