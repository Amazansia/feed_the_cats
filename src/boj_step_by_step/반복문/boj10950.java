package boj_step_by_step.반복문;

import java.util.Scanner;

public class boj10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loof = sc.nextInt();
		int[] answer = new int[loof];
		for (int i = 0; i < loof; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			answer[i] = A + B;
		}
		for (int i = 0; i < loof; i++) {
			System.out.println(answer[i]);
		}
	}

}
