package s38;
import java.util.*;

public class B_Chess {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String str  = s.next();
		int rr = str.charAt(0) - 'a';
		int rc = str.charAt(1) - '1';
		str = s.next();
		int nr = str.charAt(0) - 'a';
		int nc = str.charAt(1) - '1';
		boolean[][] b = new boolean[8][8];
		for (int i = 0; i < 8; ++i) {
			b[rr][i] = true;
			b[i][rc] = true;
		}
		
		for(int[] pos : knight(rr, rc)){
			b[pos[0]][pos[1]]=true;
		}
		for(int[] pos : knight(nr, nc)){
			b[pos[0]][pos[1]]=true;
		}
		int count = 0;
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				if(!b[i][j]){
					++count;
				}
			}
		}
		System.out.println(count);
	}

	static List<int[]> knight(int row, int col) {
		List<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{row, col});
		if (row - 2 >= 0) {
			if (col + 1 < 8) {
				list.add(new int[] { row - 2, col + 1 });
			}
			if (col - 1 >= 0) {
				list.add(new int[] { row - 2, col - 1 });
			}
		}
		if (row - 1 >= 0) {
			if (col + 2 < 8) {
				list.add(new int[] { row - 1, col + 2 });
			}
			if (col - 2 >= 0) {
				list.add(new int[] { row - 1, col - 2 });
			}
		}
		if (row + 1 < 8) {
			if (col + 2 < 8) {
				list.add(new int[] { row + 1, col + 2 });
			}
			if (col - 2 >= 0) {
				list.add(new int[] { row + 1, col - 2 });
			}
		}
		if (row + 2 < 8) {
			if (col + 1 < 8) {
				list.add(new int[] { row + 2, col + 1 });
			}
			if (col - 1 >= 0) {
				list.add(new int[] { row + 2, col - 1 });
			}
		}
		return list;
	}
}
