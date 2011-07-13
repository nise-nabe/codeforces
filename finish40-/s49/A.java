package s49;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.next();
		int n = s.nextInt();
		String[] strs = new String[n];
		for (int i = 0; i < n; ++i) {
			strs[i] = s.next();
		}
		Arrays.sort(strs);
		for (String str : strs) {
			if (str.startsWith(x)) {
				System.out.println(str);
				return;
			}
		}
		System.out.println(x);
	}
}
