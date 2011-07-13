package s72;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), a[] = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
		}
		long r = 0;
		for (int i = 0; i < n;) {
			int j = i + 1;
			for (; j < n && a[i] == a[j]; ++j);
			r += (j-i) * (long)(j - i- 1) / 2;
			i = j;
		}
		System.out.println(r + n);
	}
}
