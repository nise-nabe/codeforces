package s03;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BLorry {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double v = scan.nextInt();
		ArrayList<O> l = new ArrayList<O>();
		for (; n > 0; n--) {
			O o = new O();
			o.t = scan.nextInt();
			o.c = scan.nextInt();
			l.add(o);
		}
		Collections.sort(l, new Comparator<O>() {
			public int compare(O o1, O o2) {
				return o1.t - o2.t;
			}
		});
		BigDecimal vmax = new BigDecimal(0);
		BigDecimal one = new BigDecimal(1);
		double tmpv = v;
		for (O o : l) {
			if (tmpv == 0 || (tmpv == 1 && o.t == 2)) {
				break;
			}
			tmpv -= o.t;
			vmax = vmax.add(one);
		}
		Collections.sort(l, new Comparator<O>() {
			public int compare(O o1, O o2) {
				double r2 = ((double) o2.c) / o2.t;
				double r1 = ((double) o1.c) / o1.t;
				return r2 - r1 > 0 ? 1 : r2 - r1 < 0 ? -1 : 0;
			}
		});
		int cmax = 0;
		for (O o : l) {
			if (v < 1) {
				break;
			}
			if (v == 1 && o.t != 1) {
				continue;
			}
			v -= o.t;
			cmax += o.c;
		}
		System.out.println(cmax);
		System.out.println(vmax);
	}

	private static class O {
		int t;
		int c;
	}
}
