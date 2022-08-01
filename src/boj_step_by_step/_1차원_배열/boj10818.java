package boj_step_by_step._1차원_배열;

import java.util.Arrays;
import java.util.Scanner;

public class boj10818 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int list[] = new int[N];
		for (int i = 0;i<N;i++){
			list[i] = sc.nextInt();
		}
		System.out.println(Arrays.stream(list).min().getAsInt() + " " + Arrays.stream(list).max().getAsInt());

	}

}
