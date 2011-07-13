package s02;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] names = new String[n];
		int[] scores = new int[n];
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; ++i) {
			names[i] = s.next();
			scores[i] = s.nextInt();
			Integer c = map.get(names[i]);
			if (c == null) {
				c = 0;
			}
			map.put(names[i], c + scores[i]);
		}
		int max = Collections.max(map.values());
		String result = "";
		Set<String> set = new HashSet<String>();
		for (String key : map.keySet()) {
			if (map.get(key) == max) {
				set.add(key);
			}
		}
		map = new HashMap<String, Integer>();
		for (String name : names) {
			map.put(name, 0);
		}
		for (int i = 0; i < n; ++i) {
			if (set.contains(names[i])) {
				int value = map.get(names[i]) + scores[i];
				if (value >= max) {
					result = names[i];
					break;
				}
				map.put(names[i], value);
			}
		}
		System.out.println(result);
	}
}
