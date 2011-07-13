package s34;
import java.util.*;

public class D_RoadMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), r1 = s.nextInt(), r2 = s.nextInt();
		List<List<Integer>>list=new ArrayList<List<Integer>>();
		for(int i=0;i<=n;++i){
			list.add(new ArrayList<Integer>());
		}
		for (int i = 1; i <= n; ++i) {
			if (r1 != i) {
				int v=s.nextInt();
				list.get(i).add(v);
				list.get(v).add(i);
			}
		}
		int[]b=new int[n+1];
		b[r2]=r2;
		Queue<int[]>q=new LinkedList<int[]>();
		for(int i : list.get(r2)){
			q.add(new int[]{i,r2});
		}
		while(!q.isEmpty()){
			int[]v=q.poll();
			b[v[0]]=v[1];
			for(int i : list.get(v[0])){
				if(b[i]<1){
					q.add(new int[]{i,v[0]});
				}
			}
		}
		StringBuilder result = new StringBuilder();
		for(int i=1;i<=n;++i){
			if(i!=r2){
				result.append(b[i]+" ");
			}
		}
		System.out.println(result.toString().trim());
	}
}
