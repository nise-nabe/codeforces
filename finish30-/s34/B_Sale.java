package s34;
import java.util.*;

public class B_Sale {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		int[] a = new int[n];
		for (; n-- > 0;) {
			a[n] = s.nextInt();
		}
		Arrays.sort(a);
		int r = 0;
		for (int i = 0; i < m && a[i] < 0; ++i) {
			r -= a[i];
		}
		System.out.println(r);
	}
}
