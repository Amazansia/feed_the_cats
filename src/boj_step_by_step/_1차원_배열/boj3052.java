package boj_step_by_step._1차원_배열;

import java.util.Scanner;

public class boj3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			list[i] = sc.nextInt() % 42;
		}

		int answer = 10;
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (list[i] == list[j]) {
					answer--;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
