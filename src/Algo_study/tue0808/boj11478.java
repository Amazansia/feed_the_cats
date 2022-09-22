package Algo_study.tue0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

// 680ms
public class boj11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                set.add(str.substring(i, j + 1));
            }
        }

        System.out.println(set.size());
    }
}
