package Algo_study.tue0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 저번에 푼 문제랑 상당히 비슷한듯... 14501? 이었던가
// 148ms

public class boj2156 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        int max;
        int[] list;
        int[] dp;

        N = Integer.parseInt(br.readLine());

        list = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {

            list[i] = Integer.parseInt(br.readLine());
        }

        // 앞에서부터 순서대로 마시나 뒤에서부터 마시나 상관없다
        // 앞에서부터 순서대로 마신다고 가정
        // 최대 두 잔을 연속으로 마실 수 있음, 즉 i - 1, i - 2, i - 3까지 들여다봐야 함
        // 이때 걍 연속 두잔의 조건을 넣는 게 맞을듯
        // 1 ~ i번까지 점화식을 이용해서 가장 많이 마실 수 있는 포도주의 양을 dp[i]에 저장

        dp = new int[N + 1];

        dp[1] = list[1];
        if (N > 1) {
            dp[2] = list[1] + list[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + list[i], dp[i - 3] + list[i] + list[i - 1]));
        }

        System.out.println(dp[N]);
    }
}
