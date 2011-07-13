package STC.s1;
import java.util.*;

public class D_CubicalPlanet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[3];
		for (int n = 3; n-- > 0;) {
			a[n] = s.nextInt();
		}
		String result = "NO";
		for (int n = 3; n-- > 0;) {
			if(a[n]==s.nextInt()){
				result = "YES";
				break;
			}
		}
		System.out.println(result);
	}
}
