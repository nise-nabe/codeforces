package s77;

import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		for (int n = s.nextInt(); n-- > 0;) {
			set.add(s.next());
		}
		String w = s.next();
		char e = s.next().charAt(0);
		boolean[] b = new boolean[w.length()];
		for (String x : set) {
			for (int i = 0; i < w.length() - x.length() + 1; ++i) {
				int j = w.toLowerCase().indexOf(x.toLowerCase(), i);
				if (j >= 0) {
					for (int k = j; k < j + x.length(); ++k) {
						b[k] = true;
					}
				}
			}
		}
		char[] cs = w.toLowerCase().toCharArray();
		for (int i = 0; i < cs.length; ++i) {
			if (b[i]) {
				if (cs[i] == e) {
					cs[i] = cs[i] == 'a' ? 'b' : 'a';
				} else {
					cs[i] = e;
				}
			}
			if (Character.isUpperCase(w.charAt(i))) {
				cs[i] = Character.toUpperCase(cs[i]);
			}
		}
		System.out.println(new String(cs));
	}
}
