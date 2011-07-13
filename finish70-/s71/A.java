package s71;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(), y = s.nextInt();
		for (;;) {
			int rx = 0, ry = 0;
			for (int i = 0; i < 3; ++i) {
				if (x >= i && 22 - 10 * i <= y) {
					rx = i;
					ry = 22 - 10 * i;
				}
			}
			if (rx == 0 && ry == 0) {
				System.out.println("Hanako");
				return;
			}
			x -= rx;
			y -= ry;
			rx = 0;
			ry = 0;
			for (int i = 2; i >= 0; --i) {
				if (x >= i && 22 - 10 * i <= y) {
					rx = i;
					ry = 22 - 10 * i;
				}
			}
			if (rx == 0 && ry == 0) {
				System.out.println("Ciel");
				return;
			}
			x -= rx;
			y -= ry;
		}
	}
}
