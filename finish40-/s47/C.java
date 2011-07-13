package s47;
import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < n; ++i) {
			list.add(new int[] { s.nextInt(), s.nextInt() });
		}
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		});
		List<int[]> u = new ArrayList<int[]>();
		u.add(list.get(0));
		u.add(list.get(1));
		for (int i = 2; i < list.size(); ++i) {
			u.add(list.get(i));
			int l = u.size();
			if (!f(u.get(l - 3), u.get(l - 2), u.get(l - 1))) {
				u.remove(l - 2);
			}
		}
		for (int[] a : u) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		u.remove(0);
		List<int[]> d = new ArrayList<int[]>();
		d.add(list.get(list.size() - 1));
		d.add(list.get(list.size() - 2));
		for (int i = list.size() - 3; i >= 0; --i) {
			d.add(list.get(i));
			int l = d.size();
			if (!f(d.get(l - 3), d.get(l - 2), d.get(l - 1))) {
				d.remove(l - 2);
			}
		}
		for (int[] a : d) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		d.remove(0);
		u.addAll(d);
		for (int[] a : u) {
			System.out.println(Arrays.toString(a));
		}
	}

	static boolean f(int[] p1, int[] p2, int[] p3) {
		int dx = p2[0] - p1[0];
		int dy = p2[1] - p1[1];
		if (dx == 0) {
			return p2[0] > p3[0];
		}
		if (dy == 0) {
			return p2[1] < p3[1];
		}
		double d = (double) dy / dx * p3[0] + p2[1] - dy / dx * p2[0];
		System.out.println(d);
		return d > p3[1];
	}
}
