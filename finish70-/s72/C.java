package s72;
import java.awt.*;
import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] cs = new int[n][];
		for (int i = 0; i < n; ++i) {
			cs[i] = new int[] { i, s.nextInt(), s.nextInt() };
		}
		Comparator<int[]> cmp = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		};
		Arrays.sort(cs, cmp);
		int m = s.nextInt();
		int[][] as = new int[m][];
		for (int i = 0; i < m; ++i) {
			as[i] = new int[] { i + 1, s.nextInt(), s.nextInt() };
		}
		Arrays.sort(as, cmp);

		int[] r = new int[n];
		Arrays.fill(r, Integer.MAX_VALUE);
		int j = 0;
		for (int[] c : cs) {
			for (; j < m && as[j][1] < c[1] - c[2]; ++j)
				;
			for (; j < m && as[j][1] <= c[1] + c[2]; ++j) {
				if (Point.distanceSq(c[1], 0, as[j][1], as[j][2]) <= c[2]
						* c[2]) {
					r[c[0]] = Math.min(r[c[0]], as[j][0]);
				}
			}
			for(j = Math.max(0,j-1);j>=0 && as[j][1] == c[1] + c[2]; --j);
			j = Math.max(0, j);
		}
		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			if (r[i] < Integer.MAX_VALUE) {
				++cnt;
			} else {
				r[i] = -1;
			}
		}
		System.out.println(cnt);
		System.out.println(Arrays.toString(r).replaceAll("[\\[\\],]", ""));
	}
}
