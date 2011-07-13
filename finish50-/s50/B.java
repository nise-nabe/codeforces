package s50;
import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt(), B = s.nextInt();
		pics = new char[A][];
		for (int i = 0; i < A; ++i) {
			pics[i] = s.next().toCharArray();
		}
		int count = 0;
		int min = Integer.MAX_VALUE;
		int rx = 0, ry = 0;
		for (int x : div(A)) {
			l: for (int y : div(B)) {
				List<Piece> list = new ArrayList<Piece>();
				for (int i = 0; i < A; i += x) {
					for (int j = 0; j < B; j += y) {
						list.add(new Piece(cut(i, j, x, y)));
					}
				}
				for (int i = 0; i < list.size(); ++i) {
					for (int j = i + 1; j < list.size(); ++j) {
						if (list.get(i).equals(list.get(j))) {
							continue l;
						}
					}
				}
				++count;
				if (min > x * y) {
					min = x * y;
					rx = x;
					ry = y;
				}else if(min == x * y && rx > x){
					rx = x;
					ry = y;
				}
			}
		}
		System.out.println(count);
		System.out.println(rx + " " + ry);
	}

	static Set<Integer> div(int n) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(n);
		for (int i = 2, j = n; i < j; i++) {
			if (n % i == 0) {
				set.add(i);
				set.add(j = n / i);
			}
		}
		return set;
	}

	static char[][] pics;

	static char[][] cut(int ri, int rj, int x, int y) {
		char[][] result = new char[x][y];
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				result[i][j] = pics[ri + i][rj + j];
			}
		}
		return result;
	}

	static class Piece {
		char[][] cs;

		public Piece(char[][] cs) {
			this.cs = cs;
		}

		@Override
		public boolean equals(Object obj) {
			Piece p = (Piece) obj;

			char[][] tmp = new char[cs.length][cs[0].length];
			if (cs.length == cs[0].length) {
				for(int i = 0; i < cs.length; ++i){
					for(int j = 0; j < cs[0].length; ++j){
						tmp[i][j] = cs[i][j];
					}
				}
				for (int c = 0; c < 4; ++c) {
					char[][] tmp2 = new char[cs.length][cs[0].length];
					for (int i = 0; i < cs.length; ++i) {
						for (int j = 0; j < cs[0].length; ++j) {
							tmp2[i][j] = tmp[cs[0].length - j - 1][i];
						}
					}
					if (Arrays.deepEquals(tmp2, p.cs)) {
						return true;
					}
					tmp = tmp2;
				}
			} else {
				if(Arrays.deepEquals(cs, p.cs)){
					return true;
				}
				for (int i = 0; i < cs.length; ++i) {
					for (int j = 0; j < cs[0].length; ++j) {
						tmp[i][j] = cs[cs.length - i - 1][cs[0].length - j - 1];
					}
				}
				if(Arrays.deepEquals(tmp, p.cs)){
					return true;
				}

			}
			return false;
		}
		@Override
		public String toString() {
			return Arrays.deepToString(cs);
		}
		
	}
}
