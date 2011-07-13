package s45;
import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] c = new int[10001];
		for (int i = 0; i < n; ++i) {
			a[i] = ++c[s.nextInt()];
		}
		for(int i = 2; i < c.length; ++i){
			if(c[i-1] < c[i]){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(c[1]);
		System.out.println(Arrays.toString(a).replaceAll("[\\[\\],]", ""));
	}
}
