package s39;
import java.util.*;

class A_Color {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x = s.nextInt(), y = s.nextInt();
		double d = Math.sqrt(x * x + y * y) % 2;
		if (d == (int) d) {
			System.out.println("black");
		} else if (Math.signum(x * y) < 0) {
			System.out.println(d < 1 ? "white" : "black");
		} else {
			System.out.println(d > 1 ? "white" : "black");
		}
	}
}
