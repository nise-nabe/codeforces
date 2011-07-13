package Manthan2011;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), a[] = new int[n];
		Arrays.fill(a, 1);
		char[] cs = s.next().toCharArray();
		for (int i = 0; i < n - 1; ++i) {
			if (cs[i] == 'L') {
				for (int j = i; j >= 0 && cs[j] != 'R'; --j) {
					if (cs[j] == 'L' && a[j] <= a[j + 1]) {
						a[j] = a[j + 1] + 1;
					} else if (cs[j] == '=' && a[j] < a[j + 1]) {
						a[j] = a[j + 1];
					}
				}
			} else if (cs[i] == 'R') {
				a[i + 1] = a[i] + 1;
			} else {
				a[i + 1] = a[i];
			}
		}
		System.out.println(Arrays.toString(a).replaceAll("[\\[\\],]", ""));
	}
}
