package s23;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class C {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = new Integer(br.readLine()); t-- > 0;) {
			int n = new Integer(br.readLine());
			int[] apps = new int[2 * n];
			int[] orans = new int[2 * n];
			BigInteger[] sums = new BigInteger[2];
			sums[0]=sums[1] = BigInteger.ZERO;
			
			for (int i = 1; i < 2 * n; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				sums[0] = sums[0].add(BigInteger
						.valueOf(apps[i] = new Integer(st.nextToken())));
				sums[1] = sums[1].add(BigInteger
						.valueOf(orans[i] = new Integer(st.nextToken())));
			}
			BigInteger[] means = new BigInteger[2];
			for (int j = 0; j < 2; ++j) {
				sums[j] = sums[j].divide(BigInteger.valueOf(2));
				means[j] = sums[j].divide(BigInteger.valueOf(n));
			}
			List<Integer> both = new ArrayList<Integer>();
			List<Integer> apples = new ArrayList<Integer>();
			List<Integer> oranges = new ArrayList<Integer>();
			List<Integer> neigher = new ArrayList<Integer>();
			for (int i = 1; i < 2 * n; ++i) {
				if (apps[i] >= means[0].intValue()
						&& orans[i] >= means[1].intValue()) {
					both.add(i);
				} else if (apps[i] >= means[0].intValue()
						&& orans[i] < means[1].intValue()) {
					apples.add(i);
				} else if (apps[i] < means[0].intValue()
						&& orans[i] >= means[1].intValue()) {
					oranges.add(i);
				} else {
					neigher.add(i);
				}
			}
			List<Integer> ans = both.subList(0, Math.min(both.size(), n));
			BigInteger[] ansSum = new BigInteger[2];
			ansSum[0] = ansSum[1] = BigInteger.ZERO;
			for(int a : ans){
				ansSum[0] = ansSum[0].add(BigInteger.valueOf(apps[a]));
				ansSum[1] = ansSum[1].add(BigInteger.valueOf(orans[a]));
				apps[a] = orans[a] = 0;
			}
			while (ans.size() < n) {
				int i = sums[0].subtract(ansSum[0]).compareTo(sums[1].subtract(ansSum[1])) < 0 ? maxIndex(apps) : maxIndex(orans);
				if(i < 0){
					break;
				}
				ansSum[0] = ansSum[0].add(BigInteger.valueOf(apps[i]));
				ansSum[1] = ansSum[1].add(BigInteger.valueOf(orans[i]));					
				apps[i] = orans[i] = 0;
				ans.add(i);
			}
			if(ans.size() == n){
				Collections.sort(ans);
				System.out.println("YES");
				System.out.println(ans.toString().replaceAll("[\\[\\],]", ""));
			}else{
				System.out.println("NO");
				System.out.println();
			}
		}
	}
	static int maxIndex(int[] is) {
		int m = 0;
		int r = -1;
		for (int i = 0; i < is.length; ++i){
			if(m > is[i]){
				m = is[i];
				r = i;
			}
		}
		return r;
	}
	
}
