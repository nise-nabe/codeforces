package s21;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_JabberID {
	public static void main(String[] args) throws Exception {
		String str = new Scanner(System.in).nextLine();
		String r1 = "[\\w]{1,16}@([\\w\\.]{1,32})(/[\\w]{1,16}){0,1}";
		Matcher m = Pattern.compile(r1).matcher(str);
		if (m.matches() && m.group(1).matches("^[\\w]{1,16}(\\.[\\w]{1,16})*")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
