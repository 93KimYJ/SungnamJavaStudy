package kr.ac.kopo.day05;

public class LoopMain03 {
	
	public static void main(String[] args) {
		
/*		int count = 1;
		while(count >= 5) {  // 조건문을 먼저 보고 실행할지 결정하기 때문에 false일 경우 바로 빠져나가게 된다
			System.out.println("Hello");
			++count;
		}
		
		for(; count >= 5; count++) {  //  for문도 마찬가지 반복문은 최하 0회 실행하게됨
			System.out.println("Hello");
			++count;
		}*/
		
		int cnt = 1;
		do {  /* while이 참이라면  do라는 키워드가 있는 블록스코프 부터 실행한다
		 (조건문과 반복문의 위치를 바꾸는 경우 사용, 왜? = 최하 경우 최소 한번은 찍기 위해) */
			System.out.println("Hello");
			++cnt;
		} while(cnt <= 5); // do ~ while문은 에러체크 할 때 많이 사용한다. (이런식의 문법이 있다 정도만 알자)

	}

}
