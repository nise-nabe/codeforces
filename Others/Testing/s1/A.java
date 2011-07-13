package Testing.s1;
public class A {
	public static void main(String[] args) {
		int n = next();
		int[] c = new int[3];
		for (int i = n; i-- > 0;) {
			++c[next() - 1];
		}
		int max = 0;
		for (int i : c) {
			max = Math.max(max, i);
		}
		System.out.println(n - max);
	}
	static int next() {
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

	static java.io.BufferedInputStream bis = new java.io.BufferedInputStream(
			System.in);
}
