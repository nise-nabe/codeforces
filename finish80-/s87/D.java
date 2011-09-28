package s87;
import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		String[] cs = new String[n];
		for (int i = 0; i < n; ++i) {
			cs[i] = s.next();
		}
		int x = 0, sum = 0;
		x = sum = Math.max(cs[0].lastIndexOf('W'),
				n > 1 ? cs[1].lastIndexOf('W') : 0);
		for (int y = 1; y < n - 1; ++y) {
			if (y % 2 > 0) {
				int xx = Math.min(cs[y].indexOf('W'), cs[y + 1].indexOf('W'));
				sum += x - (x = xx);
			} else {
				int xx = Math.max(cs[y].lastIndexOf('W'),
						cs[y + 1].lastIndexOf('W'));
				sum += -x + (x = xx);
			}
			++sum;
		}
		System.out.println(sum
				+ (n > 1 ? 1 + Math.max(Math.abs(x - cs[n - 1].indexOf('W')),
						Math.abs(x - cs[n - 1].lastIndexOf('W'))) : 0));
	}
}
