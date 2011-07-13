package s04;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		test(scan, n, w, h);
		int maxDepth = depth(0);
		System.out.println(maxDepth - 1);
		if (maxDepth - 1 != 0) {
			System.out.println(toS(map.get(0).get(0)));
		}

		// List<Integer> result = longestChain(0);
		// Collections.reverse(result);
		// result.remove(0);
		// System.out.println(result.size());
		// System.out.println(result.toString().replaceAll("[\\[\\],]", ""));

		// int[] res = saiki(map, 0);
		// int[] result = new int[res.length - 1];
		// for (int i = 0; i < result.length; i++) {
		// result[i] = res[res.length - i - 2];
		// }
		// System.out.println(result.length);
		// System.out.println(Arrays.toString(result).replaceAll("[\\[\\],]",
		// ""));
	}

	private static void test(Scanner scan, int n, int w, int h) {
		ArrayList<O> list = new ArrayList<O>();
		list.add(new O(0, w, h));
		for (int i = 1; i <= n; i++) {
			int ww = scan.nextInt();
			int hh = scan.nextInt();
			O o = new O(i, ww, hh);
			if (ww > w && hh > h && !list.contains(o)) {
				list.add(o);
			}
		}
		// とりあえずwが大きい順でソート O(n^2)
		// Collections.sort(list, new Comparator<O>() {
		// @Override
		// public int compare(O o1, O o2) {
		// return -o1.w + o2.w;
		// }
		// });

		// 大小関係(o1, o2)のリストを作成
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				O o1 = list.get(i);
				O o2 = list.get(j);
				if (o1.isCanHave(o2)) {
					if (!map.containsKey(o2.n)) {
						map.put(o2.n, new ArrayList<Integer>());
					}
					map.get(o2.n).add(o1.n);
				} else if (o2.isCanHave(o1)) {
					if (!map.containsKey(o1.n)) {
						map.put(o1.n, new ArrayList<Integer>());
					}
					map.get(o1.n).add(o2.n);
				}
			}
		}
	}

	private static int depth(int now) {
		if (memo.containsKey(now)) {
			return memo.get(now);
		}
		if (!map.containsKey(now)) {// || memo.containsKey(now)) {
			return 1;
		}
		int result = 0;
		List<Integer> list = map.get(now);
		int maxi = 0;
		for (Integer i : list) {
			int dep = depth(i) + 1;
			if (dep > result) {
				result = dep;
				maxi = i;
			}
		}
		if (list.size() > 1) {
			list.clear();
			list.add(maxi);
		} else if (result % 150 == 0) {
			memo.put(now, result);
		}
		return result;
	}

	private static String toS(int n) {
		if (!map.containsKey(n)) {// || memo.containsKey(now)) {
			return "" + n;
		}
		return n + " " + toS(map.get(n).get(0));
	}

	private static HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	private static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

	static class A {
		int hn;
		int ln;

		public A(int hn, int ln) {
			this.hn = hn;
			this.ln = ln;
		}
	}

	static class O {
		int n;
		int w;
		int h;

		O(int n, int w, int h) {
			this.n = n;
			this.w = w;
			this.h = h;
		}

		boolean isCanHave(O o) {
			return w > o.w && h > o.h;
		}

		@Override
		public boolean equals(Object a) {
			O o = (O) a;
			return this.w == o.w && this.h == o.h;
		}
	}
}
//
// // private static Map<Integer, List<Integer>> memo = new HashMap<Integer,
// // List<Integer>>();
//
// // private static Map<Integer, int[]> memo = new HashMap<Integer, int[]>();
//
// private static List<Integer> longestChain(int now) {
// List<Integer> result = new ArrayList<Integer>();
// // private static int[] saiki(HashMap<Integer, List<Integer>> map, int
// // now) {
// // int[] result = new int[0];
// // if (memo.containsKey(now)) {
// // result = memo.get(now);
// // // result = memo.get(now).clone();
// // } else
// if (map.containsKey(now)) {
// int maxi = 0;
// List<Integer> list = map.get(now);
// for (Integer i : list) {
// List<Integer> tmp = longestChain(i);
// if (result.size() < tmp.size()) {
// // int[] tmp = saiki(map, i);
// // if (result.length < tmp.length) {
// result = tmp;
// maxi = i;
// }
// }
// if (list.size() > 1) {
// // for (Integer ii : list) {
// // memo.remove(ii);
// // }
// list.clear();
// list.add(maxi);
// }
// // else {
// // memo.put(now, result);
// // }
// // if (result.size() > 5) {
// // int dep = depth(now);
// // if (dep > 8) {
// // memo.put(now, new ArrayList<Integer>(result));
// // // memo.put(now, result.clone());
// // }
// }
// result = new ArrayList<Integer>(result);
// result.add(now);
// return result;
// // int[] res = new int[result.length + 1];
// // for (int i = 0; i < result.length; i++) {
// // res[i] = result[i];
// // }
// // res[result.length] = now;
// // return res;
// }
//
//
//
// // public static void main(String[] args) {
// // Scanner scan = new Scanner(System.in);
// // int n = scan.nextInt();
// // int w = scan.nextInt();
// // int h = scan.nextInt();
// // ArrayList<O> list = new ArrayList<O>();
// // for (int i = 1; i <= n; i++) {
// // int ew = scan.nextInt();
// // int eh = scan.nextInt();
// // O o = new O(i, ew, eh);
// // if (ew > w && eh > h && !list.contains(o)) {
// // list.add(o);
// // }
// // }
// // Comparator<O> hc = new Comparator<O>() {
// // @Override
// // public int compare(O o1, O o2) {
// // if (o1.h < o2.h) {
// // return -1;
// // } else if (o1.h < o2.h) {
// // return 1;
// // }
// // return o1.w - o2.w;
// // }
// // };
// // Comparator<O> wc = new Comparator<O>() {
// // @Override
// // public int compare(O o1, O o2) {
// // if (o1.w < o2.w) {
// // return -1;
// // } else if (o1.w < o2.w) {
// // return 1;
// // }
// // return o1.h - o2.h;
// // }
// // };
// // Collections.sort(list, hc);
// // ArrayList<O> hlist = new ArrayList<O>();
// // for (O o : list) {
// // if (hlist.size() == 0
// // || (hlist.get(hlist.size() - 1).h != o.h && hlist.get(hlist
// // .size() - 1).w < o.w)) {
// // hlist.add(o);
// // }
// // }
// // Collections.sort(list, wc);
// // ArrayList<O> wlist = new ArrayList<O>();
// // for (O o : list) {
// // if (wlist.size() == 0
// // || (wlist.get(wlist.size() - 1).h != o.h && wlist.get(wlist
// // .size() - 1).w < o.w)) {
// // wlist.add(o);
// // }
// // }
// // ArrayList<O> result = wlist.size() > hlist.size() ? wlist : hlist;
// // System.out.println(result.size());
// // System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
// // }
// //
// // private static class O {
// // public int n;
// // public int w;
// // public int h;
// //
// // public O(int n, int w, int h) {
// // this.n = n;
// // this.w = w;
// // this.h = h;
// // }
// //
// // @Override
// // public boolean equals(Object a) {
// // O o = (O) a;
// // return this.w == o.w && this.h == o.h;
// // }
// //
// // @Override
// // public String toString() {
// // return "" + this.n;
// // }
// // }
// }
