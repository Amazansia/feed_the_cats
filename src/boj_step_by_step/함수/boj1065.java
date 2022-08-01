package boj_step_by_step.함수;

import java.util.Scanner;

public class boj1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			if (isHannum(i)) {
				sum++;
			}
		}
		System.out.println(sum);

	}

	private static boolean isHannum(int n) {
		if (n >= 100) {
			String str = String.valueOf(n);
			int dif = str.charAt(str.length() - 1) - str.charAt(str.length() - 2);
			for (int i = str.length() - 1; i >= 1; i--) {
				if (str.charAt(i) - str.charAt(i - 1) != dif) {
					return false;
				}
			}
		}
		return true;
	}

}
