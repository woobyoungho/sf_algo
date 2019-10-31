package com.wbh.algo;

import java.util.Scanner;

public class PrintStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 입력 : ");
		int line = sc.nextInt();
		printStar(line);

		reversePrintStar(line);
	}

	/*
	
	----*	0 j         4 
	---**	1 j       3 4
	--***	2 j     2 3 4
	-****	3 j   1 2 3 4 
	*****	4 j 0 1 2 3 4
	
	*/
	public static void reversePrintStar(int line) {
		System.out.println("ex1)");
		for(int i = 0; i < line; i++) {
			for(int j = line; j > 0; j--) {
				if(i > (j-2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("ex2)");
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < line; j++) {
				if(j < (line - (i+1))) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printStar(int line) {
		for (int i = 0; i < line; i++) { // 밑으로 내려가는 거
			for (int j = 0; j <= i; j++) { // 옆으로 가는 거
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

}
