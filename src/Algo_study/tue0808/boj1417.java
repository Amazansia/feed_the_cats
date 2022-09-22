package Algo_study.tue0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class boj1417 {

    // 136ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> higher_candidates = new PriorityQueue<>(Collections.reverseOrder());
        int top = Integer.parseInt(br.readLine());
        int temp;
        for (int i = 1; i < N; i++) {
            temp = Integer.parseInt(br.readLine());
            if (top <= temp) {
                higher_candidates.add(temp);
            }
        }

        int count = 0;
        if (N != 1 && higher_candidates.size() != 0) {
            while (higher_candidates.peek() >= top) {
                count++;
                top++;
                int last = higher_candidates.poll();
                higher_candidates.add(last - 1);
            }
        }

        System.out.println(count);
    }
}
