package boj_self;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
x y -> 부모 자식
부모자식 관계가 있을 때마다 촌수가 하나씩 늘어남
 */

public class boj2644 {

	// list decl
	static LinkedList<Integer>[] relation_list;
	static int[] visited;

	// answer
	static int answer = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int num = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		int m = sc.nextInt();
		// list init
		relation_list = new LinkedList[num + 1];
		for (int i = 1; i < num + 1; i++) {
			relation_list[i] = new LinkedList<>();
		}
		visited = new int[num + 1];

		for (int i = 1; i < m + 1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			relation_list[x].add(y);
			relation_list[y].add(x);
		}

		dfs_list(start, end, count);

		System.out.println(answer);
	}

	private static void dfs_list(int start, int end, int count) {
		if (start == end) {
			answer = count;
			return;
		}

		visited[start]++;

		Iterator<Integer> iter = relation_list[start].iterator();
		while (iter.hasNext()) {
			int next = iter.next();
			if (visited[next] == 0) {

				dfs_list(next, end, count + 1);
			}
		}
	}

}
