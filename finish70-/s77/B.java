package s77;

import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(f(s.nextLong(), 0));
	}

	private static long f(long x, long n) {
		if (x <= n) {
			int u = 0, v = 0;
			for (long i = n; i > 0; i /= 10) {
				if (i % 10 == 4) {
					++u;
				} else if (i % 10 == 7) {
					++v;
				}
			}
			if (u == v) {
				return n;
			}else if(u < v){
				return f(x, n * 10 + 4);
			}else{
				return f(x, n * 10 + 7);
			}
		}
		return Math.min(f(x, n * 10 + 4), f(x, n * 10 + 7));
	}
}
