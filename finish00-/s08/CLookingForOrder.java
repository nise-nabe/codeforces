package s08;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CLookingForOrder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.nextLine();
		n = scan.nextInt();
		vised = new boolean[n];
		scan.nextLine();
		List<List<Integer>> objs = new ArrayList<List<Integer>>();
		ds = new double[n][n];
		for (int i = 0; i < n; i++) {
			objs.add(Arrays.asList(scan.nextInt() - x, scan.nextInt() - y));
			scan.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				List<Integer> l1 = objs.get(i);
				List<Integer> l2 = objs.get(j);
				ds[i][j] = Math.pow(l1.get(0), 2) + Math.pow(l1.get(1), 2)
						+ Math.pow(l2.get(0), 2) + Math.pow(l2.get(1), 2)
						+ Math.pow(l1.get(0) - l2.get(0), 2)
						+ Math.pow(l1.get(1) - l2.get(1), 2);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				List<Integer> l = new ArrayList<Integer>();
				l.add(0);
				List<Double> values = new ArrayList<Double>();
				values.add(ds[i][j]);
				f(i, j, l, values);
			}
		}
		out.println((int) min);
		out.println(list.toString().replaceAll("[\\[\\],]", ""));
		out.flush();
	}

	static int n;
	static boolean[] vised;
	static List<Integer> list;
	static double min = Double.MAX_VALUE;
	static double[][] ds;

	static void f(int n1, int n2, List<Integer> l, List<Double> values) {
		l.add(n1 + 1);
		if (n1 != n2) {
			l.add(n2 + 1);
		}
		l.add(0);
		vised[n1] = vised[n2] = true;
		boolean all = true;
		for (boolean b : vised) {
			if (!b) {
				all = false;
				break;
			}
		}
		if (all) {
			double value = 0.0;
			for (Double v : values) {
				value += v;
			}
			if (value < min) {
				min = value;
				list = l;
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (!vised[i]) {
					for (int j = i; j < n; j++) {
						if (!vised[j]) {
							List<Integer> ll = new ArrayList<Integer>(l);
							List<Double> valuess = new ArrayList<Double>(values);
							valuess.add(ds[i][j]);
							f(i, j, ll, valuess);
						}
					}
				}
			}
		}
		vised[n1] = vised[n2] = false;
	}
}
