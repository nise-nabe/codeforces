package s59;
import java.util.*;

public class A {
	public static void main(String[] args) {
		String[][] z = { { "rat" }, { "woman", "child" }, { "man" },
				{ "captain" } };
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		List<String[]> list = new ArrayList<String[]>();
		boolean[] b = new boolean[n];
		for (int i = 0; i < n; ++i) {
			list.add(s.nextLine().split(" "));
		}
		for (String[] types : z) {
			for (int i = 0; i < n; ++i) {
				String[] h = list.get(i);
				for (String type : types) {
					if (!b[i] && h[1].equals(type)) {
						System.out.println(h[0]);
						b[i] = true;
					}
				}
			}
		}
	}
}
