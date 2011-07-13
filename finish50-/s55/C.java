package s55;
import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		char cs[] = s.next().toCharArray();
		int r = 0, n = cs.length;
		BitSet used = new BitSet();
		for (int i = 0; i < n / 2; ++i) {
			char a = cs[i], b = cs[n - i - 1];
			if (a != '?' && b != '?' && a != b) {
				System.out.println("IMPOSSIBLE");
				return;
			}
			if (a == '?' && b != '?') {
				cs[i] = b;
				used.set(b - 'a');
			} else if (a != '?' && b == '?') {
				cs[n - i - 1] = a;
				used.set(a - 'a');
			} else if (a == '?' && b == '?') {
				++r;
			} else {
				used.set(a - 'a');
			}
		}
		if (n % 2 > 0) {
			if (cs[n / 2] == '?') {
				++r;
			} else {
				used.set(cs[n / 2] - 'a');
			}
		}
		int c = used.cardinality();
		if (k > r + c) {
			System.out.println("IMPOSSIBLE");
			return;
		}
		int p = 0;
		for (int i = 0; i < n / 2; ++i) {
			if (cs[i] == '?') {
				--r;
				if (r < k - c) {
					p = used.nextClearBit(p);
					cs[i] = cs[n-i-1] = (char)('a' + p);
					used.set(p);
				} else {
					cs[i] = cs[n - i - 1] = 'a';
				}
			}
		}
		if (n % 2 > 0) {
			if (cs[n / 2] == '?') {
				if(r < k - c){
				cs[n/2] = (char)('a' + used.nextClearBit(p));
				}else{
					cs[n/2] = 'a';
				}
			}
		}
		System.out.println(new String(cs));
	}
}
