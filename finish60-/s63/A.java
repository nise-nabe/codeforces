package s63;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0, y = 0, z = 0;
		for (int n = s.nextInt(); n-- > 0;) {
			x += s.nextInt();
			y += s.nextInt();
			z += s.nextInt();
		}
		System.out.println(x == 0 && y == 0 && z == 0 ? "YES" : "NO");
	}
}
