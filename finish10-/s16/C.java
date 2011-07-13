package s16;
import java.math.BigInteger;
import java.util.Scanner;

public class C {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int g = gcd(x,y);
		x /= g;
		y /= g;
		int min = Math.min(n/x, m/y);
		System.out.println(x*min + " " + y*min);
	}
	static int gcd(int a, int b) {
		int l, s, t;
		for (l = Math.max(a, b), s = Math.min(a, b); s > 0;) {
			t = l % s;
			l = s;
			s = t;
		}
		return l;
	}
}
