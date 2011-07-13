package s53;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), d[] = new int[2], r = 0;
		for (int i = 0; i < 2; ++i) {
			int x = s.nextInt(), y = s.nextInt();
			d[i] = x == 0 ? y : y == n ? n + x : x == n ? 3 * n - y : 4 * n - x;
		}
		System.out.println(Math.min(r = Math.abs(d[0] - d[1]), 4 * n - r));
	}
}
