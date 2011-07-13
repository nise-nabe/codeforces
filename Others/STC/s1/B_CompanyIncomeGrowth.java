package STC.s1;
import java.util.*;

public class B_CompanyIncomeGrowth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), p = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; ++i) {
			if (s.nextInt() == p + 1) {
				sb.append(2000+ i);
				sb.append(" ");
				++p;
			}
		}
		System.out.println(p);
		if (p > 0) {
			System.out.println(sb.toString().trim());
		}
	}
}
