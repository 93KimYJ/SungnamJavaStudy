package kr.ac.kopo.day05;

public class LoopMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("----- start -----");
		int count = 1;
		while(count <= 5) {
			System.out.println("Hello");
			++count;
		}
		System.out.println("----- end -----");
		System.out.println("count : " + count); // while문에서는 변수가 메인메소드 블록스코프 안에 있기 때문에 메인메소드 블록스코프 안에서는 사용 가능
		
		count = 1;  // while문에서는 변수를 초기화 해주는 작업이 필요함
		while(count <= 3) {
			System.out.println("Good Bye");
			++count;
		}
	}

}
