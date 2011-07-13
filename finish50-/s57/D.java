package s57;
import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		list = new ArrayList<List<int[]>>();
		for (int i = 0; i < n + 1; ++i) {
			list.add(new ArrayList<int[]>());
		}
		for (int i = 0; i < n - 1; ++i) {
			int u = s.nextInt(), v = s.nextInt(), w = s.nextInt();
			list.get(u).add(new int[] { v, w });
			list.get(v).add(new int[] { u, w });
		}
		b = new boolean[n + 1];
		b[1] = true;
		System.out.println(f(1, 0) - len);
	}

	static List<List<int[]>> list;
	static boolean[] b;
	static long len = 0;

	static long f(int i, long d) {
		long c = 0;
		len = Math.max(len, d);
		for (int[] is : list.get(i)) {
			if (!b[is[0]]) {
				b[is[0]] = true;
				c += 2 * is[1] + f(is[0], d + is[1]);
			}
		}
		return c;
	}

	static class Scanner {
		java.io.BufferedInputStream bis;

		public Scanner(java.io.InputStream is) {
			bis = new java.io.BufferedInputStream(is);
		}

		public String next() {
			StringBuilder sb = new StringBuilder();
			int b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				for (; !Character.isWhitespace(b); b = bis.read()) {
					sb.append((char) b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return sb.toString();
		}

		public int nextInt() {
			int r = 0, s = 1, b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				if ((s = b == '-' ? -1 : 1) < 0) {
					b = bis.read();
				}
				for (; Character.isDigit(b); b = bis.read())
					r = r * 10 + b - '0';
			} catch (Exception e) {
			}
			return s * r;

		}
	}
}
