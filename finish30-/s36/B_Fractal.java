package s36;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class B_Fractal {
	// copy
	public static void main(String[] args) throws Exception {
		File in = new File("input.txt"), out = new File("output.txt");
		Scanner s;
		PrintWriter pw;
		if (in.exists()) {
			s = new Scanner(in);
			pw = new PrintWriter(out);
		} else {
			s = new Scanner(System.in);
			pw = new PrintWriter(System.out);
		}
		int n = s.nextInt(), k = s.nextInt();
		int m = (int) Math.pow(n, k);
		char[][] cs = new char[n][], result = new char[m][m];
		for (int i = 0; i < n; ++i) {
			cs[i] = s.next().toCharArray();
		}
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < m; ++j) {
				result[i][j] = paint(cs, i, j, n, k);
			}
		}
		for (char[] c : result) {
			pw.println(new String(c));
		}
		pw.close();
	}

	static char paint(char[][] cs, int i, int j, int n, int k) {
		return k == 0 ? '.' : paint(cs, i / n, j / n, n, k - 1) == '*' ? '*'
				: cs[i % n][j % n];
	}
}
