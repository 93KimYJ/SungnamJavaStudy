package kr.ac.kopo.day02;

public class VariableMain {
	
	public static void main(String[] args) {
		
		char ch;
		ch = 'A';
		System.out.println("ch : " + ch);
		
		{
			int a = 10;
			System.out.println("a : " + a);
		}
//		a = 20;  --> 변수는 블록스코프 안에서만 라이프사이클이 돌기 때문에 블록스코프 밖에서 변경하면 에러가 발생한다.
		
		ch = '!';
		ch = 79;
		ch = '\u0061';
		
		System.out.println("ch : " + ch);
	}

}
