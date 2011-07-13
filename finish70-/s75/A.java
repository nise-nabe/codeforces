package s75;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		for (int i = 1; m - i >= 0; ++i) {
			m -= i;
			if(i >= n){
				i = 0;
			}
		}
		System.out.println(m);
	}
}
