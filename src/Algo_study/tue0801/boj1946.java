package Algo_study.tue0801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj1946 {

	// 최대 인원수를 뽑겠다는 말은, 즉 높은 놈들은 안 뽑겠다는 뜻.
	// 낮은 애들을 많이 뽑겠다는 말과 같다.
	public static void main(String[] args) throws IOException {
		// 입출력 스캐너로 하면 안 될 것 같은데...ㅎㅎ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int i = 0; i < TC; i++) {
			int N = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> test_interviewMap = new TreeMap<>();

			// TreeMap으로 받았기 때문에 정렬이 key 기준, 즉 성적순으로 자동으로 됨
			// <test, interview>
			for (int j = 0; j < N; j++) {
				StringTokenizer temp = new StringTokenizer(br.readLine());
				test_interviewMap.put(Integer.parseInt(temp.nextToken()),
					Integer.parseInt(temp.nextToken()));
			}

			int count = 1;

			// 서류 1등 친구의 인터뷰 성적 가져오기
			// 밑의 친구들은 다 서류 성적이 1등 친구보다 낮으니, 인터뷰 성적까지 낮으면 탈락.
			int standard = test_interviewMap.get(1);
			for (Integer key : test_interviewMap.keySet()) {
				if (key == 1) {
					continue;
				} else {
					if (standard >= test_interviewMap.get(key)) {
						standard = test_interviewMap.get(key);
						count++;
					}
				}
			}
			System.out.println(count);

		}


	}

}
