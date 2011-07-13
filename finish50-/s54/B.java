package s54;
public class B {
	public static void main(String[] args) {
		for (int i, n = new java.util.Scanner(System.in).nextInt(); n > 0; n = i) {
			System.out.print(n + " ");
			for (i = n - 1; i > 0 && n % i != 0; --i) ;
		}
		System.out.println();
	}
}
