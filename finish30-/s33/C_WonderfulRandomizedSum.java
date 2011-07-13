package s33;
import java.util.*;

// copy
public class C_WonderfulRandomizedSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0, r = 0, m = 0, v;
		for (int n = s.nextInt(); n-- > 0;) {
			sum += v = s.nextInt();
			m = Math.max(m, r = Math.max(0, r + v));
		}
		System.out.println(2 * m - sum);
	}
}