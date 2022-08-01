package Algo_study.tue0726;

import java.util.Scanner;

public class boj1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2,100,000,000
		int N = sc.nextInt();
		int[] list = new int[10001];
		int index = 0;
		int i = 666;
		while (index <= N) {
			if (String.valueOf(i).contains("666")) {
				list[index] = i;
				index++;
			}
			i++;
		}
		System.out.println(list[N - 1]);
	}

}
