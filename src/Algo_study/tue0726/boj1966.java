package Algo_study.tue0726;

import java.util.LinkedList;
import java.util.Scanner;

public class boj1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTestCase = sc.nextInt();
		while (numTestCase-- > 0) {
			// 문서 개수 Max 100
			int N = sc.nextInt();
			int whichDoc = sc.nextInt();

			// 중요도가 가장 높은 문서부터 순서대로 출력되고, 중요도가 중복일 경우에는 상관없다
			// 출력할 수 있는지 없는지를 매번 확인해야 하나? 아니면 한번에 정리하는 방법이 있을까?
			// 그냥 큐 구현해서 푸는 게 제일 빠를 듯

			// 문서 중요도 리스트 입력받기
			LinkedList<int[]> queue = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				queue.add(new int[]{i, sc.nextInt()});
			}

			int order = 0;

			while (!queue.isEmpty()) {
				int[] front = queue.poll();
				boolean isMax = true;

				for (int i = 0; i < queue.size(); i++) {
					// 인덱스 넘겨가면서 순차조회 해야됨...중요도가 중복될 수도 있고, 낮은 중요도가 올 수도 있기 때문
					// Queue 쓰다가 포기하고 LinkedList 썼음
					if (front[1] < queue.get(i)[1]) {
						queue.offer(front);
						for (int j = 0; j < i; j++) {
							queue.offer(queue.poll());
						}

						isMax = false;
						break;
					}
				}

				if (!isMax) {
					continue;
				}

				order++;
				if (front[0] == whichDoc) {
					break;
				}
			}
			System.out.println(order);

		}
	}

}
