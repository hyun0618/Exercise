package com.itwill.loop;

import java.util.Random;

public class Loop {

	public static void main(String[] args) {

		// LoopMain08
		// (1) while 반복문 while (조건식) {...} => 조건을 만족하는 동안 반복. 
		// 조건식이 "false"이면 블록이 한번도 실행되지 않는다.
		
		// (2) do {...} while (조건식);

		int x = 1;
		while (x <= 5) {
			System.out.println(x);
			x++;
		}

		// LoopMain12
		// 주사위 2개를 던졌을 때 결과를 (x, y) 형식으로 출력. 
		// 주사위 2개의 눈의 합이 5가 되면 실행을 멈춤.

		System.out.println("*** 주사위 ***");
		Random rand = new Random();

		while (true) {
			int a = rand.nextInt(1, 7);
			int b = rand.nextInt(1, 7);
			System.out.printf("(%d, %d)", a, b);
			if (a + b == 5) {
				break;
			}
		}
		
	
		// LoopMain13
		
		// LoopMain14

	}

}
