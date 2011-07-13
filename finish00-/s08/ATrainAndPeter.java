package s08;
import java.io.PrintWriter;
import java.util.Scanner;

public class ATrainAndPeter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String line = scan.nextLine();
		String a = scan.nextLine();
		String b = scan.nextLine();
		int sa = line.indexOf(a);
		int sb = line.substring(sa + a.length()).indexOf(b);
		line = reverse(line);
		int ea = line.indexOf(a);
		int eb = line.substring(ea + a.length()).indexOf(b);
		if (0 <= sa && 0 <= sb && 0 <= ea && 0 <= eb) {
			out.println("both");
		} else if (0 <= sa && 0 <= sb) {
			out.println("forward");
		} else if (0 <= ea && 0 <= eb) {
			out.println("backward");
		} else {
			out.println("fantasy");
		}

		out.flush();
	}

	private static String reverse(String l) {
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < l.length(); i++) {
			b.append(l.substring(l.length() - i - 1, l.length() - i));
		}
		return b.toString();
	}
}
