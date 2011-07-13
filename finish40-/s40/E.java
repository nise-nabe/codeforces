package s40;
import java.util.*;

public class E {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n / 2 * (n - n / 2));
		for (int i = 1; i <= n / 2; ++i) {
			for (int j = n / 2 + 1; j <= n; ++j) {
				System.out.println(i + " " + j);
			}
		}
	}
}
