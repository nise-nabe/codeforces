package s15;
import java.math.BigDecimal;
import java.util.Scanner;
import static java.math.BigDecimal.*;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int t = scan.nextInt(); t-- > 0;) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int w = Math.min(x1, x2) + Math.min(n-x1, n-x2);
			int h = Math.min(y1, y2) + Math.min(m-y1, m-y2);
			int ww = Math.max(0, 2*w - n);
			int hh = Math.max(0, 2*h - m);
			System.out.println(mul(n,m).subtract(mul(w,h).multiply(valueOf(2))).add(mul(ww,hh)));
		}
	}
	static BigDecimal mul(int x, int y){
		return valueOf(x).multiply(valueOf(y));
	}
}
