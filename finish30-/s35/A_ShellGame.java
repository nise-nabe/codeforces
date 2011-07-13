package s35;

import java.io.*;
import java.util.*;

public class A_ShellGame {
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
		boolean[] b = new boolean[3];
		b[s.nextInt() - 1] = true;
		for (int t = 3; t-- > 0;) {
			int x = s.nextInt() - 1, y = s.nextInt() - 1;
			boolean tmp = b[x];
			b[x] = b[y];
			b[y] = tmp;
		}
		int r = 1;
		for (int i = 0; i < 3; ++i) {
			if (b[i]) {
				r = i + 1;
			}
		}
		pw.println(r);
		pw.close();
	}
}
