package s06;
import java.util.Scanner;

public class CAliceBobandChocolate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		String[] chocos = scan.nextLine().split(" ");
		int a = 0;
		int b = 0;
		int ai = 0;
		int bi = chocos.length - 1;
		while (ai <= bi) {
			if (a <= b) {
				a += new Integer(chocos[ai]);
				ai++;
			} else if (a > b) {
				b += new Integer(chocos[bi]);
				bi--;
			}
		}
		System.out.println(ai + " " + (chocos.length - bi - 1));
	}
}
