package s29;
import java.util.*;

public class D_AntOnTheTree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt() + 1;
		long[][] a = new long[n][n];
		int[][] p = new int[n][n];
		for (int i = 1; i < n; ++i) {
			Arrays.fill(a[i], Integer.MAX_VALUE);
			a[i][i] = 0;
		}
		for (int i = 0; i < n - 2; ++i) {
			int x = s.nextInt(), y = s.nextInt();
			a[x][y] = a[y][x] = 1;
			p[x][y] = x;
			p[y][x] = y;
		}
		for (int t = 1; t < n; ++t) {
			for (int i = 1; i < n; ++i) {
				for (int j = 1 + i; j < n; ++j) {
					long l = a[i][t] + a[t][j];
					if (a[i][j] > l) {
						a[i][j] = a[j][i] = l;
						p[i][j] = p[t][j];
						p[j][i] = p[t][i];
					}
				}
			}
		}
		List<Integer> leavs = new ArrayList<Integer>();
		for (; s.hasNext();) {
			leavs.add(s.nextInt());
		}
		leavs.add(1);
		List<Integer> path = new ArrayList<Integer>();
		path.add(1);
		int e = 1;
		for (int lf : leavs) {
			List<Integer> path2 = path(e, lf, p);
			if (path2 == null) {
				System.out.println(-1);
				return;
			}
			path.addAll(path2);
			path.remove(path.size() - 1);
			e = lf;
		}
		System.out.println(path.toString().replaceAll("[\\[\\],]", ""));
	}

	static List<Integer> path(int from, int to, int[][] p) {
		List<Integer> path = new ArrayList<Integer>();
		path.add(to);
		while (from != to) {
			int tmp = p[from][to];
			if (p[tmp][to] < 1) {
				return null;
			}
			path.add(to);
			p[tmp][to] = 0;
			to = tmp;
		}
		Collections.reverse(path);
		return path;
	}
}
