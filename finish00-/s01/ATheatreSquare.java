package s01;
import java.math.BigDecimal;
import java.util.Scanner;

public class ATheatreSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		n = n / a + ((n % a) != 0 ? 1 : 0);
		m = m / a + ((m % a) != 0 ? 1 : 0);
		BigDecimal result = new BigDecimal(n).multiply(new BigDecimal(m));
		System.out.println(result);
	}
}
