package boj_step_by_step.반복문;

import java.util.Scanner;

public class boj10952 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A, B;
		while(true){
			A = sc.nextInt();
			B = sc.nextInt();
			if(A == 0  && B == 0)
				break;
			System.out.println(A + B);
		}
	}
}
