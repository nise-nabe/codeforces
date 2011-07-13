package s24;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<List<int[]>> a = new ArrayList<List<int[]>>();
		for(int i = 0; i < n; ++i){
			a.add(new ArrayList<int[]>());
		}
		for (int i = 0; i < n; ++i) {
			int u = s.nextInt() - 1, v = s.nextInt() - 1, c = s.nextInt();
			a.get(u).add(new int[]{v, 0});
			a.get(v).add(new int[]{u, c});
		}
		int result = Integer.MAX_VALUE;
		for(int[] x : a.get(0)){
			int r = x[1], p = 0;
			for(int i = x[0]; i != 0; ){
				for(int[] y : a.get(i)){
					if(y[0]!=p){
						p = i;
						i = y[0];
						r += y[1];
						break;
					}
				}
			}
			result = Math.min(result, r);
		}
		System.out.println(result);
	}

}
