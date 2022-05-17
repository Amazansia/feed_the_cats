package 반복문;

import java.util.Scanner;

public class boj10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] list = new int[N];

		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (list[i] < X) {
				System.out.print(list[i] + " ");
			}
		}
	}

}
