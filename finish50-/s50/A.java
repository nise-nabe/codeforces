package s50;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		int c = s.nextInt();
		int a = 0;
		int result = 0;
		for(int i = 0; i < c; ++i){
			int x = s.nextInt();
			int d = x - a;
			result += d / k + (d % k > 0 ? 1 : 0);
			a = x;
		}
		System.out.println(result + (n-a) / k);
	}
}
