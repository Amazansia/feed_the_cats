package boj_step_by_step.함수;

import java.util.Arrays;

public class boj4673 {

	public static void main(String[] args) {
		int i = 1;
		int[] list = new int[10001];
		Arrays.fill(list, 0);
		for(i = 1;i<=10000;i++){
			if(self_number(i) <= 10000)
				list[self_number(i)] = 1;
		}
		//System.out.println(self_number(1));
		for(i = 1;i<=10000;i++){
			if(list[i] != 1)
				System.out.println(i);
		}
	}

	static int self_number(int n) {
		int ans = n;
		String temp = String.valueOf(n);
		for(int i = 0;i<temp.length();i++){
			ans += temp.charAt(i) - '0';
		}
		return ans;
	}

}
