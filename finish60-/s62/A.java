package s62;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p[] = new int[4];
		for (int i = 0; i < 4; ++i) {
			p[i] = s.nextInt();
		}
		int c = 0;
		for (int a = s.nextInt(), b = s.nextInt(); a <= b; ++a) {
			int n = a;
			for (int i = 0; i < 4; ++i) {
				n %= p[i];
			}
			if (n == a) {
				++c;
			}
		}
		System.out.println(c);
	}
}
