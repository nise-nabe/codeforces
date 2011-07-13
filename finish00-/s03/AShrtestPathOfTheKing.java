package s03;
import java.util.ArrayList;
import java.util.Scanner;

public class AShrtestPathOfTheKing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] k = scan.next().toCharArray();
		char[] q = scan.next().toCharArray();
		ArrayList<String> list = new ArrayList<String>();
		while (q[0] != k[0] || q[1] != k[1]) {
			String m = "";
			if (q[0] - k[0] > 0) {
				m += "L";
				k[0]++;
			} else if (q[0] - k[0] < 0) {
				m += "R";
				k[0]--;
			}
			if (q[1] - k[1] > 0) {
				m += "D";
				k[1]++;
			} else if (q[1] - k[1] < 0) {
				m += "U";
				k[1]--;
			}

			list.add(m);
		}
		System.out.println(list.size());
		for (String s : list) {
			System.out.println(s);
		}
	}
}
