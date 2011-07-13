package s52;
import java.util.*;

public class C {
	public static void main(String[] args) {
		char[] cs = new Scanner(System.in).nextLine().toCharArray();
		Deque<Integer> q = new ArrayDeque<Integer>();
		List<String> names = new ArrayList<String>();
		List<Integer> parents = new ArrayList<Integer>();
		int v = 0;
		q.push(v);
		++v;
		String name = "";
		for (int i = 0; i < cs.length; ++i) {
			char c = cs[i];
			if (Character.isUpperCase(c)) {
				name += cs[i];
			} else if (c == '.') {
				if (!name.isEmpty()) {
					names.add(name);
					parents.add(q.getFirst());
					++v;
				} else {
					q.pop();
				}
				name = "";
			} else if (c == ':') {
				names.add(name);
				parents.add(q.getFirst());
				q.push(v);
				name = "";
				++v;
			}
		}
		int count = 0;
		for (int i = 0; i < names.size(); ++i) {
			name = names.get(i);
			for (int p = parents.get(i) - 1; p != -1; p = parents.get(p) - 1) {
				if (names.get(p).equals(name)) {
					++count;
				}
			}
		}
		System.out.println(count);
	}
}
