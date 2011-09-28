package s87;
import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = s.nextInt();
		}
		int max = 0;
		for(int i = 0; i < n; ++i){
			max = Math.max(max, f(i, 1));
		}
		System.out.println(max);
	}
	static int[] a;
	static int f(int i, int d){
		if(a[i] < 0){
			return d;
		}else{
			return f(a[i]-1, d + 1);
		}
	}
}
