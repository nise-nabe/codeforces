package s36;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A_ExtraTerrestrialIntelligence {
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
		s.next();
		String str = s.next();
		int d = 0;
		String result = "YES";
		for (int i = str.indexOf('1'), j = str.indexOf('1', i + 1); j >= 0; i = j, j = str
				.indexOf('1', i + 1)) {
			if (d == 0 || j - i == d) {
				d = j - i;
			} else {
				result = "NO";
			}
		}
		pw.println(result);
		pw.close();
	}
}
