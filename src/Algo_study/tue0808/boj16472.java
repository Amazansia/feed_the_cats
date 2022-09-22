package Algo_study.tue0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj16472 {

    // 160ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String catTalk = br.readLine();

        int[] alphabet = new int[26];
        int max = 0;
        int count = 0;
        int start = 0;
        int end = 0;


        // while 들어가기 전 첫 진입 작업
        alphabet[catTalk.charAt(start) - 'a']++;
        count++;

        while (true) {
            end++;

            // end가 끝까지 갔다면 종료
            if (end == catTalk.length()) break;

            int spell = catTalk.charAt(end) - 'a';
            alphabet[spell]++;

            if (alphabet[spell] == 1)
                count++;

            while (count > N) {
                int temp = catTalk.charAt(start) - 'a';
                alphabet[temp]--;

                if (alphabet[temp] == 0)
                    count--;

                start++;
            }
            max = Math.max(max, end - start + 1);
        }

        System.out.println(max);
    }
}
