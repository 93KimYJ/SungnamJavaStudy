package kr.ac.kopo.day02;

public class VariableMain02 {
	
	public static void main(String[] args) {
		
		double num = 12.34;
		// 형변환
		num = (double)34;
//		num = 34;      // 더블이 인트보다 크기가 더 크기 때문에 (double)을 생략할 수 있다 : (묵시적 형변환)

		System.out.println("num : " + num);
		
		int num2;
		num2 = (int)12.34;   // 형변환 키워드가 들어가는 형변환은 강제적(명시적)형변환
		
		System.out.println("num2 : " + num2);
		
		float num3;
		num3 = (float)10.4;   // 실수는 기본 자료형이 double이기 때문에 더 크기가 작은 float를 쓰려면 명시적형변환을 해줘야한다
		num3 = 10.4f;  // --> 실수 뒤에 f를 붙혀주면 float로 인식 다른 자료형도 마찬가지 L(long형)
		
		System.out.println("num3 : " + num3);
		
		System.out.println(12 + (int)12.34);
		System.out.println(/*(double)*/12 + 12.34);  // 더하기나 빼기할때 데이터타입이 다르면 큰 타입으로 따라가기 때문에 묵시적형변환을 해줄 필요가 없다.
			
	}

}
