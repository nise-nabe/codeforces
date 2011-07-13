package s35;
import java.io.*;
import java.util.*;

public class B_Warehouse {
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
		int n = s.nextInt(), m = s.nextInt(), q = s.nextInt();
		String[] shelf = new String[n * m + 1];
		for (; q-- > 0;) {
			if (s.next().equals("+1")) {
				int x = s.nextInt() - 1, y = s.nextInt() - 1;
				int i = x * m + y;
				while (i < n * m && shelf[i] != null) {
					++i;
				}
				shelf[i] = s.next();
			} else {
				String str = s.next(), result = "-1 -1";
				for (int i = 0; i < n * m; ++i) {
					if (str.equals(shelf[i])) {
						result = ((i / m + 1) + " " + (i % m + 1));
						shelf[i] = null;
						break;
					}
				}
				pw.println(result);
			}
		}
		pw.close();
	}
}
