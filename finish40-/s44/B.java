package s44;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[3];
		for (int n = 3; n-- > 0;) {
			String str = s.next();
			if (str.charAt(1) == '<') {
				++a[str.charAt(2) - 'A'];
			} else {
				++a[str.charAt(0) - 'A'];
			}
		}
		String result = "";
		for (int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j){
				if (i == a[j]) {
					result += (char) (j + 'A');
					break;
				}
			}
		}
		System.out.println(result.length()==3?result:"Impossible");
	}
}
