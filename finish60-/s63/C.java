package s63;

import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt(), n = s.nextInt(), m = s.nextInt(), q = s.nextInt();
		String[] names = new String[n];
		s.nextLine();
		for (int t = 0; t < n; ++t) {
			names[t] = s.nextLine();
		}
		Set<Composite> set = new HashSet<Composite>();
		for (int t = 0; t < m; ++t) {
			Composite c = new Composite(s.next("(.+):").replace(":", ""));
			String[] line = s.nextLine().split(",");
			for (String str : line) {
				String[] strs = str.trim().split(" ");
				c.set(strs[0], new Integer(strs[1]));
			}
			set.add(c);
		}
		List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
		for (int t = 0; t < k; ++t) {
			list.add(new HashMap<String, Integer>());
		}
		for (int t = 0; t < q; ++t) {
			Map<String, Integer> map = list.get(s.nextInt() - 1);
			String x = s.next();
			Integer i = map.get(x);
			if (i == null) {
				i = 0;
			}
			map.put(x, i + 1);
		}
		for (Map<String, Integer> map : list) {
			Map<String, Integer> result = new TreeMap<String, Integer>();
			for (Composite c : set) {
				int num = c.make(map);
				if (num > 0) {
					result.put(c.name, num);
				}
			}
			for (String name : map.keySet()) {
				if (map.get(name) > 0) {
					result.put(name, map.get(name));
				}
			}
			System.out.println(result.size());
			for (String name : result.keySet()) {
				System.out.println(name + " " + result.get(name));
			}
		}
	}

	static class Composite {
		String name;
		Map<String, Integer> map;

		public Composite(String name) {
			this.name = name;
			this.map = new HashMap<String, Integer>();
		}

		public void set(String artifact, int n) {
			map.put(artifact, n);
		}

		public int make(Map<String, Integer> map) {
			Map<String, Integer> result = new HashMap<String, Integer>();
			for (String name : this.map.keySet()) {
				if (map.containsKey(name)
						&& map.get(name) >= this.map.get(name)) {
					result.put(name, map.get(name) / this.map.get(name));
				} else {
					return 0;
				}
			}
			int min = Collections.min(result.values());
			for (String name : result.keySet()) {
				map.put(name, map.get(name) - this.map.get(name) * min);
			}
			return min;
		}
	}

}
