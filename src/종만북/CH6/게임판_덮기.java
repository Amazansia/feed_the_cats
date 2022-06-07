package 종만북.CH6;

import java.util.Scanner;


public class 게임판_덮기 {

	static int coverType[][][] = {
		{{0, 0}, {1, 0}, {0, 1}},
		{{0, 0}, {1, 0}, {1, 1}},
		{{0, 0}, {0, 1}, {1, 1}},
		{{0, 0}, {1, 0}, {1, -1}}
	};

	private static boolean set(int[][] map, int y, int x, int type, int delta) {
		boolean ok = true;
		for (int i = 0; i < 3; ++i) {
			int ny = y + coverType[type][i][0];
			int nx = x + coverType[type][i][1];

			if (ny < 0 || ny >= map.length || nx < 0 || nx >= map[0].length) {
				ok = false;
			} else if ((map[ny][nx] += delta) > 1) {
				ok = false;
			}
		}
		return ok;
	}

	private static int cover(int[][] map) {
		int y = -1, x = -1;
		for (int i = 0; i < map.length; ++i) {
			for (int j = 0; j < map[i].length; ++j) {
				if (map[i][j] == 0) {

					y = i;
					x = j;
					break;
				}
			}
			if (y != -1) {
				break;
			}
		}

		if (y == -1) {
			return 1;
		}

		int ret = 0;
		for (int type = 0; type < 4; ++type) {
			if (set(map, y, x, type, 1)) {
				ret += cover(map);
			}
			set(map, y, x, type, -1);
		}
		return ret;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();

		for (int tc = 1; tc <= test_case; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			int[][] map = new int[H][W];
			int white_count = 0;
			int answer = 0;

			for (int i = 0; i < H; i++) {
				String temp = sc.next();
				for (int j = 0; j < W; j++) {
					// #은 검은 칸 1, .는 흰 칸 0
					map[i][j] = (temp.charAt(j) == '.') ? 0 : 1;
					if (map[i][j] == 0) {
						white_count++;
					}
				}
			}

			// 흰 칸의 개수가 3이 아니라면
			if (white_count % 3 != 0) {
				System.out.println(answer + "hi");
				continue;
			}

			answer = cover(map);

			System.out.println(answer);

		}
	}


}
