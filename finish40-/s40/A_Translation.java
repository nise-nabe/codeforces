package s40;
import java.util.*;

public class A_Translation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(new StringBuffer(s.next()).reverse().toString()
				.equals(s.next()) ? "YES" : "NO");
	}
}
