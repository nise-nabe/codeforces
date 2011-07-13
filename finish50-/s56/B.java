package s56;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt(), n = s.nextInt(), m = s.nextInt();
		boolean b[][][] = new boolean[k][n][m];
		for (int t = 0; t < k; ++t) {
			for (int i = 0; i < n; ++i) {
				char[] cs = s.next().toCharArray();
				for (int j = 0; j < m; ++j) {
					b[t][i][j] = cs[j] == '.';
				}
			}
		}
		int[] dz = { -1, 1, 0, 0, 0, 0 };
		int[] dx = { 0, 0, -1, 1, 0, 0 };
		int[] dy = { 0, 0, 0, 0, -1, 1 };
		Deque<int[]> q = new ArrayDeque<int[]>();
		q.add(new int[] { 0, s.nextInt()-1, s.nextInt()-1 });
		int c = 0;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int z = p[0], x = p[1], y = p[2];
			if (0<=z&&z<k&&0<=x&&x<n&&0<=y&&y<m&&b[z][x][y]) {
				b[z][x][y]=false;
				++c;
				for(int i = 0; i < 6; ++i){
					q.add(new int[]{z+dz[i],x+dx[i],y+dy[i]});
				}
			}
		}
		System.out.println(c);
	}
}
