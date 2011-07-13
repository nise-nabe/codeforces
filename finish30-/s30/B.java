package s30;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String[] as = s.next().split("\\.");
		int[]a=new int[]{new Integer(as[0]),new Integer(as[1]),new Integer(as[2])};
		String[] bs = s.next().split("\\.");
		int[]b=new int[]{new Integer(bs[0]),new Integer(bs[1]),new Integer(bs[2])};
		int[][] pat = new int[][] { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 0, 2 },
				{ 1, 2, 0 }, { 2, 0, 1 }, { 2, 1, 0 } };
		for (int[] p1 : pat) {
			for (int[] p2 : pat) {
				if (p1 != p2 && isValid(a[p1[0]], a[p1[1]], a[p1[2]]) && isValid(b[p2[0]], b[p2[1]], b[p2[2]])) {
					long x = format(a[p1[0]], a[p1[1]], a[p1[2]]);
					long y = format(b[p2[0]], b[p2[1]], b[p2[2]] + 18);
					if (x >= y) {
						System.out.println("YES");
						return;
					}
				}
			}
		}
		System.out.println("NO");
	}
	
	private static boolean isValid(int day, int month, int year){
		return 0<month&&month<13&&day<=m[month]-m[month-1]+(month==2&&year%4<1?1:0);
	}

	private static int format(int day, int month, int year) {
		return day + m[month-1] + 365 * year + year / 4;
	}

	static int[] m = new int[] { 0, 31, 59, 90, 120, 151, 181, 212, 243,
			273, 304, 334 };
}
