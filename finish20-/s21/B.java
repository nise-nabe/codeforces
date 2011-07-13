package s21;
import java.util.Arrays;
import java.util.Scanner;
import static java.math.BigInteger.*;

public class B {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		double[] l1 = new double[3];
		double[] l2 = new double[3];
		for (int i = 0; i < 3; ++i) {
			l1[i] = scan.nextDouble();
		}
		for (int i = 0; i < 3; ++i) {
			l2[i] = scan.nextDouble();
		}
		double[] zero = new double[] { 0, 0, 0 };
		if (Arrays.equals(l1, zero) || Arrays.equals(l2, zero)) {
			System.out.println(-1);
			return;
		}

		double gcd1 = valueOf((long) l1[0]).gcd(valueOf((long) l1[1]))
				.doubleValue();
		double gcd2 = valueOf((long) l2[0]).gcd(valueOf((long) l2[1]))
				.doubleValue();

		for (int i = 0; i < 3; ++i) {
			l1[i] /= gcd1;
		}
		for (int i = 0; i < 3; ++i) {
			l2[i] /= gcd2;
		}

		if (Arrays.equals(l1, l2)) {
			System.out.println(-1);
		} else if (new Double(l1[0]).equals(l2[0])
				&& new Double(l1[1]).equals(l2[1])) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}

	}

}
