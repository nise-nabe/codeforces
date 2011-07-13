package s06;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BPresidentsOffice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] stage = new String[scan.nextInt()];
		scan.nextInt();
		String pris = scan.next();
		scan.nextLine();
		for (int i = 0; i < stage.length; i++) {
			stage[i] = scan.nextLine();
		}
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < stage.length; i++) {
			char[] cs = stage[i].toCharArray();
			for (int j = 0; j < cs.length; j++) {
				String cStr = "" + cs[j];
				if (pris.equals(cStr)) {
					if (i - 1 >= 0) {
						set.add("" + stage[i - 1].charAt(j));
					}
					if (i + 1 < stage.length) {
						set.add("" + stage[i + 1].charAt(j));
					}
					if (j - 1 >= 0) {
						set.add("" + stage[i].charAt(j - 1));
					}
					if (j + 1 < cs.length) {
						set.add("" + stage[i].charAt(j + 1));
					}
				}
			}
		}
		System.out.println((set.size() - (set.contains(".") ? 1 : 0) - (set
				.contains(pris) ? 1 : 0)));
	}
}
