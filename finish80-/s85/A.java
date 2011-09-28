package s85;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println((int)Math.signum(s.nextLine().toLowerCase().compareTo(s.nextLine().toLowerCase())));
	}
}