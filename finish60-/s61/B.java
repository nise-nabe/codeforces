package s61;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
		}
		int r = 0;
		for (int i = 0; i < n; ++i) {
			int c = 1;
			for (int j = i - 1; j >= 0 && a[j + 1] >= a[j]; --j) {
				++c;
			}
			for (int j = i + 1; j < n && a[j - 1] >= a[j]; ++j) {
				++c;
			}
			r = Math.max(r, c);
		}
		System.out.println(r);
	}
}
