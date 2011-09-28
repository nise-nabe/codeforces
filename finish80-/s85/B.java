package s85;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), x = s.nextInt(), y = s.nextInt();
		int r = 0;
		if (x + y == 2 || x + y == 2 * n || x == 1 && y == n || x == n
				&& y == 1) {
			r = 4;
		} else if (x == 1 || x == n || y == 1 || y == n) {
			r = 6;
		} else {
			r = 9;
		}
		System.out.println(n * n / 2 < r ? "YES" : "NO");
	}
}
