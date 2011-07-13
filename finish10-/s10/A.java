package s10;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		int p3 = scan.nextInt();
		int t1 = scan.nextInt();
		int t2 = scan.nextInt();
		scan.nextLine();
		int count = 0;
		String[] rl = scan.nextLine().split(" ");
		int r1 = new Integer(rl[0]);
		int l1 = new Integer(rl[1]);
		count += (l1 - r1) * p1;
		for (int i = 1; i < n; i++) {
			rl = scan.nextLine().split(" ");
			int r2 = new Integer(rl[0]);
			int l2 = new Integer(rl[1]);
			count += Math.max(Math.min(r2 - l1, t1), 0) * p1;
			count += Math.max(Math.min(r2 - l1 - t1, t2), 0) * p2;
			count += Math.max(r2 - l1 - t1 - t2, 0) * p3;
			count += (l2 - r2) * p1;
			l1 = l2;
		}
		System.out.println(count);
	}
}
