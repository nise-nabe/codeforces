package s35;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class D_Animals {
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
		int[] a = new int[n];
		for (; n > 0;) {
			a[n - 1] = s.nextInt() * n--;
		}
		Arrays.sort(a);
		int c = 0;
		for (int i = 0; i < a.length; ++i) {
			if (k - a[i] >= 0) {
				k -= a[i];
				++c;
			}
		}
		pw.println(c);
		pw.close();
	}
}
