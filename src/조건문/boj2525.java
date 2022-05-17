package 조건문;

import java.util.Scanner;

public class boj2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();

		int time_hour = time / 60;
		int time_min = time % 60;
		if (min + time_min >= 60) {
			hour = (hour + time_hour + 1) % 24;
			System.out.println(hour + " " + (min + time_min - 60));
		} else {
			hour = (hour + time_hour) % 24;
			System.out.println(hour + " " + (min + time_min));
		}
	}

}
