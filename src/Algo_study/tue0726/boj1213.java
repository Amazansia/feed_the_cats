package Algo_study.tue0726;

import java.util.Scanner;

public class boj1213 {

	public static void main(String[] args) {
		// 팰린드롬: 앞뒤를 뒤집어도 똑같은 문자열
		Scanner sc = new Scanner(System.in);
		int[] spell = new int[26];
		String name = sc.next();

		// 주어진 알파벳 갯수 세기
		for (int i = 0; i < name.length(); i++) {
			spell[name.charAt(i) - 'A']++;
		}

		StringBuilder answer = new StringBuilder();
		int odd_count = 0;
		for (int i = 0; i < spell.length; i++) {

			if (spell[i] % 2 != 0) {
				odd_count++;
			}
		}

		if (odd_count > 1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}

		for (int i = 0; i < spell.length; i++) {
			for (int j = 0; j < spell[i] / 2; j++) {
				answer.append((char) (i + 'A'));
			}
		}

		String reversed = new StringBuilder(answer.toString()).reverse().toString();

		for (int i = 0; i < spell.length; i++) {
			if (spell[i] % 2 == 1) {
				answer.append((char) (i + 'A'));
			}
		}

		answer.append(reversed);
		System.out.println(answer);
	}

}
