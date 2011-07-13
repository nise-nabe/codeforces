package s06;
import java.util.Arrays;
import java.util.Scanner;

public class ATriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] is = new int[4];
		for (int i = 0; i < 4; i++) {
			is[i] = scan.nextInt();
		}
		Arrays.sort(is);
		if (is[0] + is[1] > is[2] || is[0] + is[2] > is[3]
				|| is[1] + is[2] > is[3]) {
			System.out.println("TRIANGLE");
		} else if (is[0] + is[1] == is[2] || is[0] + is[2] == is[3]
				|| is[1] + is[2] == is[3]) {
			System.out.println("SEGMENT");
		} else {
			System.out.println("IMPOSSIBLE");
		}

	}
}
