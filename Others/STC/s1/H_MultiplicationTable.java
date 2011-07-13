package STC.s1;
public class H_MultiplicationTable {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		for (int i = 1; i < n; ++i) {
			for (int j = 1; j < n; ++j) {
				System.out.print(Integer.toString(i * j, n) + " ");
			}
			System.out.println();
		}
	}
}
