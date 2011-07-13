package s41;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), v = s.nextInt();
		int[] a = new int[n];
		double[] b = new double[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
		}
		double min = Double.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			min = Math.min(min, b[i] = s.nextDouble() / a[i]);
		}
		double result = 0;
		for(int i : a){
			result += i*min;
		}
		System.out.println(Math.max(0, Math.min(result, v)));
	}
}
