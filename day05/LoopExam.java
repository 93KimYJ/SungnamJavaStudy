package kr.ac.kopo.day05;

public class LoopExam {
	
	public static void main(String[] args) {
		
		// 1번 ***** 5개씩 5줄
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 2번 11111 22222 ~ 숫자 하나씩 증가 5줄
		int num = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num);
			} num++;
			System.out.println();
		} System.out.println();
		
		// 3번 12345 5줄 찍기
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(1 * j);
				
			}
			System.out.println();
		}System.out.println();
		
		// 4번 12345 23456 34567 ~~ 5줄 찍기
		num = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num + j);
			} num++;
				System.out.println();
		}System.out.println();
		
		// 5번 56789 45678 34567 ~~ 5줄 찍기
		num = 4;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num + j);
			} num--;
			System.out.println();
		}System.out.println();
		
		// 6번 별 한개씩 증가 5줄 찍기
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 7번 별 한개씩 감소 5줄 찍기
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 8번 ***** **** ~ 하나씩 줄이기(우측으로 붙이기)
		for(int i = 1; i <= 5; i++) {
			for(int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();

		// 9번 * ** 하나씩 늘리기 (우측으로 붙이기)
		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		/* 10번 
		*
		**
		***
		****
		*****
		****
		***
		**
		*    */
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i; j++)
				System.out.print("*");
			} else {
				for(int k = 4; k >= i - 5; k--)
					System.out.print("*");
			}
			System.out.println();
		} System.out.println();
		
		/* 11번
		*****
		****
		***
		**
		*
		**
		***
		****
		*****                  */
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 5; j >= i; j--) {
					System.out.print("*");
				}
			} else {
				for(int k = 1; k <= i - 4; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}System.out.println();
		
		/* 12번
		*****
		 ****
		  ***
		   **
		    *
		   ** 
		  ***
		 ****
		*****         */
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 2; j <= i; j++) {
					System.out.print(" ");
				}
				for(int k = 5; k >= i; k--) {
					System.out.print("*");
				}
			} else {
				for(int j = 4; j >= i - 4; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i - 4; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}System.out.println();
		
		/* 13번
		      *
		     **
		    ***
		   ****
		  *****
		   ****
		    ***
		     **
		      *                         */
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 4; j >= i; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i; k++) {
					System.out.print("*");
				}
			} else {
				for(int j = 1; j <= i - 5; j++) {
					System.out.print(" ");
				}
				for(int k = 4; k >= i - 5; k--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}System.out.println();
		
	}

}
