package s63;

import java.util.*;

public class E {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; ++i) {
			if (0 <= i - k) {
				map.put(a[i - k], map.get(a[i - k]) - 1);
				if (map.get(a[i - k]) == 1) {
					set.add(a[i - k]);
				} else {
					set.remove(a[i - k]);
				}
			}
			Integer x = map.get(a[i]);
			if (x == null) {
				x = 0;
			}
			map.put(a[i], ++x);
			if (x == 1) {
				set.add(a[i]);
			} else {
				set.remove(a[i]);
			}
			if (i >= k - 1) {
				if (set.size() == 0) {
					System.out.println("Nothing");
				} else {
					System.out.println(set.iterator().next());
				}
			}
		}
	}
}
//1 1 2 2
//a
//b: a 2
//c: a 1
//1 a
//1 a
//
//1
//c 2
