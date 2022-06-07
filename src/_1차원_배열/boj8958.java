package _1차원_배열;

import java.util.Scanner;

public class boj8958 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0;i<tc;i++){
			String t = sc.next();

			int score = 0;
			int answer = 0;
			for(int j = 0;j<t.length();j++){
				score++;
				if(t.charAt(j) == 'O'){
					answer += score;
				}
				else{
					score = 0;
				}
			}
			System.out.println(answer);
		}
	}

}
