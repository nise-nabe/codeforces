package s38;
import java.util.*;

public class A_Army {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 1; i < n; ++i) {
			a[i] = s.nextInt();
		}
		int sum = 0;
		for(int i = s.nextInt(),e = s.nextInt(); i < e; ++i){
			sum += a[i];
		}
		System.out.println(sum);
	}
}
