package boj_step_by_step._1차원_배열;

import java.util.Arrays;
import java.util.Scanner;

public class boj2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String ABCString = String.valueOf(A * B * C);
		int[] list = new int[10];
		Arrays.fill(list, 0);

		for (int i = 0; i<ABCString.length();i++) {
			list[ABCString.charAt(i) - '0']++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(list[i]);
		}
	}
}
