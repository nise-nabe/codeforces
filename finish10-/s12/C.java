package s12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		List<Integer> prices = new ArrayList<Integer>();
		for (String s : scan.nextLine().split(" ")) {
			prices.add(Integer.parseInt(s));
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (; m > 0; m--) {
			String fruit = scan.nextLine();
			int count = 0;
			if (map.containsKey(fruit)) {
				count = map.get(fruit);
			}
			map.put(fruit, ++count);
		}
		Map<Integer, List<String>> fruits = new HashMap<Integer, List<String>>();
		for (String s : map.keySet()) {
			int count = map.get(s);
			if (!fruits.containsKey(count)) {
				fruits.put(count, new ArrayList<String>());
			}
			fruits.get(count).add(s);
		}
		List<Integer> counts = new ArrayList<Integer>(fruits.keySet());
		Collections.sort(counts, Collections.reverseOrder());
		Collections.sort(prices);
		int i = 0;
		int min = 0;
		int max = 0;
		for (int count : counts) {
			for (String f : fruits.get(count)) {
				min += prices.get(i)*count;
				max += prices.get(prices.size() - 1 - i)*count;
				i++;
			}
		}
		System.out.println(min + " " + max);
	}
}
