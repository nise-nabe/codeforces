package s19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = new Integer(scan.nextLine());
		LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
		List<Integer> zeros = new ArrayList<Integer>();
		for (int i = n; i-- > 0;) {
			int x = scan.nextInt();
			if (x == 0) {
				zeros.add(scan.nextInt());
			} else {
				list.add(Arrays.asList(x, scan.nextInt()));
			}
		}
		Collections.sort(zeros);
		Collections.sort(list, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(1).compareTo(o2.get(1));
			}
		});
		Collections.sort(list, new Comparator<List<Integer>>() {
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		System.out.println(list);
		int result = 0;
		while (n > 0) {
			List<Integer> max = list.poll();
			List<List<Integer>> l = new ArrayList<List<Integer>>();
			int sum = 0;
			do {
				List<Integer> pop = list.pop();
				sum += pop.get(0);
				l.add(pop);
			} while (sum < max.get(0));
			int sum2 = sum(l);
			if (max.get(1) <sum2) {
				for (List<Integer> e : l) {
					list.addFirst(e);
				}
				for (int count = max.get(1); count-- > 0;) {
					if (zeros.size() > 0) {
						zeros.remove(zeros.size() - 1);
					} else if (list.size() > 0) {
						list.poll();
					} else {
						System.out.println(result);
						return;
					}
				}
			} else {
				list.add(max);
				for (int count = sum2; count-- > 0;) {
					if (zeros.size() > 0) {
						zeros.remove(zeros.size() - 1);
					} else if (list.size() > 0) {
						list.poll();
					} else {
						System.out.println(result);
						return;
					}
				}
			}
		}
	}


	static int sum(List<List<Integer>> iss) {
		int c = 0;
		for (List<Integer> is : iss)
			c += is.get(1);
		return c;
	}
}
