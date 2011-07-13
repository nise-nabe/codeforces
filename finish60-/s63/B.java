package s63;

import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		int[][] a = new int[m][4];
		for (int t = 0; t < m; ++t) {
			a[t] = new int[] { s.nextInt(), s.nextInt(), s.nextInt(),
					s.nextInt() };
		}
		int r = 0;
		for (int i = 1; i <= n; ++i) {
			int min = Integer.MAX_VALUE, c = 0;
			for (int j = 0; j < m; ++j) {
				if (a[j][0] <= i && i <= a[j][1] && min > a[j][2]) {
					min = a[j][2];
					c = a[j][3];
				}
			}
			r += c;
		}
		System.out.println(r);
	}
}
