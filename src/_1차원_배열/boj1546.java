package _1차원_배열;

import java.util.Scanner;

public class boj1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double MAX = 0;

		double list[] = new double[N];

		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
			if (list[i] > MAX) {
				MAX = list[i];
			}
		}

		double sum = 0;

		for (int i = 0; i < N; i++) {
			list[i] = list[i] / MAX * 100;
			sum += list[i];
		}

		System.out.println(sum / N);


	}

}
