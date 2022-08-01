package Brace_for_Impact.saffy_coding_test_2;

import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
*/

/*

tc:
3
5
1 3 4 5 2
4
1 1 2 2
10
2 3 6 5 8 9 7 1 1 2

 */
public class Solution {

	public static void main(String[] args) throws Exception {
		/*
		 * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 sample_input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이
		 * 작성한 코드를 테스트 할 때, 편의를 위해서 sample_input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면
		 * 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이
		 * 메소드를 사용하셔도 좋습니다. 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		// System.setIn(new java.io.FileInputStream("rcs/sample_input(1).txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			int N = sc.nextInt();
			int[] list = new int[N + 1];

//			// N == 1이라면 언제나 가능, 넘어감
//			if (N == 1) {
//				System.out.println("#" + test_case + " 0");
//				continue;
//			}

			// 홀/짝 기준 절반 혹은 절반에 근사하게 나눠지지 않으면 조건 만족 불가
			int odd_count = 0;
			for (int i = 1; i <= N; i++) {
				list[i] = sc.nextInt() % 2;
				if (list[i] == 1) {
					odd_count++;
				}
			}

			// 수열 길이 짝수, 짝수갯수 == 홀수갯수
			int sum = 0;
			int[] error = new int[N];
			if (N % 2 == 0 && odd_count == N / 2) {
				int j = 0;
				// 홀수 스타트 1010
				if (list[1] == 1) {
					for (int i = 1; i <= N; i++) {
						if (list[i] != i % 2) {
							error[j++] = i;
						}
					}
				} else { // 짝수 스타트 0101
					for (int i = 1; i <= N; i++) {
						if (list[i] == i % 2) {
							error[j++] = i;
						}
					}
				}
				while (j > 1) {
					sum += error[j - 1] - error[j - 2];
					j -= 2;
				}
				System.out.println("#" + test_case + " " + sum);

			}
			// 수열 길이 홀수, 짝수갯수와 홀수갯수 근사함
			else if (N % 2 == 1 && (odd_count == N / 2 || odd_count == (N / 2) + 1)) {

				int j = 0;
				// 홀/짝 odd_count/odd_count+1, 짝수 스타트
				// 01010
				if (odd_count == N / 2) {
					for (int i = 1; i <= N; i++) {
						if (list[i] == i % 2) {
							error[j++] = i;
						}
					}
				}
				// 홀/짝 odd_count+1/odd_count, 홀수 스타트
				// 10101
				else {
					for (int i = 1; i <= N; i++) {
						if (list[i] != i % 2) {
							// 1 4 System.out.println("error[" + i + "]: " + i);
							error[j++] = i;
						}
					}
				}
				while (j > 1) {
					sum += error[j - 1] - error[j - 2];
					j -= 2;
				}
				System.out.println("#" + test_case + " " + sum);
			} else {
				System.out.println("#" + test_case + " -1");
			}

			/////////////////////////////////////////////////////////////////////////////////////////////
			// 표준출력(화면)으로 답안을 출력합니다.

		}

		sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
	}
}