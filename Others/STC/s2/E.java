package STC.s2;
import java.util.*;

public class E {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt(), a = s.nextInt(), b = s.nextInt();
		String str = s.next();
		if (str.length() > k * b || str.length() < k * a)
			System.out.println("No solution");
		else {
			int m = 0;
			for (int i = a; i <= b; i++) {
				if (str.length() - i * (k - 1) >= a
						&& str.length() - i * (k - 1) <= b) {
					m = i;
					break;
				}
			}
			for (int i = 0; i < k - 1; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(str.charAt(i * m + j));
				}
				System.out.println();
			}
			for (int i = (k - 1) * m; i < str.length(); i++)
				System.out.print(str.charAt(i));
		}
	}
}
