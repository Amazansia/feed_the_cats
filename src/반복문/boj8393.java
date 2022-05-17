package 반복문;

import java.io.IOException;
import java.util.Scanner;

public class boj8393 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N * (N + 1) / 2);
	}

}
