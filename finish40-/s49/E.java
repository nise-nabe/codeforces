package s49;
import java.util.*;

public class E {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
		int[][] a = new int[m][];
		int[][] count = new int[1 << n][1 << n];
		for (int i = 0; i < m; ++i) {
			int u = s.nextInt() - 1, v = s.nextInt() - 1;
			a[i] = new int[] { u, v };
			count[bit(u) | bit(v)][bit(u) | bit(v)] = 1;
		}
		int result = 0;
		for (int used = 0; used < bit(n); ++used) {
			for (int deadends = 0; deadends < bit(n); ++deadends) {
				int c = Integer.bitCount(deadends);
				if (c > 1 && count[used][deadends] > 1) {
					count[used][deadends] /= c;
				}
				if (used == bit(n) - 1 && c == k) {
					result += count[used][deadends];
				}
				for (int i = 0; i < m; ++i) {
					int u = a[i][0], v = a[i][1];
					int ut = used, dt = deadends;
					if (isUsed(u, used) ^ isUsed(v, used)) {
						if (isUsed(u, used)) {
							ut = add(v, ut);
							if (isUsed(u, dt)) {
								dt = remove(u, dt);
							}
							dt = add(v, dt);
						} else {
							ut = add(u, ut);
							if (isUsed(v, dt)) {
								dt = remove(v, dt);
							}
							dt = add(u, dt);
						}
						count[ut][dt] += count[used][deadends];
					}
				}
			}
		}
		System.out.println(result);
	}

	private static int remove(int v, int r) {
		return r ^ bit(v);
	}

	private static int add(int u, int r) {
		return r | bit(u);
	}

	private static boolean isUsed(int u, int r) {
		return (r & bit(u)) > 0;
	}

	private static int bit(int v) {
		return 1 << v;
	}

}
