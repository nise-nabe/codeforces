package s87;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		char[][] a = new char[n][];
		pigs = new boolean[n+2][m+2];
		List<int[]>wolves = new ArrayList<int[]>();
		for (int i = 0; i < n; ++i) {
			a[i] = s.next().toCharArray();
			for(int j = 0; j < m; ++j){
				if(a[i][j] == 'W'){
					wolves.add(new int[]{i, j});
				}else if(a[i][j] == 'P'){
					pigs[i + 1][j + 1] = true;
				}
			}
		}
		B.wolves = wolves.toArray(new int[0][]);
		System.out.println(f(0, 0));
	}

	static int[][] wolves;
	static boolean[][] pigs;
	static int[] dx = { 0, 1, -1, 0 };
	static int[] dy = { 1, 0, 0, -1 };

	static int f(int w, int sum) {
		if (w == wolves.length) {
			return sum;
		}
		int max = 0;
		int[] wolf = wolves[w];
		for (int i = 0; i < 4; ++i) {
			boolean p = pigs[wolf[0] + dx[i] + 1][wolf[1] + dy[i] + 1];
			if (p) {
				sum += 1;
				pigs[wolf[0] + dx[i] + 1][wolf[1] + dy[i] + 1] = false;
			}
			max = Math.max(max, f(w + 1, sum));
			if (p) {
				sum -= 1;
				pigs[wolf[0] + dx[i] + 1][wolf[1] + dy[i] + 1] = true;
			}
		}
		return max;
	}
}
