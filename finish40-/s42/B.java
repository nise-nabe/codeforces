package s42;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Map<Character, Integer> charset = new HashMap<Character, Integer>();
		for (char c = 'A'; c <= 'Z'; ++c) {
			charset.put(c, 0);
		}
		for (char c = 'a'; c <= 'z'; ++c) {
			charset.put(c, 0);
		}
		Scanner s = new Scanner(System.in);
		for (char c : s.nextLine().toCharArray()) {
			if (c != ' ') {
				charset.put(c, charset.get(c) + 1);
			}
		}
		for (char c : s.nextLine().toCharArray()) {
			if (c != ' ') {
				int n = charset.get(c) - 1;
				if(n < 0){
					System.out.println("NO");
					return;
				}
				charset.put(c, n);
			}
		}
		System.out.println("YES");
	}
}
