package s40;
import java.util.*;

public class D {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), k = s.nextInt() + 1;
		// n m = 2-100, k = 0-10
		char[][] board = new char[n][];
		for (int i = 0; i < n; ++i) {
			board[i] = s.next().toCharArray();
		}
	}
}
