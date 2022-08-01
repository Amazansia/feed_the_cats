package boj_step_by_step.반복문;

import java.util.Scanner;

public class boj11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loof = sc.nextInt();
		int[] list = new int[loof];
		for (int i = 0; i < loof; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			list[i] = A + B;
		}
		for (int i = 1; i <= loof; i++) {
			System.out.println("Case #" + i + ": " + list[i - 1]);
		}
	}

}
