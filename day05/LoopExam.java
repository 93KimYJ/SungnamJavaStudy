package kr.ac.kopo.day05;

public class LoopExam {
	
	public static void main(String[] args) {
		
		// 1�� ***** 5���� 5��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 2�� 11111 22222 ~ ���� �ϳ��� ���� 5��
		int num = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num);
			} num++;
			System.out.println();
		} System.out.println();
		
		// 3�� 12345 5�� ���
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(1 * j);
				
			}
			System.out.println();
		}System.out.println();
		
		// 4�� 12345 23456 34567 ~~ 5�� ���
		num = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num + j);
			} num++;
				System.out.println();
		}System.out.println();
		
		// 5�� 56789 45678 34567 ~~ 5�� ���
		num = 4;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num + j);
			} num--;
			System.out.println();
		}System.out.println();
		
		// 6�� �� �Ѱ��� ���� 5�� ���
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 7�� �� �Ѱ��� ���� 5�� ���
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 8�� ***** **** ~ �ϳ��� ���̱�(�������� ���̱�)
		for(int i = 1; i <= 5; i++) {
			for(int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();

		// 9�� * ** �ϳ��� �ø��� (�������� ���̱�)
		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		/* 10�� 
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
		
		/* 11��
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
		
		/* 12��
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
		
		/* 13��
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
