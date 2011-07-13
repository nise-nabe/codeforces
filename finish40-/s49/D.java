package s49;
import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n+1];
		for (int i = 1; i <= n; ++i) {
			a[i] = s.nextInt();
		}
		int[] b = new int[n+1];
		for (int i = 1; i <= n; ++i) {
			b[i] = s.nextInt();
		}
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 1; i <= n; ++i) {
			int j = i + 1;
			for (; j <= n; ++j) {
				if (a[i] == b[j]) {
					break;
				}
			}
			for (; j <= n && j != i; --j) {
				list.add(new int[] { j - 1, j});
				swap(b, j - 1, j);
			}
		}
		System.out.println(list.size());
		for (int[] is : list) {
			System.out.println(is[0] + " " + is[1]);
		}
	}

	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	static double det(double[][] a) {
		int n = a.length;
		double det = 1;
		for(int i = 0; i < n - 1; ++i){
			for(int j = i + 1; j < n - 1; ++j){
				double buf = a[j][i] / a[i][i];
				for(int k = 0; k < n - 1; ++k){
					a[j][k] -= a[i][k] * buf;
				}
			}
		}
		for(int i = 0; i < n - 1; ++i){
			det *= a[i][i];
		}
		return det;
	}
}
