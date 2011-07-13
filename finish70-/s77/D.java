import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		int x = s.nextInt() - 1, y = s.nextInt() - 1;
		int[][] a = new int[n][n];
		for (int[] aa : a) {
			Arrays.fill(aa, -1);
		}
		for (int i = 0; i < m; ++i) {
			int u = s.nextInt() - 1, v = s.nextInt() - 1;
			a[u][v] = a[v][u] = s.nextInt();
		}
		int[][] c = new int[n][];
		for (int i = 0; i < n; ++i) {
			c[i] = new int[] { s.nextInt(), s.nextInt() };
		}
		boolean[] b = new boolean[n];
		Queue<long[]> q = new PriorityQueue<long[]>(m,
				new Comparator<long[]>() {
					@Override
					public int compare(long[] o1, long[] o2) {
						long x = o1[1] - o2[1];
						if (x != 0) {
							return x < 0 ? -1 : 1;
						}
						return o1[2] > o2[2] ? -1 : 1;
					}
				});
		q.add(new long[] { x, 0, 0 });
		b[x] = true;
		long min = Long.MAX_VALUE;
		while (!q.isEmpty()) {
			long[] p = q.poll();
			if (p[0] == y) {
				min = Math.min(min, p[1]);
				continue;
			}
			for (int i = 0; i < n; ++i) {
				int len = a[(int) p[0]][i];
				if (!b[i] && len >= 0) {
					if (c[(int)p[0]][0] - len >= 0) {
						long[] ls = { i, p[1] + c[i][1], c[i][0] - len };
						q.add(ls);
						b[i] = true;
					}
					if (p[2] > 0 && p[2] - len >= 0) {
						long[] ls = { i, p[1], p[2] - len };
						q.add(ls);
						b[i] = true;
					}
				}
			}
		}
		System.out.println(min < Long.MAX_VALUE ? min : -1);
	}
}
