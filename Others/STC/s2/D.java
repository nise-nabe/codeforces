package STC.s2;
import java.util.*;

public class D {
	public static void main(String[] args) {
		int n = next();
		int[][] a = new int[n][3];
		for (int i = 0; i < n; ++i) {
			a[i][0] = next();
			a[i][1] = next();
			a[i][2] = next();
		}
		double[][] d = new double[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				double dst = 0;
				for (int k = 0; k < 3; ++k) {
					dst += Math.pow(a[i][k] - a[j][k], 2);
				}
				d[i][j] = d[j][i] = Math.sqrt(dst);
			}
		}
		boolean[][] b = new boolean[n][n];
		Queue<double[]> q = new PriorityQueue<double[]>(n * n,
				new Comparator<double[]>() {
					@Override
					public int compare(double[] o1, double[] o2) {
						return Double.compare(o1[2], o2[2]);
					}
				});
		q.add(new double[] { 0, 0, 0 });
		double result = Double.MAX_VALUE;
		boolean f= true;
		while (!q.isEmpty() && f) {
			double[] p = q.poll();
			int from = (int) p[0], to = (int) p[1];
			for (int i = 0; i < n; ++i) {
				if (to == i || from == i)
					continue;
				if (b[to][i]) {
					result = Math.min(result, p[2] - d[to][i] / 2);
					f = false;
				}
				q.add(new double[] { to, i, p[2] + d[to][i] });
				b[to][i]=true;
			}
		}
		System.out.println(result);
	}

	static int next() {
		int r = 0, s = 1, b = ' ';
		try {
			for (; b == '\n' || b == ' '; b = bis.read())
				;
			if ((s = b == '-' ? -1 : 1) < 0) {
				b = bis.read();
			}
			for (; '0' <= b && b <= '9'; b = bis.read())
				r = r * 10 + b - '0';
		} catch (Exception e) {
		}
		return s * r;
	}

	static java.io.BufferedInputStream bis = new java.io.BufferedInputStream(
			System.in);
}