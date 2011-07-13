package s55;
import java.util.*;

// copy
public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), teamNum = 3, memberNum = n * teamNum;
		int[] r = new int[memberNum + 1];
		for (int i = 0; i < memberNum; ++i) {
			r[s.nextInt()] = i;
		}
		int[][] teams = new int[n][teamNum];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < teamNum; ++j) {
				teams[i][j] = s.nextInt();
			}
		}
		int k = s.nextInt();
		l: for (int i = 0; i < n; ++i) {
			for (int j = 0; j < teamNum; ++j) {
				if (teams[i][j] == k) {
					int result[] = new int[memberNum - 1];
					boolean isMax = true;
					for (int jj = 0; jj < teamNum; ++jj) {
						if (r[teams[i][jj]] < r[teams[i][j]]) {
							isMax = false;
						}
					}
					if (!isMax) {
						for (int ii = 1; ii < memberNum; ++ii) {
							result[ii - 1] = ii < k ? ii : ii + 1;
						}
					} else {
						int a[] = new int[i * teamNum];
						for (int ii = 0, p = 0; ii < i; ++ii) {
							for (int jj = 0; jj < teamNum; ++jj) {
								a[p++] = teams[ii][jj];
							}
						}
						int b[] = new int[(n - i) * teamNum - 1];
						for (int ii = i, p = 0; ii < n; ++ii) {
							for (int jj = 0; jj < teamNum; ++jj) {
								if (teams[ii][jj] != k) {
									b[p++] = teams[ii][jj];
								}
							}
						}
						Arrays.sort(a);
						Arrays.sort(b, 0, 2);
						Arrays.sort(b, 2, b.length);
						for (int p = 0, ap = 0, bp = 0; p < result.length;) {
							result[p++] = bp >= b.length
									|| (ap < a.length && a[ap] < b[bp]) ? a[ap++]
									: b[bp++];
						}
					}
					System.out.println(Arrays.toString(result).replaceAll(
							"[\\[\\],]", ""));
					break l;
				}
			}
		}
	}
}
