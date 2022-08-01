package Algo_study.tue0801;

import java.util.Scanner;

public class boj14501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1 <= N <= 15
		int N = sc.nextInt();
		int[] T = new int[N];
		int[] P = new int[N];
		int[] dp = new int[N];

		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}

		int Max = 0;

		// 이미 계산된 값을 사용하기 위해 역방향으로 dp를 돌린다
		for (int i = N - 1; i >= 0; i--) {

			// 이 경우는 i + T[i]에 접근할 경우 OutofIndex
			// 이날의 업무를 할 수 없어도 이 날짜로부터 얻을 수 있는 최대 이윤은 Max로 고정임
			// 마지막 날 이틀 걸리는 업무는 그냥 0으로 계산됨(뒤에서부터 도니까)
			if (i + T[i] > N) {
				dp[i] = Max;
			} else {
				// 이제 실행 가능한 업무만 남음, T가 더해졌을 때를 신경쓰지 않아도 됨
				// 오늘의 값 더해주기
				dp[i] = P[i];
				// 더 갈 수 있다면 이미 구해놓은 dp값을 더해서 갱신하기
				if (i + T[i] < N) {
					dp[i] += dp[i + T[i]];
				}
				// Max값을 둘 다 저장해 주어야 함(만약 갱신된다면)
				dp[i] = Math.max(dp[i], Max);
				Max = dp[i];
			}
		}

		System.out.println(Max);
	}

}
