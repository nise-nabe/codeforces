package Testing.s1;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		h = s.nextInt();
		w = s.nextInt();
		cs = new char[h][];
		for (int i = 0; i < h; ++i) {
			cs[i] = s.next().toCharArray();
		}

		long r = 0;
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				if (ok(i, j)) {
					int max = max(i, j, h - i - 1, w - j - 1);
					for (int k = 1; k <= max; ++k) {
						if (ok(i - k, j) && ok(i, j - k)) {
							++r;
						}
						if (ok(i + k, j) && ok(i, j - k)) {
							++r;
						}
						if (ok(i - k, j) && ok(i, j + k)) {
							++r;
						}
						if (ok(i + k, j) && ok(i, j + k)) {
							++r;
						}
						if (ok(i - k, j - k) && ok(i + k, j - k)) {
							++r;
						}
						if (ok(i + k, j - k) && ok(i + k, j + k)) {
							++r;
						}
						if (ok(i - k, j + k) && ok(i + k, j + k)) {
							++r;
						}
						if (ok(i - k, j - k) && ok(i - k, j + k)) {
							++r;
						}
					}
				}
			}
		}
		System.out.println(r);
	}

	static char[][] cs;
	static int h, w;

	static boolean ok(int i, int j) {
		return 0 <= i && i < h && 0 <= j && j < w && cs[i][j] == '*';
	}

	static int max(int... is) {
		int r = 0;
		for (int i : is)
			r = Math.max(r, i);
		return r;
	}
}
