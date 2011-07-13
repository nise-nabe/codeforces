package s46;
import java.util.*;
import static java.lang.Integer.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int max = 0;
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				max = Math.max(max, valueOf("" + c, 16));
			}
		}
		String a = str.split(" ")[0], b = str.split(" ")[1];
		int r = 0;
		for (int i = max + 1; i < 17; ++i) {
			r=Math.max(r,Integer.toString(valueOf(a,i)+valueOf(b,i),i).length());
		}
		System.out.println(r);
	}
}
