package s04;
import java.util.HashMap;
import java.util.Scanner;

public class CC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (; n > 0; n--) {
			String s = scan.next();
			if (!map.containsKey(s)) {
				map.put(s, 0);
				System.out.println("OK");
			} else {
				int i = map.get(s) + 1;
				map.put(s, i);
				System.out.println(s + i);
			}
		}
	}
}
