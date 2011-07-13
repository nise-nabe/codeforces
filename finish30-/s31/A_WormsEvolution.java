package s31;
import java.util.*;

public class A_WormsEvolution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt() + 1;
		int[] a = new int[n];
		for (int i = 1; i < n; ++i) {
			a[i] = s.nextInt();
		}

		for (int i = 1; i < n; ++i) {
			for (int j = 1; j < n; ++j) {
				for (int k = 1; k < n; ++k) {
					if (i != j && i != k && j != k && a[i] == a[j] + a[k]) {
						System.out.println(i + " " + j + " " + k);
						return;
					}
				}
			}
		}
		System.out.println(-1);
	}
}
