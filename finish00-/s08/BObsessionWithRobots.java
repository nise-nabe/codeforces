package s08;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BObsessionWithRobots {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String line = scan.nextLine();
		int x = 0;
		int y = 0;
		List<List<Integer>> log = new ArrayList<List<Integer>>();
		for (char c : line.toCharArray()) {
			log.add(Arrays.asList(x, y));
			switch (c) {
			case 'L':
				x -= 1;
				break;
			case 'R':
				x += 1;
				break;
			case 'U':
				y -= 1;
				break;
			case 'D':
				y += 1;
				break;
			}
			if (log.contains(Arrays.asList(x, y))
					|| (c != 'L' && log.contains(Arrays.asList(x + 1, y)))
					|| (c != 'R' && log.contains(Arrays.asList(x - 1, y)))
					|| (c != 'U' && log.contains(Arrays.asList(x, y + 1)))
					|| (c != 'D' && log.contains(Arrays.asList(x, y - 1)))) {
				out.println("BUG");
				out.flush();
				return;
			}
		}
		out.println("OK");
		out.flush();
	}
}
