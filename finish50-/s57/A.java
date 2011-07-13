package s57;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String c = "";
		for (int i = 0; i < a.length(); ++i) {
			if (a.charAt(i) != b.charAt(i)) {
				c+="1";
			}else{
				c+="0";
			}
		}
		System.out.println(c);
	}
}
