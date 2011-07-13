package s27;
import java.util.BitSet;
import java.util.Scanner;

public class A_NextTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BitSet set = new BitSet();
		for (int i = 0, n = s.nextInt(); i < n; ++i) {
			set.set(s.nextInt());
		}
		System.out.println(set.nextClearBit(1));
	}
}
