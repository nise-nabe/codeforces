package s87;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), x = 0, max = 0;
		for (int i = 0; i < n; ++i) {
			x -= s.nextInt();
			x += s.nextInt();
			max = Math.max(max, x);
		}
		System.out.println(max);
	}
}
