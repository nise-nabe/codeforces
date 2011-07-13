package s74;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), x = s.nextInt();
		char[][] cs = new char[n][];
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < n; ++i) {
			cs[i] = s.next().toCharArray();
			for (char c : cs[i]) {
				set.add(c);
			}
		}
		Map<Character, Double> map = new HashMap<Character, Double>();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				Deque<int[]> q = new ArrayDeque<int[]>();
				boolean[][] b = new boolean[n][m];
				q.add(new int[] { i, j });
				b[i][j] = true;
				while (!q.isEmpty()) {
					int[] p = q.poll();
					if (cs[p[0]][p[1]] == 'S') {
						Double y = map.get(cs[i][j]);
						if (y == null) {
							y = Double.MAX_VALUE;
						}
						map.put(cs[i][j],
								Math.min(y, Math.sqrt(Math.pow(
										Math.abs(i - p[0]), 2)
										+ Math.pow(Math.abs(j - p[1]), 2))));
					}
					for (int[] d : new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 },
							{ 0, -1 } }) {
						int ii = p[0] + d[0], jj = p[1] + d[1];
						if (0 <= ii && ii < n && 0 <= jj && jj < m
								&& !b[ii][jj]) {
							q.add(new int[] { ii, jj });
							b[ii][jj] = true;
						}
					}
				}
			}
		}
		int q = s.nextInt(), r = 0;
		for (char c : s.next().toCharArray()) {
			if (Character.isUpperCase(c)) {
				Double y = map.get(Character.toLowerCase(c));
				if (y == null) {
					System.out.println(-1);
					return;
				}
				if (y > (double) x) {
					++r;
				}
			} else if (!set.contains(c) & !map.containsKey(c)) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(r);
	}
}
