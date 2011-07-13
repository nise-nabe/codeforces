package s14;
import java.util.BitSet;
import java.util.Scanner;

public class B_YoungPhotographer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() - 1, x = scan.nextInt();
		BitSet bits = new BitSet();
		int a = scan.nextInt(), b = scan.nextInt();
		bits.set(Math.min(a, b), Math.max(a, b) + 1);
		for (; n-- > 0;) {
			a = scan.nextInt();
			b = scan.nextInt();
			BitSet tmp = new BitSet();
			tmp.set(Math.min(a, b), Math.max(a, b) + 1);
			bits.and(tmp);
		}
		if (bits.cardinality() == 0) {
			System.out.println(-1);
		} else if(bits.get(x)){
			System.out.println(0);
		} else {
			int l = bits.nextSetBit(0);
			int r = bits.nextClearBit(l) - 1;
			System.out.println(x < l ? l - x : x - r);
		}
	}
}