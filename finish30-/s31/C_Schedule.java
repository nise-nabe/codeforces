package s31;
import java.util.*;

public class C_Schedule {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < n; ++i) {
			list.add(new int[] { s.nextInt(), s.nextInt() });
		}
		int[] c = new int[n];
		int cm = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				int[] x = list.get(i), y = list.get(j);
				if (Math.max(x[0], y[0]) < Math.min(x[1], y[1])) {
					++c[i];
					++c[j];
					++cm;
				}
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			if (c[i] == cm) {
				result.add(i+1);
			}
		}
		System.out.println(result.size());
		System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
	}
}
