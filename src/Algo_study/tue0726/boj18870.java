package Algo_study.tue0726;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class boj18870 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// N <= 1,000,000 -> 이진탐색, 최소 HashMap은 써야 함 or 이분탐색 구현
		// sorting...
		// 입력값을 정확하게 기억할 필요 없고, 해당 숫자가 몇 번째로 큰지만 알면 된다. 중복 가능
		// 무식하게 다 리스트 때려박고 이중for문 돌려서 몇번째인지 알아내도 됨 -> 이때는 중복 상관없음 오!
		// map<index, value> sort 때려서 index
		int N = sc.nextInt();
		Integer[] list = new Integer[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}

		// 중복 제거
		Set<Integer> set = new HashSet<>(Arrays.asList(list));
		Integer[] noOverlapList = set.toArray(new Integer[0]);

		// set sort
		Arrays.sort(noOverlapList);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 처음 입력받은 list의 원소에 해당되는 중복 제거&sorting된 list의 인덱스 위치를 출력한다.
		// 이렇게 하면 for문 O(N), list.get(i) O(N)으로 O(N^2) 가 되어버림...
		// 그럼 get(i)만 안 쓰면 되는 거 아닌가? ㅎㅎ
		Map map = new HashMap<Integer, Integer>();
		for (int i = 0; i < noOverlapList.length; i++) {
			// key - noOverlapList의 원소, value - sort된 index
			map.put(noOverlapList[i], i);
		}

		for (int i = 0; i < N; i++) {
			bw.write(map.get(list[i]) + " ");
		}

		bw.flush();
		bw.close();
	}

}
