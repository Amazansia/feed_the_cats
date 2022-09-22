package Algo_study.tue0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 612ms

public class boj1939 {

    private static ArrayList<Nodes>[] nodeLists;
    private static boolean[] visit;

    private static class Nodes {

        int end;
        int weight;

        // start 지점은 해당 인덱스
        Nodes(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        nodeLists = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            nodeLists[i] = new ArrayList<>();
        }

        // 이분탐색용 변수
        int left = 0;
        int right = 0;

        int max = 0;


        // 입력받고 최댓값을 이분탐색의 right값으로 씀
        // 양방향 그래프로 저장
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            nodeLists[A].add(new Nodes(B, C));
            nodeLists[B].add(new Nodes(A, C));
            max = Math.max(max, C);
        }
        right = max;

        st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());


        // 이분탐색: mid - "옮길 수 있는 물품들의 중량의 최댓값"
        while (left <= right) {
            int mid = (left + right) / 2;


            // bfs로 검색하여 도달 가능하면 left값 옮김
            if (bfs(start, end, mid, N)) {
                left = mid + 1;
            } else right = mid - 1;
        }

        // 끝나면 right에 최댓값이 저장됨(mid아님)

        System.out.println(right);
    }

    private static boolean bfs(int start, int end, int mid, int N) {

        Queue<Integer> queue = new LinkedList<>();
        // 매번 다시 초기화해야됨
        visit = new boolean[N + 1];

        queue.add(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            int island = queue.poll();

            // 끝에 도달할 경우에만 완료
            if (island == end) {
                return true;
            }

            // 순서대로 방문하며 체크
            for (Nodes nodes : nodeLists[island]) {
//                if (!visit[nodes.end] && mid <= nodes.weight) {
//                    visit[nodes.end] = true;
//                    queue.add(nodes.end);
//                }

                if (visit[nodes.end] || nodes.weight < mid) continue;
                visit[nodes.end] = true;
                queue.add(nodes.end);
            }
        }

        return false;
    }


}