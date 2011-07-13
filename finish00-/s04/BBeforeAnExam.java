package s04;
import java.util.ArrayList;
import java.util.Scanner;

public class BBeforeAnExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int sumTimes = scan.nextInt();
		ArrayList<O> list = new ArrayList<O>();
		int sumMax = 0;
		for (; d > 0; d--) {
			int min = scan.nextInt();
			int max = scan.nextInt();
			list.add(new O(min, max));
			sumMax += max;
		}
		if (sumMax < sumTimes) {
			System.out.println("NO");
			return;
		}
		while (sumTimes < sumMax) {
			int i;
			for (i = 0; i < list.size(); i++) {
				O o = list.get(i);
				if (o.value > o.min) {
					o.value--;
					sumMax--;
					break;
				}
			}
			if (i == list.size()) {
				System.out.println("NO");
				return;
			}
		}
		String result = list.toString();
		result = result.replaceAll("[\\[\\],]", "");
		System.out.println("YES");
		System.out.println(result);
	}

	private static class O {
		public int min;
		public int max;
		public int value;

		public O(int min, int max) {
			this.min = min;
			this.max = max;
			this.value = max;
		}

		@Override
		public String toString() {
			return "" + value;
		}
	}
}
