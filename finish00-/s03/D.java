package s03;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] ss = new String[3];
		int xn = 0;
		int on = 0;
		for (int i = 0; i < 3; i++) {
			ss[i] = scan.next();
			for (char c : ss[i].toCharArray()) {
				if (c == 'X') {
					xn++;
				} else if (c == '0') {
					on++;
				}
			}
		}
		System.out.println(xn);
		System.out.println(on);
		if (!((xn == on) || (xn == (on + 1)))) {
			System.out.println("illegal");
			return;
		}
		if (xn + on == 9) {
			System.out.println(check(ss, '0'));
		}
		if (xn == on) {
			on++;
			if (xn + on == 9) {
				System.out.println(check(ss, 'X'));
			}
			System.out.println("first");
		} else {
			xn++;
			if (xn + on == 9) {
				System.out.println(check(ss, '0'));
			}
			System.out.println("second");
		}
	}

	private static String[] m = { "the first player won",
			"the second player won", "draw" };

	private static String check(String[] ss, char a) {
		for (String s : ss) {
			int xn = 0;
			int on = 0;
			for (char c : s.toCharArray()) {
				if (c == 'X') {
					xn++;
				} else if (c == '0') {
					on++;
				}
			}
			if (xn == 3) {
				return m[1];
			} else if (on == 3) {
				return m[2];
			}
		}
		for (int i = 0; i < 3; i++) {
			int xn = 0;
			int on = 0;
			for (String s : ss) {
				if (s.charAt(i) == 'X') {
					xn++;
				} else if (s.charAt(i) == '0') {
					on++;
				}
			}
			if (xn == 3) {
				return m[1];
			} else if (on == 3) {
				return m[2];
			}
		}
		return m[0];
	}
}
