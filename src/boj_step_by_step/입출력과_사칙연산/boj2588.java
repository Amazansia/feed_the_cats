package boj_step_by_step.입출력과_사칙연산;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class boj2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * parseInt(B));
	}

}
