package s44;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < 501; ++i) {
			set.add( i * (i + 1) / 2);
		}
		System.out.println(set.contains(new Scanner(System.in).nextInt())?"YES":"NO");

	}
}
