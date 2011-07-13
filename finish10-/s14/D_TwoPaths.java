package s14;
import java.util.*;

public class D_TwoPaths {
	public static void main(String[] z) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		edges = new ArrayList<List<Integer>>();
		for(int i=0;i<n;++i){
			edges.add(new ArrayList<Integer>());
		}
		for(;n-->1;){
			int u=s.nextInt()-1,v=s.nextInt()-1;
			edges.get(u).add(v);
			edges.get(v).add(u);
		}
		int res=0;
		for(int i=0;i<edges.size();++i){
			for(int t:edges.get(i)){
				res=Math.max(res,maxPath(i,t)[0]*maxPath(t,i)[0]);
			}
		}
		System.out.println(res);
	}
	static List<List<Integer>> edges;
	static int[] maxPath(int v, int prev){
		Integer[] d = {0,0,0};
		int res = 0;
		for(int t:edges.get(v)){
			if(t!=prev){
				int[]r=maxPath(t,v);
				res=Math.max(res,r[0]);
				d[2]=r[1];
				Arrays.sort(d,Collections.reverseOrder());
			}
		}
		res = Math.max(res,d[0]+d[1]);
		return new int[]{res, d[0]+1};
	}
}