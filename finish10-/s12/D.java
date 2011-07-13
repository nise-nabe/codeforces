package s12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("/home/yuya/Desktop/input4.txt"));
		int n = scan.nextInt();
		Map<Integer, Map<Integer, Map<Integer, String>>> map = new TreeMap<Integer, Map<Integer, Map<Integer, String>>>(
				Collections.reverseOrder());
		for (; n > 0; n--) {
			int b = scan.nextInt();
			Map<Integer, Map<Integer, String>> map2;
			if (!map.containsKey(b)) {
				map.put(b, new TreeMap<Integer, Map<Integer, String>>(
						Collections.reverseOrder()));
			}
			map2 = map.get(b);
			int i = scan.nextInt();
			if (!map2.containsKey(i)) {
				map2.put(i, new TreeMap<Integer, String>(Collections
						.reverseOrder()));
			}
			Map<Integer, String> map3 = map2.get(i);
			int r = scan.nextInt();
			if (!map3.containsKey(r)) {
				map3.put(r, "" + n);
			}
		}
		int pb, pi, pr;
		pb = pi = pr = Integer.MAX_VALUE;
		int count = -1;
		for (int b : map.keySet()) {
			for (int i : map.get(b).keySet()) {
				for (int r : map.get(b).get(i).keySet()) {
					// 勝負はここから
					// 
					pr = r;
				}
			}
		}
		System.out.println(count);
	}
}
