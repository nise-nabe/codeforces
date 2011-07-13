package s01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BWron {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pattern rc_style = Pattern.compile("R[0-9]+C[0-9]+");
		int n = input.nextInt();

		while (n-- > 0) {
			String str = input.next();
			Matcher m = rc_style.matcher(str);

			if (m.matches()) {
				String nums[] = str.split("[RC]");
				String row = nums[1];
				String col = nums[2];

				String buffer = "";
				int col_num = Integer.valueOf(col);
				while (col_num > 0) {
					if (col_num % 26 > 0) {
						buffer += (char) (col_num % 26 + 'A' - 1);
						col_num /= 26;
					} else {
						buffer += 'Z';
						col_num /= 26;
						col_num--;
					}
				}

				for (int i = buffer.length() - 1; i >= 0; i--)
					System.out.print(buffer.charAt(i));

				System.out.println(row);

			} else {
				String col = str.split("[0-9]+")[0];
				String row = str.split("[A-Z]+")[1];

				int col_num = 0;
				int shift = 1;
				for (int i = col.length() - 1; i >= 0; i--) {
					col_num += (int) (col.charAt(i) - 'A' + 1) * shift;
					shift *= 26;
				}

				System.out.println("R" + row + "C" + col_num);
			}
		}
	}
	// public static void main(String[] args) {
	// Scanner scan = new Scanner(System.in);
	// System.out.println(scan.delimiter());
	// }
}
