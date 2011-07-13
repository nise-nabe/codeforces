package s51;
import java.util.*;

public class A {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		boolean[] bs = new boolean[n];
		for (int d = 0, i = 0; d < n; i = (i + ++d) % n) {
			bs[i] = true;
		}
		String result = "YES";
		for (boolean b : bs) {
			if (!b) {
				result = "NO";
			}
		}
		System.out.println(result);
	}
}
