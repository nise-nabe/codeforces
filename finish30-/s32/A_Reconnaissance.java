package s32;
import java.util.*;

public class A_Reconnaissance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), d = s.nextInt(), sum = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
			for (int j = 0; j < i; ++j) {
				if (Math.abs(a[i] - a[j]) <= d) {
					sum += 2;
				}
			}
		}
		System.out.println(sum);
	}
}
