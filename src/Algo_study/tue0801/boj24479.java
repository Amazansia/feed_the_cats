package Algo_study.tue0801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class boj24479 {

	static int count = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		// 0으로 초기화? 안해줘도? 되겠지?
		int visited[] = new int[N + 1];

		LinkedList<Integer>[] list = new LinkedList[N + 1];
		for (int i = 0; i < N + 1; i++) {
			list[i] = new LinkedList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			list[v1].add(v2);
			list[v2].add(v1);
		}
		for (int i = 0; i < N + 1; i++) {
			Collections.sort(list[i]);
		}

		dfs_list(R, list, visited);
		for (int i = 1; i < N + 1; i++) {
			System.out.println(visited[i]);
		}
	}

	static void dfs_list(int v, LinkedList<Integer>[] linkedLists, int[] visited) {
		visited[v] = count++;
		Iterator<Integer> iter = linkedLists[v].listIterator();
		while (iter.hasNext()) {
			int next = iter.next();
			if (visited[next] == 0) {
				dfs_list(next, linkedLists, visited);
			}
		}
	}
}
