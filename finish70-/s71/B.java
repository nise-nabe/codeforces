package s71;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), k = s.nextInt(), t = s.nextInt();
		int[] is = new int[k];
		for (int i = 0; i < k; ++i) {
			is[i] = (s.nextInt() - 1) * m + s.nextInt() - 1;
		}
		Arrays.sort(is);
		String[] r = { "Carrots", "Kiwis", "Grapes" };
		for (; t-- > 0;) {
			int key = (s.nextInt() - 1) * m + s.nextInt() - 1;
			if (Arrays.binarySearch(is, key) >= 0) {
				System.out.println("Waste");
				continue;
			}
			int c = 0;
			for (; c < is.length && is[c] < key; ++c)
				;
			System.out.println(r[(key - c) % 3]);
		}
	}
}
