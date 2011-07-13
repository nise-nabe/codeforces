package s46;
import java.util.*;

public class A {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine().replaceAll(" ", "").toLowerCase();
		System.out.println(Arrays.asList('a','i','u','e','o','y').contains(s.charAt(s.indexOf('?')-1))?"YES":"NO");
	}
}
