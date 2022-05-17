package 반복문;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loof = sc.nextInt();
		int[] answer = new int[loof];
		int[] A = new int[loof];
		int[] B = new int[loof];
		for (int i = 0; i < loof; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			answer[i] = A[i] + B[i];
		}
		for (int i = 1; i <= loof; i++) {
			System.out.println(
				"Case #" + i + ": " + A[i - 1] + " + " + B[i - 1] + " = " + answer[i - 1]);
		}
	}

}
