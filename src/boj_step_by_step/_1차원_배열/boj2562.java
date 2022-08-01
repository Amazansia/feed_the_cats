package boj_step_by_step._1차원_배열;

import java.util.Scanner;

public class boj2562 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int comparison = -1;
		int save_i = 1;
		for (int i = 1;i<=9;i++){
			int t = sc.nextInt();
			if(comparison < t){
				save_i = i;
				comparison = t;
			}
		}
		System.out.println(comparison + "\n" + save_i);

	}

}
