package _1차원_배열;

import java.util.Scanner;

public class boj4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();

		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();
			int list[] = new int[N];
			int sum = 0;
			for (int j = 0; j < N; j++) {
				list[j] = sc.nextInt();
				sum += list[j];
			}

			double mean = (double) sum / N;

			int studentOverMean = 0;
			for (int j = 0; j < N; j++) {
				if (mean < list[j]) {
					studentOverMean++;
				}
			}
			double answer = studentOverMean / (double) N * 100;

			System.out.printf("%.3f%%%n", answer);

		}
	}

}
