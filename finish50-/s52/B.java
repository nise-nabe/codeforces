package s52;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String r = "0 0";
		for (int i = 1; i <= n; ++i) {
			int a = s.nextInt();
			if (a != i) {
				if (r.equals("0 0")) {
					int b = 0, j = 1;
					for (; i + j <= a; ++j) {
						b = s.nextInt();
						if (a - j != b) {
							System.out.println("0 0");
							return;
						}
					}
					r = b + " " + a;
					i += j - 1;
				} else {
					System.out.println("0 0");
					return ;
				}
			}
		}
		System.out.println(r);
	}
}
