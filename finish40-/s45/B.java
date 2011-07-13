package s45;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		int[][] v = new int[n+1][m+1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				v[i][j] = v[i-1][j] + v[i][j-1] -v[i-1][j-1] + s.nextInt();
			}
		}
		int a = s.nextInt(), b = s.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = a; i <= n; ++i){
			for(int j = b; j <= m; ++j){
				min = Math.min(min, v[i][j] - v[i-a][j] - v[i][j-b] + v[i-a][j-b]);
			}
		}
		for(int i = b; i <= n; ++i){
			for(int j = a; j <= m; ++j){
				min = Math.min(min, v[i][j] - v[i-b][j] - v[i][j-a] + v[i-b][j-a]);
			}
		}
		System.out.println(min);
	}
}
