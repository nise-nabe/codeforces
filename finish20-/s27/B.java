package s27;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] a = new int[n][n];
		for (int i = n * (n - 1) / 2 - 1; i-- > 0;) {
			int x = s.nextInt() - 1, y = s.nextInt() - 1;
			a[x][y] = a[y][x] = 1;
		}
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				if (i != j && a[i][j] < 1) {
					for (int t = 0; t < n; ++t) {
						if(i!=t&&j!=t&&a[i][t]+a[j][t]>1){
							t=i;i=j;j=t;
						}
					}
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}
			}
		}
	}
}