package boj_step_by_step.조건문;

import java.util.Scanner;

public class boj2884 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		if(min < 45) {
			if (hour == 0) {
				hour = 24;
			}
			System.out.println((hour - 1) + " " + (min + 15));
		}
		else
			System.out.println(hour + " " + (min - 45));
	}

}
