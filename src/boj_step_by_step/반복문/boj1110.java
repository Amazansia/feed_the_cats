package boj_step_by_step.반복문;

import java.util.Scanner;

public class boj1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int goal = N;
		int count = 0;
		while (N != goal || count == 0) {
			int sum = N % 10 + N / 10;
			N = N % 10 * 10 + sum % 10;
			count++;
		}
		System.out.print(count);
	}

}
