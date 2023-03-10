package kr.ac.kopo.day03;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int num = 123;
		
//		num = num + 1;
		
		// 더한값을 업데이트 (복합대입 연산자, 배정연산자) : += -= *= /= &=
		num += 50;
		
		++num;
		
		System.out.println("num : " + num);
		
		num--;
		
		System.out.println("num : " + num);
		
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
//		++a; = 전위증가 연산자
//		a++; = 후위증가 연산자
		
		/* 
		   == 서로 같은경우
		   != 서로 다른경우
		   && AND
		   || OR
		   ! NOT
		*/
	}

}
