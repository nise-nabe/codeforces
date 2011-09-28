package s80;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] a = new int[n][];
		for (int i = 0; i < n; ++i) {
			a[i] = new int[] { s.nextInt(), s.nextInt(), s.nextInt(),
					s.nextInt() };
		}
		boolean[] b = new boolean[n];
		Arrays.fill(b, true);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int k = 0;
				for (; k < 3; ++k) {
					if (a[i][k] >= a[j][k]) {
						break;
					}
				}
				if (k == 3) {
					b[i] = false;
					break;
				}
			}
		}
		int min = Integer.MAX_VALUE, mini = -1;
		for (int i = 0; i < n; ++i) {
			if (b[i] && min > a[i][3]) {
				min = a[i][3];
				mini = i;
			}
		}
		System.out.println(mini+1);
	}

}
