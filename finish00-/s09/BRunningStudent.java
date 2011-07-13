package s09;
import java.util.Scanner;

public class BRunningStudent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), vb = s.nextInt(), vs = s.nextInt();
		int[] bss = new int[n];
		for (int i = 0; i < n; i++) {
			bss[i] = s.nextInt();
		}
		int ux = s.nextInt(), uy = s.nextInt();
		double time = Double.MAX_VALUE;
		int result = 0;
		for (int i = 1; i < n; ++i) {
			double t = dist(0, 0, bss[i], 0) / vb + dist(bss[i], 0, ux, uy)
					/ vs;
			if ((t < time)
					|| (t == time && dist(bss[result], 0, ux, uy) > dist(
							bss[i], 0, ux, uy))) {
				time = t;
				result = i;
			}
		}
		System.out.println(result + 1);
	}

	static double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
