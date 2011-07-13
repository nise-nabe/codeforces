package Manthan2011;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; ++i) {
			list.add(i);
		}
		for (int i = 1; i <= n; ++i) {
			int m = s.nextInt();
			for (int j = 0; j < m; ++j) {
				int v = i + j + k;
				int index = 0;
				do {
					index = list.indexOf(v++);
					System.out.println(index);
				} while (index < i);
				list.add(i - 1, list.remove(index));
			}
		}
		System.out.println(list);
	}
}
