package s41;
import java.util.*;

public class BG {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String r1 = s.next(), r2 = s.next(), wk = s.next(), bk = s.next();
		for (int j = 0; j < 8; ++j) {
			for (int i = 0; i < 8; ++i) {
				if (r1.charAt(0) - 'a' == i && r1.charAt(1) - '1' == j) {
					System.out.print("r");
				} else if (r2.charAt(0) - 'a' == i && r2.charAt(1) - '1' == j) {
					System.out.print("R");

				} else if (wk.charAt(0) - 'a' == i && wk.charAt(1) - '1' == j) {
					System.out.print("W");

				} else if (bk.charAt(0) - 'a' == i && bk.charAt(1) - '1' == j) {
					System.out.print("B");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
