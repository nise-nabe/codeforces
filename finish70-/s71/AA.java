package s71;
import java.util.*;

public class AA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(), y = s.nextInt();
		for (;;) {
			int r = 0;
			for (int a = 0; a <= 100 * x + 10 * y; a += 220) {
				if (a / 100 > r && a / 100 <= x && (a % 100) / 10 <= y) {
					r = a;
				}
			}
			if (r == 0) {
				System.out.println("Hanako");
				return;
			}
			x -= r / 100;
			y -= (r % 100) / 10;
			r = 0;
			int rx = 0, ry = 0;
			for (int a = 0; a <= 100 * x + 10 * y; a += 220) {
				for(int b = Math.min(a % 10, y); b >= ry; --b){
					int tmp = a - 10 * b;
					if(tmp % 100 == 0 && tmp / 100 >= x ){
						rx = tmp / 100;
						ry = b;
					}
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
