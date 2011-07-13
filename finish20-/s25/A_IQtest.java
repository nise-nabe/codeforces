package s25;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * IQ test 
 * http://codeforces.com/contest/25/problem/A
 * 
 * ＜問題＞
 * 奇数または偶数で仲間外れがあるのでそのインデックス番号を求めよ
 * 
 * ＜方針＞
 * いろいろめんどくさいのでリストを奇遇でソートして
 * ヘッドテイルいずれかが答えのはずなのでそれを取ってきた．
 * 
 * @author nise_nabe
 * 
 */
public class A_IQtest {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>(), list2;
		for (; n-- > 0;) {
			list.add(scan.nextInt());
		}
		list2 = new ArrayList<Integer>(list);
		Collections.sort(list2, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 % 2 - o2 % 2;
			}
		});
		System.out.println(list.indexOf(list2.get(list2.get(1) % 2 > 0 ? 0
				: list2.size() - 1)) + 1);
	}
}
