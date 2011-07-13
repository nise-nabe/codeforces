package STC.s2;
import java.util.*;

public class E_AnfisaTheMonkey {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		k = s.nextInt();
		a = s.nextInt();
		b = s.nextInt();
		str = s.next();
		list = new ArrayDeque<Integer>();
		f(0);
		System.out.println("No solution");
	}

	static String str;
	static Deque<Integer> list;
	static int a, b, k;

	static void f(int sum) {
		int x = k - list.size(), y = sum - str.length();
		if (x == 0 && y == 0) {
			int j = 0;
			java.io.PrintWriter pw = new java.io.PrintWriter(System.out);
			for (int next : list) {
				pw.println(str.substring(j, j + next));
				j += next;
			}
			pw.close();
			System.exit(0);
		} else if (x > 0 && b * x + y >= 0 && a * x + y <= 0) {
			for (int i = a; i <= b; ++i) {
				if (sum + i > str.length()) {
					break;
				}
				list.push(i);
				f(sum + i);
				list.pop();
			}
		}
	}
}
