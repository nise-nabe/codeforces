package s60;
import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] p = new int[n][];
		for (int i = 0; i < n; ++i) {
			p[i] = new int[] { s.nextInt(), s.nextInt(), s.nextInt() };
		}
		int vp = s.nextInt(), vs = s.nextInt();
		int[] pp = { s.nextInt(), s.nextInt(), s.nextInt() };
	}
}
