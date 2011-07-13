package s07;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AKalevitchAndChess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < 8; i++) {
			String line = scan.nextLine();
			if (flag && line.contains("W")) {
				count += Collections.frequency(Arrays.asList(line.split("")),
						"B");
				flag = false;
			} else if (!line.contains("W")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
