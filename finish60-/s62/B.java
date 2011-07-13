package s62;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double k = 1 - s.nextInt() / 100., ds[] = new double[n], y = 0;
		for (; n-- > 0;) {
			y += ds[n] = s.nextInt();
		}
		for (double x = 0;;) {
			double v = (x + y) / 2, f = 0, g = 0;
			for (double d : ds) {
				if(d > v){
					f += (d - v) * k;
				}else{
					g += v - d;
				}
			}
			if(Math.abs(f - g) < 1e-7){
				System.out.printf("%.6f\n", v);
				break;
			}else if(f - g > 0){
				x = v;
			}else{
				y = v;
			}
			
		}
	}
}
