package s86;
import java.math.BigInteger;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger k = s.nextBigInteger(), l = s.nextBigInteger();
		int c = 0;
		while (!l.equals(BigInteger.ONE)) {
			if (!l.mod(k).equals(BigInteger.ZERO)) {
				System.out.println("NO");
				return;
			}
			l = l.divide(k);

			++c;
		}
		System.out.println("YES");
		System.out.println(c - 1);
	}
}
