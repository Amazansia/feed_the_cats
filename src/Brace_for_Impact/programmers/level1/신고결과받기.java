package Brace_for_Impact.programmers.level1;


public class 신고결과받기 {

	class Solution {

		static int matchWith(String s, String[] id_list) {
			for (int i = 0; i < id_list.length; i++) {
				if (s.equals(id_list[i])) {
					return i;
				}
			}
			return 0;
		}

		public static int[] solution(String[] id_list, String[] report, int k) {
			int list_length = id_list.length;
			int[] answer = new int[list_length];

			int[][] report_table = new int[list_length + 1][list_length + 1];
			for (String rep : report) {
				String reporting = rep.split(" ")[0];
				int reporting_num = matchWith(reporting, id_list);
				String reported = rep.split(" ")[1];
				int reported_num = matchWith(reported, id_list);

				if (report_table[reporting_num][reported_num] != 1) {
					report_table[list_length][reported_num]++;
				}
				report_table[reporting_num][reported_num] = 1;
				//System.out.println("repoting_num:"+reporting_num+" reported_num:"+reported_num);
			}
			for (int i = 0; i < list_length; i++) {
				for (int j = 0; j < list_length; j++) {
					if (report_table[list_length][i] >= k && report_table[j][i] > 0) {
						answer[j]++;
					}
				}
			}
			return answer;
		}


	}

}
