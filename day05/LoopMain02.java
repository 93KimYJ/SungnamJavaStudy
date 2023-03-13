package kr.ac.kopo.day05;

public class LoopMain02 {
	
	public static void main(String[] args) {

		// for문에서 변수 선언을 하면 for 문 안에서만 돌아가기 때문에 똑같은 for문을 여러개 만들때 변수명을 여러개 사용 가능하다
		for(int count = 1; count <= 5; count++) {
			System.out.println("Hello");
		}
		
		for(int count = 1; count <= 3; count++) {
			System.out.println("Good Bye");
		}
		
	}

}
