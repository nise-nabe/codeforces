package s59;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		int[] ranks = new int[k];
		for (int i = 0; i < n; ++i) {
			++ranks[s.nextInt() - 1];
		}
		int r = 0;
		for (; ranks[k - 1] < n; ++r) {
			for (int i = k - 2; i >= 0; --i) {
				if (ranks[i] > 0) {
					--ranks[i];
					++ranks[i + 1];
				}
			}
		}
		System.out.println(r);
	}
}
