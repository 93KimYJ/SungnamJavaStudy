package kr.ac.kopo.day01;

public class ConstantMain {

	public static void main(String[] args) {
		
		/* firstNum은 10의 값만 가지고 변경할 수 없게 하기 위해 final을 붙힌다(상수변수)
		 * final이 붙은 상수변수는 수정할 수 없기 때문에 알려주기 위해 대문자로 변수이름을 만든다(명령규칙)
		 */
		final int FIRST_NUM = 10;
		int secondNum = 123;
				
		System.out.println(FIRST_NUM + secondNum);	
		
		
	}

}