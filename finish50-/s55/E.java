package s55;
import java.util.*;

public class E {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i <= n; ++i){
			list.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; ++i) {
			int u = s.nextInt(), v = s.nextInt();
			list.get(u).add(v);
			list.get(v).add(u);
		}
		
		Set<Is> tri = new HashSet<Is>();
		for (int i = 0; i < k; ++i) {
			tri.add(new Is( s.nextInt(), s.nextInt(), s.nextInt() ));
		}
		boolean[][] used = new boolean[n+1][n+1];
		int[][] prev = new int[n+1][n+1];
		Deque<int[]> q = new ArrayDeque<int[]>();
		list.get(0).add(1);
		q.add(new int[]{0, 1});
		prev[0][1] = -1;
		while(!q.isEmpty()){
			int[] p = q.poll();
			if(p[1] == n){
				Deque<Integer> result = new ArrayDeque<Integer>();
				for(int i = p[0], j = p[1]; i > -1;){
					result.push(j);
					int t = j;
					j = i;
					i = prev[i][t];
				}
				System.out.println(result.size()-1);
				System.out.println(result.toString().replaceAll("[\\[\\],]",""));
				return ;
			}
			for(int u : list.get(p[1])){
				if(!used[p[1]][u] && !tri.contains(new Is(p[0], p[1], u))){
					used[p[1]][u] = true;
					prev[p[1]][u] = p[0];
					q.add(new int[]{p[1], u});
				}
			}
		}
		System.out.println("-1");
	}
	static class Is{
		int[] is;
		public Is(int a, int b, int c) {
			is = new int[]{a, b, c};
		}
		@Override
		public int hashCode() {
			return Arrays.hashCode(is);
		}
		@Override
		public boolean equals(Object obj) {
			return Arrays.equals(is, ((Is)obj).is);
		}
	}
}
