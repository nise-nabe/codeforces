package s25;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		for (int[] b : a) {
			Arrays.fill(b, 2*n);
		}
		for (int i = 0; i < n; ++i) {
			a[i][i] = 0;
		}
		List<List<Integer>> edges = new ArrayList<List<Integer>>();
		int[] en = new int[n];
		for (int i = n; i-- > 1;) {
			int x = scan.nextInt() - 1, y = scan.nextInt() - 1;
			a[x][y] = a[y][x] = 1;
			edges.add(Arrays.asList(x,y));
			en[x]++;
			en[y]++;
		}
		f(n, a);
		for(int[] b : a){
			System.out.println(Arrays.toString(b));
		}
	}
	
	private static void f(int n, int[][] a) {
		for (int t = 0; t < n; ++t) {
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i][j] > a[i][t] + a[t][j]) {
						a[i][j] = a[i][t] + a[t][j];
					}
				}
			}
		}
	}

}
