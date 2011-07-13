package s58;
import java.util.*;

public class A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int gl = s.nextInt(), gr = s.nextInt();
		int bl = s.nextInt(), br = s.nextInt();

		System.out.println((gl <= br + 1 && br <= 2 * (gl + 1)) || (gr <= bl + 1 && bl <= 2 * (gr + 1)) ? "YES" : "NO");
	}
}
