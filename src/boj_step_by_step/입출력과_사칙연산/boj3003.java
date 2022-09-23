package boj_step_by_step.입출력과_사칙연산;

import java.util.Scanner;

public class boj3003 {

	public static void main(String[] args) {
		int[] temp = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			temp[i] = sc.nextInt();
		}

		System.out.print(1 - temp[0] + " ");
		System.out.print(1 - temp[1] + " ");
		System.out.print(2 - temp[2] + " ");
		System.out.print(2 - temp[3] + " ");
		System.out.print(2 - temp[4] + " ");
		System.out.print(8 - temp[5]);

	}


}
