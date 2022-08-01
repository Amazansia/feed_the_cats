package boj_step_by_step.조건문;

import java.util.Arrays;
import java.util.Scanner;

public class boj2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[7];
		Arrays.fill(list, 0);
		list[sc.nextInt()]++;
		list[sc.nextInt()]++;
		list[sc.nextInt()]++;

		for (int i = 1; i < 7; i++) {
			if (list[i] == 3) {
				System.out.println(i * 1000 + 10000);
				return;
			} else if (list[i] == 2) {
				System.out.println(i * 100 + 1000);
				return;
			} else if (list[i] == 1) {
				list[0] = i;
			}
		}
		System.out.println(list[0] * 100);
	}

}
