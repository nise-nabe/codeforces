package s38;
import java.util.*;

public class C_Blinds {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), l = s.nextInt();
		int[] a = new int[n];
		int max = 0;
		for (int i = 0; i < n; ++i) {
			int v = s.nextInt();
			max = Math.max(max, a[i] = v);
		}
		int result = 0;
		for (;l <= max; ++l) {
			int count = 0;
			for(int b : a){
				count += b / l;
			}
			result = Math.max(result, l * count);
		}
		System.out.println(result);
	}
}
