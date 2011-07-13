package s40;
import java.util.*;

public class B_MartianDollar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long b = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
		}
		long result = b;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				result = Math.max(result, a[j] * (b / a[i]) + b % a[i]);
			}
		}
		System.out.println(result);
	}
}
