package s01;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pattern rcp = Pattern.compile("R(\\d+)C(\\d+)");
		Pattern op = Pattern.compile("(\\D+)(\\d+)");
		for (int n = s.nextInt(); n-- > 0;) {
			String line = s.next();
			Matcher m1 = rcp.matcher(line);
			Matcher m2 = op.matcher(line);
			if (m1.matches()) {
				int a = new Integer(m1.group(2));
				String r = "";
				for (; a > 0;) {
					int b = a % 26;
					a /= 26;
					if (b < 1) {
						b = 26;
						--a;
					}
					r = (char) (b + 64) + r;
				}
				line = r + m1.group(1);
			} else if (m2.matches()) {
				int r = 0;
				for (int a : m2.group(1).toCharArray()) {
					r = r * 26 + (a - 64);
				}
				line = "R" + m2.group(2) + "C" + r;
			}
			System.out.println(line);
		}
	}
}
