package s47;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		for (char c : s.next().toCharArray()) {
			list.add(c);
		}
		long r = 0;
		for (char c : new HashSet<Character>(list)) {
			long x = Collections.frequency(list, c);
			r += x * x;
		}
		System.out.println(r);
	}
}
