package s53;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
		int[][] a = new int[m][];
		for (; m-- > 0;) {
			a[m] = new int[] { s.nextInt(), s.nextInt(), s.nextInt() };
		}
		long r = 0;
		for (; k-- > 0;) {
			int x = s.nextInt();
			for (int[] b : a) {
				if (b[0] <= x && x <= b[1]) {
					r += x + b[2] - b[0];
				}
			}
		}
		System.out.println(r);
	}
}
