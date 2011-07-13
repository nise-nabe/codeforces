package s37;
import java.util.*;

public class A_Towers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[1001];
		for(int i = 0; i < n; ++i){
			++a[s.nextInt()];
		}
		int c = 0, m = 0;
		for(int b : a){
			m = Math.max(m, b);
			if(b > 0){
				++c;
			}
		}
		System.out.println(m + " "+ c);
	}
}
