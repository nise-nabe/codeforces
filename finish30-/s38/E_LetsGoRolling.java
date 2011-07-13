package s38;
import java.util.*;

class E_LetsGoRolling {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[][] marbles = new long[n][2];
		for (int i = 0; i < n; ++i) {
			marbles[i][0] = s.nextLong();
			marbles[i][1] = s.nextLong();
		}
		Arrays.sort(marbles, new Comparator<long[]>() {
			public int compare(long[] o1, long[] o2) {
				return (int) (o1[0] - o2[0]);
			}
		});
		long[] cost = new long[n+1];
		for (int i = n; i-- > 0;) {
			long sum = 0;
			cost[i] = Long.MAX_VALUE;
			for(int j = i; j < n; ++j){
				sum += marbles[j][0]-marbles[i][0];
				cost[i] = Math.min(cost[i], cost[j+1] + sum + marbles[i][1]);
			}
		}
		System.out.println(cost[0]);
	}
}
